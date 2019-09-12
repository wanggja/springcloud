package com.southwind.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ZipkinHandler
 * @Author: wanggj
 * @Date: 2019/9/12 9:33
 **/
@RestController
@RequestMapping("/zipkin")
public class ZipkinHandler {


    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index(){
        return this.port;
    }
}
