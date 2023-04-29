package com.example.program.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.program.entity.Recharge;
import com.example.program.mapper.RechargeMapper;
import com.example.program.service.RechargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recharge")
public class RechargeController {

    @Autowired
    private RechargeMapper rechargeMapper;

    @Autowired
    private RechargeService rechargeService;

    @PostMapping("/commit")
    public String commitRecharge(@RequestBody Recharge recharge){
        System.out.println(recharge);
        QueryWrapper<Recharge> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("open_id",recharge.getOpen_id()).eq("billNum",recharge.getBillNum());
        Recharge selectRecharge = rechargeMapper.selectOne(queryWrapper);
        if (selectRecharge == null) {
            rechargeService.save(recharge);
            return "ok";
        }else {
            return "repetition";
        }
    }
}
