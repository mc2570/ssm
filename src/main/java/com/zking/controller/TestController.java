package com.zking.controller;

import com.zking.dao.TestDao;
import com.zking.entity.PersonEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TestController {

    @Autowired
    TestDao testDao;

    @RequestMapping(name = "test")
    public String test(){

        List<PersonEntity> list = testDao.queryList(new PersonEntity(),1,4);
        //List<PersonEntity> list = testDao.getAll();
        System.out.println(list.get(2));
        return "index";
    }

}
