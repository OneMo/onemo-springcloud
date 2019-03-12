package com.wdfu.springcloud.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author wdfu
 * @version V1.0
 * @Descption: 忽略拦截请求响应注解  当在类或者方法上标注了该注解 则该类下的或者改方法的请求不会被拦截
 * @ClassName: IgnoreResponseAdvice.java
 * @date 2019/3/12 10:01
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IgnoreResponseAdvice {
}
