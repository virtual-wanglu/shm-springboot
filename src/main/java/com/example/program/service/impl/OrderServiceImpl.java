package com.example.program.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.program.entity.Order;
import com.example.program.service.OrderService;
import com.example.program.mapper.OrderMapper;
import org.springframework.stereotype.Service;

/**
* @author wanglu
* @description 针对表【order】的数据库操作Service实现
* @createDate 2023-04-27 14:34:16
*/
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order>
    implements OrderService{

}




