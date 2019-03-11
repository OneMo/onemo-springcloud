package com.wdfu.springcloud.rule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wdfu
 * @version V1.0
 * @Descption:
 * @ClassName: MySelfRule.java
 * @date 2019/3/11 13:53
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule()
    {
        //Ribbon默认是轮询，我自定义为随机
        return new MyRandomRule();
    }
}
