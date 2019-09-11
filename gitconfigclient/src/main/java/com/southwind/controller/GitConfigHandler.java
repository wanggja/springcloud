package com.southwind.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: GitConfigHandler
 * @Author: wanggj
 * @Date: 2019/9/6 15:42
 **/
@RestController
@RequestMapping("/git")
public class GitConfigHandler {

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String applicationName;

    @GetMapping("/index")
    public String index() {
        return this.port + "-------" + this.applicationName;
    }
}
