package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Auther: tangshunyu
 * @Date: 2019/2/23
 * @Description:
 * @version: 1.0
 */
@RestController
public class DeptController_Consumer {
    private static final String REST_URL_PREFIX="http://MICROSERVICECLOUD-DEPT";
    @Autowired
    private DeptClientService deptClientService;
//    private RestTemplate restTemplate;
    @PostMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return this.deptClientService.add(dept);
    }
    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable long id){
        return this.deptClientService.get(id);
    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> list(){
        return this.deptClientService.list();
    }

}
