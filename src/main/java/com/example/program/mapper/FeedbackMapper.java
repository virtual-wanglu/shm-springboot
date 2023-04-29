package com.example.program.mapper;

import com.example.program.entity.Feedback;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author wanglu
* @description 针对表【Feedback】的数据库操作Mapper
* @createDate 2023-04-16 23:44:47
* @Entity com.example.program.entity.Feedback
*/
@Mapper
public interface FeedbackMapper extends BaseMapper<Feedback> {

}




