package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Auther: tangshunyu
 * @Date: 2019/2/24
 * @Description:
 * @version: 1.0
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService(){

            @Override
            public boolean add(Dept dept) {
                return false;
            }

            @Override
            public Dept get(Long id) {
                return new Dept().setDeptno(id).setDname("该ID:"+id+"没有对应的信息，null--客户端做了降级处理")
                .setDb_source("no this database in Mysql");
            }

            @Override
            public List<Dept> list() {
                return null;
            }
        };
    }
}
