package com.wdfu.springcloud.consumer.impl;

import com.wdfu.springcloud.dao.DeptDao;
import com.wdfu.springcloud.entity.Dept;
import com.wdfu.springcloud.consumer.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wdfu
 * @version V1.0
 * @Descption:
 * @ClassName: DeptServiceImpl.java
 * @date 2019/3/11 10:54
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao dao ;

    @Override
    public boolean add(Dept dept)
    {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id)
    {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list()
    {
        return dao.findAll();
    }

}
