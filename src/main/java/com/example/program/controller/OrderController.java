package com.example.program.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.program.entity.*;
import com.example.program.mapper.OrderMapper;
import com.example.program.mapper.ShoppingMapper;
import com.example.program.mapper.UserMapper;
import com.example.program.service.OrderService;
import com.example.program.service.ShoppingService;
import com.example.program.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private OrderService orderService;

    @Autowired
    private ShoppingMapper shoppingMapper;

    @Autowired
    private ShoppingService shoppingService;

    @PostMapping("/addOrder")
    public void addOrder(@RequestBody ArrayList<Order> list) {
        for (Order order : list) {
            QueryWrapper<Order> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("open_id", order.getOpen_id()).eq("shoppingId", order.getShoppingId()).eq("orderStatus", order.getOrderStatus());
            Order selectOrder = orderMapper.selectOne(queryWrapper);
            if (selectOrder != null) {
                int count = selectOrder.getQuantity() + order.getQuantity();
                selectOrder.setQuantity(count);
                Double payment = selectOrder.getPayment() + order.getPayment();
                selectOrder.setPayment(payment);
                orderMapper.update(selectOrder, queryWrapper);
            } else {
                orderService.save(order);
            }
        }
    }

    @PostMapping("/getOrder")
    public ArrayList<UserOrder> getOrderList(@RequestBody JSONObject jsonObject) {
        String openid = jsonObject.getString("openid");
        System.out.println(openid);
        ArrayList<UserOrder> list = new ArrayList<>();
        QueryWrapper<Order> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("open_id", openid).orderByDesc("orderId");
        List<Order> orderList = orderMapper.selectList(queryWrapper);
        for (Order order : orderList) {
            System.out.println(order);
            UserOrder userOrder = new UserOrder();
            QueryWrapper<Shopping> queryShopping = new QueryWrapper<>();
            queryShopping.eq("shoppingId", order.getShoppingId());
            Shopping shop = shoppingMapper.selectOne(queryShopping);
            userOrder.setOrderId(order.getOrderId());
            userOrder.setShoppingId(order.getShoppingId());
            userOrder.setImgUrl1(shop.getImgUrl1());
            userOrder.setTitle(shop.getTitle());
            userOrder.setPrice(order.getPayment());
            userOrder.setNumber(order.getQuantity());
            userOrder.setFreight(order.getFreight());
            userOrder.setInvoice(order.getInvoice());
            userOrder.setOrderNote(order.getOrderNote());
            userOrder.setStatus(order.getOrderStatus());
            list.add(userOrder);
        }
        return list;
    }

    @PostMapping("/cancel")
    public void cancelOrder(@RequestBody JSONObject jsonObject) {
        System.out.println(jsonObject);
        Integer orderId = jsonObject.getInteger("orderId");
        orderService.removeById(orderId);
    }

    @PostMapping("/pay")
    public String payOrder(@RequestBody JSONObject jsonObject) {
        String openid = jsonObject.getString("openid");
        Double payment = jsonObject.getDouble("payment");
        System.out.println(payment);
        Integer orderId = jsonObject.getInteger("orderId");
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("open_id",openid);
        User user = userMapper.selectOne(queryWrapper);
        if (user.getProperty()>=payment) {
            Double property = user.getProperty()-payment;
            System.out.println(property);
            user.setProperty(property);
            System.out.println(user.getProperty());
            userMapper.update(user,queryWrapper);
            Order order=orderMapper.selectById(orderId);
            order.setOrderStatus(2);
            orderMapper.updateById(order);
            return "ok";
        }else {
            return "below";
        }
    }

    @PostMapping("/confirm")
    public void confirm(@RequestBody JSONObject jsonObject) {
        Integer orderId = jsonObject.getInteger("orderId");
        QueryWrapper<Order> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("orderId",orderId);
        Order order = orderMapper.selectOne(queryWrapper);
        order.setOrderStatus(4);
        orderMapper.update(order,queryWrapper);
    }
}
