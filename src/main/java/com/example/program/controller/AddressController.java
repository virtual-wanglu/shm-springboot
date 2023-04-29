package com.example.program.controller;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.program.entity.Address;
import com.example.program.mapper.AddressMapper;
import com.example.program.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @Autowired
    AddressMapper addressMapper;


    @PostMapping("/user")
    public List<Address> getUserAddress(@RequestBody String openid) {
        System.out.println(openid);
        QueryWrapper<Address> queryWrapper = new QueryWrapper<>();
        queryWrapper.select().eq("open_id",openid);
        List<Address> list = addressMapper.selectList(queryWrapper);
        System.out.println(list);
        return list;
    }

    @PostMapping("/add")
    public void addUserAddress(@RequestBody Address address){
        String openid = address.getOpen_id();
        QueryWrapper<Address> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("open_id",openid);
        boolean flag= addressMapper.exists(queryWrapper);
        if (!flag){
            address.setIsDefault(1);
        }
        addressService.save(address);
    }
}
