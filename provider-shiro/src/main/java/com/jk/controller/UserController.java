package com.jk.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @Reference
    private UserService userService;


    @RequestMapping("login")
    public String login(){
        return "login";
    }
}
