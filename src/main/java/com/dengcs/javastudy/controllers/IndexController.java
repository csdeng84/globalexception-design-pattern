package com.dengcs.javastudy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(ModelMap map) {

        //${name}
        map.addAttribute("name", "dengcs");
        map.addAttribute("sex", "1");
        List<String> userList = new ArrayList<String>();
        userList.add("张三");
        userList.add("李四");
        userList.add("王麻子");
        map.addAttribute("userList", userList);

        //使用freemarker 访问templates/index.ftl
        return "index";
    }
}
