package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.Dept;
import com.atguigu.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther: tangshunyu
 * @Date: 2019/2/23
 * @Description:
 * @version: 1.0
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

//    public Dept processHystrix_Get(@PathVariable(value="id") Long id){
//        return new Dept().setDeptno(id).setDname("该ID:"+id+"没有对应的信息，null--@HystrixCommand")
//                .setDb_source("no this database in Mysql");
//    }
    @PostMapping("/dept/add")
    public boolean add(Dept dept){
        return deptService.add(dept);
    }
//    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable Long id){
        Dept dept = deptService.get(id);
        if(null == dept){
            throw new RuntimeException("该ID:"+id+"没有对应的信息");
        }
        return dept;
    }

    @GetMapping("/dept/list")
    public List<Dept> list(){
        return deptService.list();
    }
}
