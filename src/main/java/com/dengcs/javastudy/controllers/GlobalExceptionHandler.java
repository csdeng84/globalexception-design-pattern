package com.dengcs.javastudy.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * 全局错误异常处理
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    @ResponseBody
    @ExceptionHandler(RuntimeException.class)
    public Map<String, Object> exceptionHandle() {
        Map<String, Object> ret = new HashMap<String, Object>();
        ret.put("code", "500");
        ret.put("msg", "亲，页面不存在啦。。。。");
        return ret;
    }
}
