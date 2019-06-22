package com.mft.controller;

import com.mft.entity.Admin;
import com.mft.mapper.AdminMapper;
import com.mft.services.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    AdminMapper adminMapper;

    @RequestMapping("/")
    public String abc(){
        return "index";
    }

    @RequestMapping("/login.html")
    public String bcd(){
        return "login";
    }

    @RequestMapping("/register.html")
    public String register(){

        Admin zhangsan = adminMapper.getadminID();
        System.out.println(zhangsan.getAdminName());

        return "register";
    }
}
