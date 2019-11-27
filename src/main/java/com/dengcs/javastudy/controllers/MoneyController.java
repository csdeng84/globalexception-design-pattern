package com.dengcs.javastudy.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoneyController {

    @ResponseBody
    @RequestMapping("/money")
    public String money(@RequestParam("name") String name) {

        String moneyInfo = name + "'s money is " + Math.random();
        int i = 1 / 0;
        return moneyInfo;
    }
}
