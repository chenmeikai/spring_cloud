package com.kenhome.rest;

import com.kenhome.FeignConfig;
import com.kenhome.constant.GlobalConstant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: cmk
 * @Description:
 * @Date: Created in 15:51 2018/10/17 0017
 * @Modified By:
 */
@FeignClient(name =GlobalConstant.REST_SERVER_COMPLEX,configuration = FeignConfig.class)
public interface TestRest {

    @PostMapping("/test/name.json")
    String  test(@RequestParam("name") String name);

}
