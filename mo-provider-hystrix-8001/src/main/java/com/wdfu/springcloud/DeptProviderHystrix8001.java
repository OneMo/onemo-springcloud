package com.wdfu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wdfu
 * @version V1.0
 * @Descption:
 * @ClassName: DeptProvider8001.java
 * @date 2019/3/11 10:58
 */
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class DeptProviderHystrix8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderHystrix8001.class, args);
    }
}
