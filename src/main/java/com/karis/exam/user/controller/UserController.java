package com.karis.exam.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/users")
public class UserController {
    @RequestMapping("")
    @ResponseBody
    public String users() {
        return "안녕하세요";
    }


    @RequestMapping("1")
    @ResponseBody
    public String user() {
        return "유저 한명!!";
    }
}
