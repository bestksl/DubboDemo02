package com.bestksl.service;


import org.apache.dubbo.config.annotation.Service;

/**
 * @author HaoxuanLi
 * @version 1.0
 * @date 2020/3/17 17:36
 */
@Service(version = "1.0")
public class UserService implements UserServiceApi {
    @Override
    public String sayHello(String name) {
        return "hello" + name + System.currentTimeMillis() / 1000;
    }
}