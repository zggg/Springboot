package com.cn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by GZ on 2016/5/2.
 */
@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "webapp start..";
    }

}
