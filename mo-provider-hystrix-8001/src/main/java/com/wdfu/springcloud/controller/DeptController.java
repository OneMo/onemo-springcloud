package com.wdfu.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.wdfu.springcloud.entity.Dept;
import com.wdfu.springcloud.consumer.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wdfu
 * @version V1.0
 * @Descption:
 * @ClassName: DeptController.java
 * @date 2019/3/11 10:55
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService service;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return service.add(dept);
    }

    @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id") Long id)
    {
        Dept dept =  this.service.get(id);
        if(null == dept)
        {
            throw new RuntimeException("该ID："+id+"没有没有对应的信息");
        }
        return dept;
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id)
    {
        return new Dept().setDeptno(id)
                .setDname("该ID："+id+"没有没有对应的信息,null--@HystrixCommand")
                .setDb_source("no this database in MySQL");
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> list() {
        return service.list();
    }
}
