package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Auther: tangshunyu
 * @Date: 2019/2/24
 * @Description:
 * @version: 1.0
 */
@Configuration
public class mySelfRule {
    @Bean
    public IRule iRule(){
        return new RandomRule();
    }
}
