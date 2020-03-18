package com.bestksl.service;


import org.apache.dubbo.config.annotation.Service;

/**
 * @author HaoxuanLi
 * @version 1.0
 * @date 2020/3/17 18:00
 */

@Service(version = "1.0")
public class ErrorService implements ErrorServiceApi {
    @Override
    public String error(String errorName) {
        return "ERROR:" + errorName + System.currentTimeMillis() / 1000;
    }
}
