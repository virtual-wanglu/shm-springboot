package com.example.program.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.program.entity.Address;
import com.example.program.service.AddressService;
import com.example.program.mapper.AddressMapper;
import org.springframework.stereotype.Service;

/**
* @author wanglu
* @description 针对表【address】的数据库操作Service实现
* @createDate 2023-04-18 13:47:44
*/
@Service
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address>
    implements AddressService{

}




