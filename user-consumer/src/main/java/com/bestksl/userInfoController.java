package com.bestksl;

import com.bestksl.service.UserServiceApi;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HaoxuanLi
 * @version 1.0
 * @date 2020/3/17 18:52
 */

@RestController
public class userInfoController {

    @Reference(version = "1.0")
    UserServiceApi userServiceApi;

    @GetMapping("/testUserApi")
    public String testUser() {
        return userServiceApi.sayHello("ksl666");
    }
}
