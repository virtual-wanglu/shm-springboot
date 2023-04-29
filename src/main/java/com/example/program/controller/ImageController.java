package com.example.program.controller;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.program.entity.Image;
import com.example.program.mapper.ImageMapper;
import com.example.program.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/images")
public class ImageController {

    @Autowired
    private ImageMapper imageMapper;

    @Autowired
    private ImageService imageService;

    @PostMapping("/getImages")
    public ArrayList<String> getImageList(@RequestBody JSONObject jsonObject){
        ArrayList<String> imageList = new ArrayList<>();
        Integer roomId=jsonObject.getInteger("roomId");
        QueryWrapper<Image> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("roomId",roomId).orderByAsc("imageId");
        List<Image> list = imageMapper.selectList(queryWrapper);
        for (Image image: list) {
            System.out.println(image);
            imageList.add(image.getImageUrl());
        }
        return imageList;
    }
}
