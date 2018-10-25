package com.jaagro.account.web.config;

import com.jaagro.utils.BaseResponse;
import com.jaagro.utils.ResponseStatusCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author asus
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value=Exception.class)
    @ResponseBody
    private BaseResponse exceptionHandler(HttpServletRequest request, Exception ex){
        return BaseResponse.errorInstance(ResponseStatusCode.SERVER_ERROR.getCode(), ex.getMessage());
    }
}