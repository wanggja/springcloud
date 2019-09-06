package com.southwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @ClassName: GitConfigServerApplication
 * @Author: wanggj
 * @Date: 2019/9/6 15:29
 **/
@SpringBootApplication
@EnableConfigServer
public class GitConfigServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(GitConfigServerApplication.class, args);
    }
}
