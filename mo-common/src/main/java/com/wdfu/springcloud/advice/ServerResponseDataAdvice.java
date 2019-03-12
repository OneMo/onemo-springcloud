package com.wdfu.springcloud.advice;

import com.wdfu.springcloud.annotation.IgnoreResponseAdvice;
import com.wdfu.springcloud.vo.CommonResponse;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.Objects;

/**
 * @author wdfu
 * @version V1.0
 * @Descption:
 * @ClassName: ServerResponseDataAdvice.java
 * @date 2019/3/12 10:02
 */
@RestControllerAdvice
public class ServerResponseDataAdvice implements ResponseBodyAdvice<Object> {

    /**
     * 当在controller或者方法中标识了@IgnoreResponseAdvice注解时，不会去拦截请求响应
     * @param methodParameter
     * @param aClass
     * @return
     */
    @Override
    @SuppressWarnings("all")
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        return !methodParameter.getDeclaringClass().isAnnotationPresent(IgnoreResponseAdvice.class) && !Objects.requireNonNull(methodParameter.getMethod()).isAnnotationPresent(IgnoreResponseAdvice.class);
    }

    @Override
    @SuppressWarnings("all")
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        CommonResponse<Object> objectCommonResponse = new CommonResponse(0,"");
        if(null == o){
            return objectCommonResponse;
        }else if (o instanceof CommonResponse){
            objectCommonResponse = (CommonResponse)o;
        }else {
            objectCommonResponse.setData(o);
        }
        return objectCommonResponse;
    }
}
