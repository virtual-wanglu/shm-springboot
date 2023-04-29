package com.example.program.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.program.entity.Shoppingcart;
import com.example.program.service.ShoppingcartService;
import com.example.program.mapper.ShoppingcartMapper;
import org.springframework.stereotype.Service;

/**
* @author wanglu
* @description 针对表【shoppingcart】的数据库操作Service实现
* @createDate 2023-04-18 23:03:41
*/
@Service
public class ShoppingcartServiceImpl extends ServiceImpl<ShoppingcartMapper, Shoppingcart>
    implements ShoppingcartService{

}




