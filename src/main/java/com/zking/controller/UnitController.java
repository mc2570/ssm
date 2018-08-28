package com.zking.controller;

import com.zking.mapper.UnitMapper;
import com.zking.model.Unit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UnitController {

    @Autowired
    UnitMapper unitMapper;

    @ResponseBody
    @RequestMapping("queryAllUnit")
    public List<Unit> queryAllUnit(){
        List<Unit> list = unitMapper.queryAllUnit();
        return list;
    }

}
