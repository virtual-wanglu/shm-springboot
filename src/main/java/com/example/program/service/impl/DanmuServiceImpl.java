package com.example.program.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.program.entity.Danmu;
import com.example.program.service.DanmuService;
import com.example.program.mapper.DanmuMapper;
import org.springframework.stereotype.Service;

/**
* @author wanglu
* @description 针对表【danmu】的数据库操作Service实现
* @createDate 2023-04-25 20:44:23
*/
@Service
public class DanmuServiceImpl extends ServiceImpl<DanmuMapper, Danmu>
    implements DanmuService{

}




