package com.lizy.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "index")
public class IndexController {

	@Autowired
	private  HttpServletRequest request;
	
	
    @RequestMapping(value = "login")
    @ResponseBody
    public String login(HttpServletRequest request, String username){

    	request.getSession().setAttribute("user","lizy");

        return "login1:登录";
    }

    @RequestMapping(value = "index")
    @ResponseBody
    public String index(){
        String user=(String) request.getSession().getAttribute("user");
        return user;
    }
}