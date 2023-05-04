package com.example.program.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.program.entity.User;
import com.example.program.mapper.UserMapper;
import com.example.program.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserService userService;

    @Autowired
    private UserMapper userMapper;

    String AppId = "wx5cd6afe12ade2727";  //公众平台自己的appId
    String AppSecret = "eadfe65b718c370e00e708b2849fd144";  //AppSecret

    @PostMapping("/login")
    public User wxLogin(@RequestBody JSONObject jsonParam) {
        String code = jsonParam.getString("code");
        System.out.println(code);
        String url = "https://api.weixin.qq.com/sns/jscode2session?" +
                "appid=" + AppId +
                "&secret=" + AppSecret +
                "&js_code=" + code +
                "&grant_type=authorization_code";
        String jsonData = restTemplate.getForObject(url, String.class);
        JSONObject jsonObject = JSONObject.parseObject(jsonData);
        String openid = jsonObject.getString("openid");
        User user = userMapper.selectById(openid);
        if(user == null){
            user =new User();
            user.setOpen_id(openid);
            user.setNickName(jsonParam.getString("nick_name"));
            user.setAvatarUrl(jsonParam.getString("avatar_url"));
            user.setProperty(0.0);
            System.out.println(user);
            boolean save = userService.save(user);
        }else {
            System.out.println("exist");
            user.setOpen_id(openid);
            System.out.println(user);
        }
        return user;
    }

    @PostMapping("/changeInfo")
    public User change(@RequestBody JSONObject jsonObject){
        String openid = jsonObject.getString("openid");
        String nickName=jsonObject.getString("nickName");
        String avatarUrl=jsonObject.getString("avatarUrl");
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("open_id",openid);
        User user = userMapper.selectOne(queryWrapper);
        user.setOpen_id(openid);
        user.setNickName(nickName);
        user.setAvatarUrl(avatarUrl);
        userMapper.update(user,queryWrapper);
        return user;
    }

    @PostMapping("/getInfo")
    public User getInfo(@RequestBody JSONObject jsonObject){
        String openid = jsonObject.getString("openid");
        User user = userService.getById(openid);
        System.out.println(user);
        return user;
    }

    @PostMapping("/getProperty")
    public double getUserProperty(@RequestBody JSONObject jsonObject){
        String openid = jsonObject.getString("openid");
        User user=userService.getById(openid);
        System.out.println(user);
        return user.getProperty();
    }
}



