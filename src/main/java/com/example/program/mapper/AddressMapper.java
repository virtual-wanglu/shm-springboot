package com.example.program.mapper;

import com.example.program.entity.Address;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author wanglu
* @description 针对表【address】的数据库操作Mapper
* @createDate 2023-04-18 13:47:44
* @Entity com.example.program.entity.Address
*/
@Mapper
public interface AddressMapper extends BaseMapper<Address> {

}




