package com.dengcs.javastudy.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/user")
    @ResponseBody
    public String user(@RequestParam("name") String name) {
        String userinfo = "user is " + name + "at " + System.currentTimeMillis();
        System.out.println(userinfo);
        return userinfo;
    }
}
