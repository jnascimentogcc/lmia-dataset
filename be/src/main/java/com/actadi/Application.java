package com.actadi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EntityScan(basePackages = "com.actadi")
@ComponentScan(basePackages = "com.actadi")
@ServletComponentScan(basePackages = "com.actadi")
@EnableScheduling
@EnableCaching
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
