package com.example.program.mapper;

import com.example.program.entity.Shopping;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author wanglu
* @description 针对表【shopping】的数据库操作Mapper
* @createDate 2023-04-19 01:38:56
* @Entity com.example.program.entity.Shopping
*/
@Mapper
public interface ShoppingMapper extends BaseMapper<Shopping> {

}




