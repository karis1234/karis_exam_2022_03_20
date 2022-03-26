package com.karis.exam.user.controller;

import com.karis.exam.user.domain.User;
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
        return "유저 여러명!!!";
    }

    @RequestMapping("1")
    @ResponseBody
    public User user() {
        User user1 = new User();
        return user1;
    }


}
