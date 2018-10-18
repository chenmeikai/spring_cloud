package com.kenhome.complex.restImpl;

import com.kenhome.rest.TestRest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: cmk
 * @Description:
 * @Date: Created in 16:05 2018/10/17 0017
 * @Modified By:
 */

@RestController
public class TestRestImpl implements TestRest {


    public String test(@RequestParam("name") String name) {
        return "名字是："+name;
    }
}
