package com.bestksl.service;

import com.bestksl.util.EmbeddedZooKeeper;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.Environment;

/**
 * @author HaoxuanLi
 * @version 1.0
 * @date 2020/3/17 17:38
 */

@EnableDubbo
@SpringBootApplication
public class DemoProvider {
    public static void main(String[] args) {
        SpringApplication.run(DemoProvider.class, args);
//        new SpringApplicationBuilder(DemoProvider.class)
//                .listeners((ApplicationListener<ApplicationEnvironmentPreparedEvent>) event -> {
//                    Environment environment = event.getEnvironment();
//                    int port = environment.getProperty("embedded.zookeeper.port", int.class);
//                    new EmbeddedZooKeeper(port, false).start();
//                }).run(args);
    }
}
