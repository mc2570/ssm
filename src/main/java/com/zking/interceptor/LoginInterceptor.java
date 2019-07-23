package com.zking.interceptor;

import com.zking.model.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

public class LoginInterceptor implements HandlerInterceptor {


    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

        // 执行完毕，返回前拦截
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

        // 在处理过程中，执行拦截
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {

//        System.out.println("拦截路径:"+request.getRequestURI());
//        System.out.println(request.getHeader("x-requested-with"));
        //当请求去的是登陆页面就直接放行

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        if (user==null){ //如果是ajax请求响应头会有x-requested-with
            PrintWriter out = response.getWriter();
            out.print("loseSession");//session失效
            out.flush();
            System.out.println("用户为登录");
            //response.sendRedirect("login.html");
            return false;
        }else{
            return true;
        }


//        if(user!=null){
//            return true;
//        }else{
//
//            response.sendRedirect("login.html");
//            return false;
//        }

//        if (session.getAttribute("user")==null){
//            //如果是ajax请求响应头会有x-requested-with
//                PrintWriter out = response.getWriter();
//                out.print("loseSession");//session失败
//                out.flush();
//                System.out.println("false1");
//                response.sendRedirect("/login.html");
//                return false;
//        }else{
//            System.out.println("true");
//            //request.getRequestDispatcher("login.html").forward(request,response);
//            //response.getWriter().print("loseSession");
//            //response.sendRedirect("/login.html");
//            return true;
//        }


    }


}
