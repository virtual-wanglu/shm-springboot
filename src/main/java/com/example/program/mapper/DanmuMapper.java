package com.example.program.mapper;

import org.apache.ibatis.annotations.Mapper;
import com.example.program.entity.Danmu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author wanglu
* @description 针对表【danmu】的数据库操作Mapper
* @createDate 2023-04-25 20:44:23
* @Entity com.example.program.entity.Danmu
*/
@Mapper
public interface DanmuMapper extends BaseMapper<Danmu> {

}




