package com.example.vbackend.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private static final Logger logger= LoggerFactory.getLogger(TestController.class);

    @GetMapping("testGet")
    public String testGet(int p){
        logger.info("get value:{}",p);
        return "get success";
    }
    @PostMapping("testPost")
    public String testPost(int p){
        logger.info("post value:{}",p);
        return "post success";

    }
}
