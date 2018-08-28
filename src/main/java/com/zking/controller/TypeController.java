package com.zking.controller;

import com.zking.mapper.TypeMapper;
import com.zking.model.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TypeController {

    @Autowired
    TypeMapper typeMapper;

    @ResponseBody
    @RequestMapping("queryType")
    public List<Type> queryAll(){
        List<Type> typeList = typeMapper.queryAllType();
       // System.out.println(typeList.get(0).getTname());
        return typeList;
    }

    @ResponseBody
    @RequestMapping("queryNoAll")
    public List<Type> queryNoAll(){
        List<Type> list=typeMapper.queryNoAll();
        return list;
    }
}
