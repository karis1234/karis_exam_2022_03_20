package com.karis.exam.user.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/users")
public class UserController {
    @RequestMapping("")
    @ResponseBody
    public String users() {

        return "유저 1명!!!!!!";
    }

    @RequestMapping("1")
    @ResponseBody
    public String user() {

        return "유저";
    }
}
