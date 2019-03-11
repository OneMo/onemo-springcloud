package com.wdfu.springcloud.consumer;

import com.wdfu.springcloud.entity.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author wdfu
 * @version V1.0
 * @Descption:
 * @ClassName: DeptClientService.java
 * @date 2019/3/11 14:21
 */
@FeignClient(value = "MO-PROVIDER", fallback = DeptConsumerHystrix.class)
public interface DeptConsumer {
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    Dept get(@PathVariable("id") long id);

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    List<Dept> list();

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    boolean add(Dept dept);
}
