package com.wdfu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author wdfu
 * @version V1.0
 * @Descption:
 * @ClassName: ConsumerHystrixDashboard.java
 * @date 2019/3/11 16:09
 */
@SpringBootApplication
@EnableHystrixDashboard
public class ConsumerHystrixDashboard {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixDashboard.class, args);
    }
}
