package com.example.program.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.program.entity.Image;
import com.example.program.service.ImageService;
import com.example.program.mapper.ImageMapper;
import org.springframework.stereotype.Service;

/**
* @author wanglu
* @description 针对表【image】的数据库操作Service实现
* @createDate 2023-04-29 02:00:00
*/
@Service
public class ImageServiceImpl extends ServiceImpl<ImageMapper, Image>
    implements ImageService{

}




