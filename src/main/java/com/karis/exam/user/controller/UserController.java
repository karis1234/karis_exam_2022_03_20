package com.karis.exam.user.controller;

import com.karis.exam.user.dao.UserRepository;
import com.karis.exam.user.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping("")
    @ResponseBody
    public List<User> users() {
        return userRepository.findAll();
    }

    @RequestMapping("1")
    @ResponseBody
    public User user() {
        User user1 = new User();
        return user1;
    }


}
