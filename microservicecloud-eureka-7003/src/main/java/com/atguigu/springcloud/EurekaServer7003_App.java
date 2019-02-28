package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Auther: tangshunyu
 * @Date: 2019/2/23
 * @Description:
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7003_App {
    public static void main(String[] args) {
        System.out.println("ni bu hao a ");
        System.out.println("ni bu hao a ");
        System.out.println("ni bu hao a ");
        System.out.println("ni bu hao a ");
        SpringApplication.run(EurekaServer7003_App.class,args);
    }
}
