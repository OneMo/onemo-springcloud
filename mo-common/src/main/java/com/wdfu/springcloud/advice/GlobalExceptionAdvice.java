package com.wdfu.springcloud.advice;

import com.wdfu.springcloud.exception.AdException;
import com.wdfu.springcloud.vo.CommonResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author wdfu
 * @version V1.0
 * @Descption:
 * @ClassName: GlobalExceptionAdvice.java
 * @date 2019/3/12 10:01
 */
@RestControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = AdException.class)
    public CommonResponse<String> handlerAdException(HttpServletRequest request, AdException exception){
        CommonResponse<String> commonResponse = new CommonResponse<>(-1,"系统错误!!!");
        commonResponse.setData(exception.getMessage());
        return commonResponse;
    }
}
