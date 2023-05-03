package com.example.program.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.program.entity.User;
import com.example.program.service.UserService;
import com.example.program.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author wanglu
* @description 针对表【user】的数据库操作Service实现
* @createDate 2023-05-03 01:46:23
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




