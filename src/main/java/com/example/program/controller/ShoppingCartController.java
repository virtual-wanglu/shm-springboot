package com.example.program.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.program.entity.MyOrder;
import com.example.program.entity.MyShoppingCart;
import com.example.program.entity.Shopping;
import com.example.program.entity.Shoppingcart;
import com.example.program.mapper.ShoppingMapper;
import com.example.program.mapper.ShoppingcartMapper;
import com.example.program.service.ShoppingService;
import com.example.program.service.ShoppingcartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/shopping")
public class ShoppingCartController {

    @Autowired
    private ShoppingcartService shoppingcartService;

    @Autowired
    private ShoppingcartMapper shoppingcartMapper;

    @Autowired
    private ShoppingService shoppingService;

    @Autowired
    private ShoppingMapper shoppingMapper;

    @PostMapping("/addshoppingcart")
    public void addShoppingCart(@RequestBody JSONObject jsonParam) {
        String openid = jsonParam.getString("open_id");
        int shoppingId = jsonParam.getInteger("shoppingId");
        QueryWrapper<Shoppingcart> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("open_id", openid).eq("shoppingId", shoppingId);
        Shoppingcart shoppingcart = shoppingcartMapper.selectOne(queryWrapper);
        if (shoppingcart == null) {
            shoppingcart=new Shoppingcart();
            shoppingcart.setOpen_id(openid);
            shoppingcart.setShoppingId(shoppingId);
            shoppingcart.setShoppingNum(1);
            shoppingcartService.save(shoppingcart);
        }else {
            int count=shoppingcart.getShoppingNum()+1;
            shoppingcart.setShoppingNum(count);
            shoppingcartMapper.update(shoppingcart,queryWrapper);
        }
    }

    @PostMapping("/shoppingcart")
    public ArrayList<MyShoppingCart> getShoppingCartList(@RequestBody String openid) {
        ArrayList<MyShoppingCart> myShoppingCartList = new ArrayList<>();
        QueryWrapper<Shoppingcart> queryWrapperCart = new QueryWrapper<>();
        queryWrapperCart.eq("open_id", openid);
        List<Shoppingcart> list=shoppingcartMapper.selectList(queryWrapperCart);
        for (Shoppingcart item: list) {
            QueryWrapper<Shopping> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("shoppingId", item.getShoppingId());
            Shopping shopping=shoppingMapper.selectOne(queryWrapper);
            MyShoppingCart myShoppingCart = new MyShoppingCart();
            myShoppingCart.setNumber(item.getShoppingNum());
            myShoppingCart.setShoppingId(shopping.getShoppingId());
            myShoppingCart.setShoppingDesc(shopping.getShoppingDesc());
            myShoppingCart.setPrice(shopping.getPrice());
            myShoppingCart.setTag(shopping.getTag());
            myShoppingCart.setTitle(shopping.getTitle());
            myShoppingCart.setImgUrl1(shopping.getImgUrl1());
            myShoppingCart.setImgUrl2(shopping.getImgUrl2());
            myShoppingCart.setImgUrl3(shopping.getImgUrl3());
            myShoppingCartList.add(myShoppingCart);
        }
        return myShoppingCartList;
    }

    @PostMapping("/clear")
    public void clear(@RequestBody JSONObject jsonObject){
        String openid = jsonObject.getString("openid");
        ArrayList<MyOrder> list = new ArrayList<>();
        JSONArray array = JSONArray.parseArray(jsonObject.getString("goodsIds"));
        for (int i = 0; i < array.size(); i++) {
            QueryWrapper<Shoppingcart> queryWrapper = new QueryWrapper<>();
            queryWrapper.eq("open_id", openid).eq("shoppingId", array.getIntValue(i));
            shoppingcartService.remove(queryWrapper);
        }
    }
}
