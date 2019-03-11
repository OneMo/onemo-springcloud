package com.wdfu.springcloud;

import com.wdfu.springcloud.rule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author wdfu
 * @version V1.0
 * @Descption:
 * @ClassName: DeptConsumer80.java
 * @date 2019/3/11 11:09
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(value = "MO-PROVIDER",configuration = MySelfRule.class)
@EnableFeignClients
public class DeptConsumer80 {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80.class, args);
    }
}
