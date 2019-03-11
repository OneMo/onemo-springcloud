package com.wdfu.springcloud.controller;

import com.wdfu.springcloud.consumer.DeptConsumer;
import com.wdfu.springcloud.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author wdfu
 * @version V1.0
 * @Descption:
 * @ClassName: DeptController.java
 * @date 2019/3/11 11:09
 */
@RestController
public class DeptController {

    private final DeptConsumer deptConsumer;

    @Autowired
    public DeptController(DeptConsumer deptConsumer) {
        this.deptConsumer = deptConsumer;
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return this.deptConsumer.get(id);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list()
    {
        return this.deptConsumer.list();
    }

    @RequestMapping(value = "/consumer/dept/add")
    public Object add(Dept dept)
    {
        return this.deptConsumer.add(dept);
    }

}
