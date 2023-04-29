package com.example.program.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.program.entity.Feedback;
import com.example.program.service.FeedbackService;
import com.example.program.mapper.FeedbackMapper;
import org.springframework.stereotype.Service;

/**
* @author wanglu
* @description 针对表【Feedback】的数据库操作Service实现
* @createDate 2023-04-16 23:44:47
*/
@Service
public class FeedbackServiceImpl extends ServiceImpl<FeedbackMapper, Feedback>
    implements FeedbackService {

}




