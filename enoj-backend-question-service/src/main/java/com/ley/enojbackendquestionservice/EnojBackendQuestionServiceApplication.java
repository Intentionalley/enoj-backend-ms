package com.ley.enojbackendquestionservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.ley.enojbackendquestionservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.ley")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.ley.enojbackendserviceclient.service"})
public class EnojBackendQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnojBackendQuestionServiceApplication.class, args);
    }

}
