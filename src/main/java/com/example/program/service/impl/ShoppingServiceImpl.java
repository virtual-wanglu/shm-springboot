package com.example.program.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.program.entity.Shopping;
import com.example.program.mapper.ShoppingMapper;
import com.example.program.service.ShoppingService;
import org.springframework.stereotype.Service;

/**
* @author wanglu
* @description 针对表【shopping】的数据库操作Service实现
* @createDate 2023-04-19 01:38:56
*/
@Service
public class ShoppingServiceImpl extends ServiceImpl<ShoppingMapper, Shopping>
    implements ShoppingService {

}




