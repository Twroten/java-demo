package com.wall.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountController {

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @GetMapping("/hello")
    public String count() {

        Long increment = stringRedisTemplate.opsForValue().increment("count-access");
        return "首页访问次数count-access：".concat(increment.toString());
    }
}
