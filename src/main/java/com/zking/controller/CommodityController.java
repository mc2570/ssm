package com.zking.controller;

import com.zking.mapper.CommodityMapper;
import com.zking.model.Commodity;
import org.activiti.engine.impl.util.json.JSONArray;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CommodityController {

    @Autowired
    CommodityMapper commodityMapper;

    @ResponseBody
    @RequestMapping("queryCommodity")
    public Map<String,Object> queryAll(HttpServletRequest request){
        String pageQuery=request.getParameter("pageQuery");
        String pageIndex=request.getParameter("pageIndex");
        String pageSize=request.getParameter("pageSize");
        String pageType=request.getParameter("pageType");
        String pageCstatus=request.getParameter("pageCstatus");

        int pageNumber = (Integer.parseInt(pageIndex)-1)*Integer.parseInt(pageSize);
        List<Commodity> list = commodityMapper.queryAllCommoditys(pageNumber,Integer.parseInt(pageSize),pageQuery,pageType,pageCstatus);
        int counts = commodityMapper.queryAllCounts(pageQuery,pageType,pageCstatus);
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("total",counts);
        map.put("rows",list);
        return map;
    }

    @RequestMapping("delCommodity")
    public String delCommodity(@RequestParam("cid") int cid){
        //System.out.println(cid);
        commodityMapper.deleteByPrimaryKey(cid);
        return "redirect:/index.html";
    }

    @RequestMapping(value="addCommodity",method=RequestMethod.POST)
    public String addCommodity(HttpServletRequest request){
        String cname = request.getParameter("cname");
        int tid =Integer.parseInt(request.getParameter("tid"));
        String coding = request.getParameter("coding");
        int csid =Integer.parseInt(request.getParameter("csid"));
        String cimg = request.getParameter("cimg");
        int uid =Integer.parseInt( request.getParameter("uid"));
        String barcode = request.getParameter("barcode");
        String csynopsis = request.getParameter("csynopsis");
        String cdetails = request.getParameter("cdetails");
        Commodity commodity = new Commodity(tid,cname,coding,csid,cimg,uid,barcode,csynopsis,cdetails);
        commodityMapper.insert(commodity);
        return "redirect:/index.html";
    }

    @RequestMapping(value = "returnImgPath",method=RequestMethod.POST)
    public @ResponseBody String returnImgPath(HttpServletRequest request,MultipartFile file){
        String path = request.getSession().getServletContext().getRealPath("upload");
//        System.out.println(file.getName());
        String fileName = file.getOriginalFilename();
        File dir = new File(path,fileName);
        if(!dir.exists()){
            dir.mkdirs();
        }
        //MultipartFile自带的解析方法
        try {
            file.transferTo(dir);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "\\upload\\"+fileName;
    }

    @ResponseBody
    @RequestMapping("queryUpdCommodity")
    public Commodity updCommodity(@RequestParam("cid")int cid){
        //System.out.println(cid);
        Commodity commodity=commodityMapper.queryOneCommodity(cid);
        //System.out.println(commodity);
        return commodity;
    }

    @RequestMapping("updCommodity")
    public void updateCommodity(@RequestParam("data") String commoditys){
        System.out.println(commoditys);
        //Commodity commodity= JSON
        //commodityMapper.updateCommodity(commoditys);
    }


}
