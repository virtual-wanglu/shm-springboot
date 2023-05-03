package com.example.program.mapper;

import com.example.program.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author wanglu
* @description 针对表【user】的数据库操作Mapper
* @createDate 2023-05-03 01:46:23
* @Entity com.example.program.entity.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




