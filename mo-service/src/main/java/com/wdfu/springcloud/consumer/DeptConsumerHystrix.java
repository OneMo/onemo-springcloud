package com.wdfu.springcloud.consumer;

import com.wdfu.springcloud.entity.Dept;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author wdfu
 * @version V1.0
 * @Descption:
 * @ClassName: DeptClientHistrix.java
 * @date 2019/3/11 14:23
 */
@Component
public class DeptConsumerHystrix implements DeptConsumer{
    @Override
    public Dept get(long id) {
        return null;
    }

    @Override
    public List<Dept> list() {
        return null;
    }

    @Override
    public boolean add(Dept dept) {
        return false;
    }
}
