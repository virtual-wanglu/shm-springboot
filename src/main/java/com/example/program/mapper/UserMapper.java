package com.example.program.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.example.program.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author wanglu
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-04-27 17:08:35
* @Entity com.example.program.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




