package com.zking.controller;

import com.zking.mapper.CstatusMapper;
import com.zking.model.Cstatus;
import com.zking.model.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class CstatusController {

    @Autowired
    CstatusMapper cstatusMapper;

    @ResponseBody
    @RequestMapping("queryAllCstatus")
    public List<Cstatus> queryAll(HttpServletRequest request){
        List<Cstatus> cstatusList=cstatusMapper.queryAllCstatus();
        //System.out.println(cstatusList.get(0).getCsname());
        return cstatusList;
    }

    @ResponseBody
    @RequestMapping("queryNoAllCstauts")
    public List<Cstatus> queryNoAll(){
        List<Cstatus> list=cstatusMapper.queryNoAll();
        return list;
    }
}
