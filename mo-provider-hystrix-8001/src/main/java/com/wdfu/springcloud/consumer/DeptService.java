package com.wdfu.springcloud.consumer;

import com.wdfu.springcloud.entity.Dept;

import java.util.List;

/**
 * @author wdfu
 * @version V1.0
 * @Descption:
 * @ClassName: DeptService.java
 * @date 2019/3/11 10:54
 */
public interface DeptService {
    public boolean add(Dept dept);
    public Dept    get(Long id);
    public List<Dept> list();
}
