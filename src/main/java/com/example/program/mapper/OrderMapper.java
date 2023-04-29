package com.example.program.mapper;

import com.example.program.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author wanglu
* @description 针对表【order】的数据库操作Mapper
* @createDate 2023-04-27 14:34:16
* @Entity com.example.program.entity.Order
*/
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}




