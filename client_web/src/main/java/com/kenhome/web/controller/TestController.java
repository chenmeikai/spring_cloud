package com.kenhome.web.controller;

import com.kenhome.rest.TestRest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: cmk
 * @Description:
 * @Date: Created in 15:29 2018/10/17 0017
 * @Modified By:
 */
@RestController
@RequestMapping("/test")
public class TestController {


    @Resource
    private TestRest testRest;

    @GetMapping("name")
    public String test(String name){
        return  testRest.test(name);
    }
}
