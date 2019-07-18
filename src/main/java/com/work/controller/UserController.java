package com.work.controller;

import com.work.service.UserService;
import com.work.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/userController")
public class UserController {
    @Autowired
    private UserService userServiceImpl;
    @RequestMapping("user")
    public void users(){
        userServiceImpl.testAop();
    }
}
