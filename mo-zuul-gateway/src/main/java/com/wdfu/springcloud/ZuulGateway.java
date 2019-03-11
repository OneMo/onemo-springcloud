package com.wdfu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author wdfu
 * @version V1.0
 * @Descption:
 * @ClassName: ZuulGateway.java
 * @date 2019/3/11 16:36
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulGateway {

    public static void main(String[] args) {
        SpringApplication.run(ZuulGateway.class, args);
    }
}
