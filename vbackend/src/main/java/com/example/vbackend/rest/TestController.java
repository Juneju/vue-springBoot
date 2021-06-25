package com.example.vbackend.rest;

import com.example.vbackend.mapper.TestMapper;
import com.example.vbackend.model.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    private static final Logger logger= LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestMapper testMapper;

    @GetMapping("testGet")
    public String testGet(int p){
        logger.info("get value:{}",p);
        return "get success";
    }
    @PostMapping("testPost")
    public String testPost(@RequestParam int p,@RequestBody Test s){
        logger.info("post value:{}",p);
        logger.info("post value2:{}",s.getS());
        return "post success";

    }

    @GetMapping("testMyBatis")
    public String testMyBatis(){
        return testMapper.select();
    }
}
