package com.study.WEB.mvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class Test {
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("greeting", "欢迎使用");
        return "index";
    }
    @RequestMapping("/requestAndResponse")
    public String requestAndResponse(HttpServletRequest request,HttpServletResponse reponses, Model model){ 
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        model.addAttribute("title", "request,reponses对象传递,");
        model.addAttribute("paras", username+","+password);
        if("luohuasen".equals(username)&&"123456".equals(password)){
            model.addAttribute("result", "Success!");
        }else{
            model.addAttribute("result", "False!");
        }
        return "result";
    }
    @RequestMapping("/requestParam")
    public String requestParam(@RequestParam(value ="username") String username , 
                               @RequestParam(value ="password") String password ,
                               Model model){
        model.addAttribute("title", "Param传递与接收");
        model.addAttribute("paras", username+","+password);
        if("luohuasen".equals(username)&&"123456".equals(password)){
            model.addAttribute("result", "Success!");
        }else{
            model.addAttribute("result", "False!");
        }
        return "result";
    }
    @RequestMapping("/responseBody")
    @ResponseBody
    public String responseBody(HttpServletRequest request,HttpServletResponse reponses){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String result = null;
        if("luohuasen".equals(username)&&"123456".equals(password)){
            result = "success";
        }else{
            result = "false";
        }
        return result;
    }
}
