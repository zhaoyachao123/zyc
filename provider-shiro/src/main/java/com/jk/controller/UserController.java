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

        System.out.println("22222222222222");
        System.out.println("3333333333333");
        System.out.println("55555555555555");
        return "login";
    }
}
