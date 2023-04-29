package com.example.program.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.program.entity.DanMuReturn;
import com.example.program.entity.Danmu;
import com.example.program.mapper.DanmuMapper;
import com.example.program.service.DanmuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/danmu")
public class DanmuController {

    @Autowired
    private DanmuService danmuService;

    @Autowired
    private DanmuMapper danmuMapper;

    @PostMapping("/inputDanMu")
    public void inputDanMu(@RequestBody Danmu danmu) {
        danmuService.save(danmu);
    }

    @PostMapping("/getDanMu")
    public ArrayList<DanMuReturn> getDanMu(@RequestBody String roomId) {
        ArrayList<DanMuReturn> list = new ArrayList<>();
        int room_id = Integer.parseInt(roomId);
        System.out.println(room_id);
        QueryWrapper<Danmu> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("roomId", room_id).orderByAsc("danmuTime");
        List<Danmu> danmuList = danmuMapper.selectList(queryWrapper);
        for (Danmu danmu : danmuList) {
            DanMuReturn danMuReturn=new DanMuReturn(danmu.getDanmuText(),danmu.getDanmuColor(),danmu.getDanmuTime());
            list.add(danMuReturn);
        }
        return list;
    }
}
