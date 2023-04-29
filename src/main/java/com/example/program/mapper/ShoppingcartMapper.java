package com.example.program.mapper;

import com.example.program.entity.Shoppingcart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author wanglu
* @description 针对表【shoppingcart】的数据库操作Mapper
* @createDate 2023-04-18 23:03:41
* @Entity com.example.program.entity.Shoppingcart
*/
@Mapper
public interface ShoppingcartMapper extends BaseMapper<Shoppingcart> {

}




