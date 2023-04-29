package com.example.program.controller;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.program.entity.*;
import com.example.program.mapper.AddressMapper;
import com.example.program.mapper.ShoppingMapper;
import com.example.program.mapper.ShoppingcartMapper;
import com.example.program.mapper.UserMapper;
import com.example.program.service.AddressService;
import com.example.program.service.ShoppingService;
import com.example.program.service.ShoppingcartService;
import com.example.program.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @Autowired
    private AddressService addressService;

    @Autowired
    private AddressMapper addressMapper;

    @Autowired
    private ShoppingcartMapper shoppingcartMapper;

    @Autowired
    private ShoppingcartService shoppingcartService;

    @Autowired
    private ShoppingMapper shoppingMapper;

    @Autowired
    private ShoppingService shoppingService;

    @PostMapping("/getAddress")
    public Address getUserAddress(@RequestBody String openid) {
        QueryWrapper<Address> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("open_id", openid).eq("isDefault", 1);
        Address address = addressService.getOne(queryWrapper);
        if (address == null) {
            return null;
        } else {
            return address;
        }
    }

    @PostMapping("/getUserGoods")
    public ArrayList<MyOrder> getUserGoodsList(@RequestBody JSONObject jsonObject) {
        ArrayList<MyOrder> list = new ArrayList<>();
        String openid = jsonObject.getString("open_id");
        JSONArray array = JSONArray.parseArray(jsonObject.getString("goodsIds"));
        ArrayList<Integer> goodsIds = new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            goodsIds.add(array.getIntValue(i));
        }
        for (Integer goodsId : goodsIds) {
            QueryWrapper<Shoppingcart> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("open_id", openid).eq("shoppingId", goodsId);
            Shoppingcart shoppingart = shoppingcartMapper.selectOne(queryWrapper);
            Shopping shopping = shoppingMapper.selectById(goodsId);
            MyOrder order = new MyOrder();
            order.setShoppingId(goodsId);
            order.setImgUrl1(shopping.getImgUrl1());
            order.setTitle(shopping.getTitle());
            order.setPrice(Double.valueOf(shopping.getPrice()));
            if (shoppingart == null) {
                order.setNumber(1);
            } else {
                order.setNumber(shoppingart.getShoppingNum());
            }
            order.setFreight("送运费险");
            order.setInvoice("电子发票-个人");
            order.setOrderNote("无备注");
            list.add(order);
        }
        return list;
    }


    @PostMapping("/submit")
    public void submit(@RequestBody JSONObject jsonObject) {
        String openid = jsonObject.getString("openid");
        Double price = jsonObject.getDouble("price");
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("open_id",openid);
        User user = userMapper.selectOne(queryWrapper);
        Double property=user.getProperty()-price;
        user.setProperty(property);
        userMapper.update(user,queryWrapper);
    }
}
