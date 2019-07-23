package com.zking.controller;


import com.zking.biz.UserInter;
import com.zking.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class UserController {

    @Autowired
    private UserInter userImpl;

    @ResponseBody
    @RequestMapping(value = "/queryUser")
    public String queryUser(@RequestParam("username")String username,@RequestParam("userpassword")String userpasssword,HttpServletRequest request){
        if(StringUtils.isEmpty(userImpl.queryUserByNameAndPass(username,userpasssword))==false){
            HttpSession session = request.getSession();
            //System.out.println(StringUtils.isEmpty(userImpl.queryUserByNameAndPass(username,userpasssword)+"_______"));
            session.setAttribute("user",userImpl.queryUserByNameAndPass(username,userpasssword));
            return "index";
        }else return "login";

    }

//    @RequestMapping(value = "/login")
//    public ModelAndView login(@RequestParam("username")String username,@RequestParam("userpassword")String userpasssword,HttpServletRequest request){
//        ModelAndView modelAndView = new ModelAndView();
//        if(StringUtils.isEmpty(userImpl.queryUserByNameAndPass(username,userpasssword))==false){
//            modelAndView.setViewName("index");
//            modelAndView.addObject("username",username);
//            modelAndView.addObject("userpassword",userpasssword);
//        }else{
//            modelAndView.setViewName("login");
//            modelAndView.addObject("errmessage","用户名或密码错误");
//        }
//        return modelAndView;
//    }

    @ResponseBody
    @RequestMapping(value="/getUser")
    public User returnUser(HttpServletRequest request){
        HttpSession session = request.getSession();
        User user = null;
        if(session.getAttribute("user")!=null){
            user = (User) session.getAttribute("user");
        }
        return user;
    }

}
