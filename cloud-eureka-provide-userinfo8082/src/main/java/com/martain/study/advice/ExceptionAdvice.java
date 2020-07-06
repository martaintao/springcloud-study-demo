package com.martain.study.advice;

import com.martain.study.common.exception.OperationFailingException;
import com.martain.study.common.response.BaseResponse;
import org.springframework.core.annotation.Order;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLIntegrityConstraintViolationException;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/3/29 9:29 上午
 */
@RestControllerAdvice
@Order(-80)
public class ExceptionAdvice {

    @ExceptionHandler(OperationFailingException.class)
    public BaseResponse<Void> operationFailHandle(OperationFailingException e){
        return BaseResponse.fail(e.getLocalizedMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public BaseResponse<Void> methodArgumentValidHandle(MethodArgumentNotValidException e){

        return BaseResponse.fail(e.getBindingResult().getFieldError().getDefaultMessage());
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public BaseResponse<Void> httpMessageNotReadableExceptionHandle(HttpMessageNotReadableException e){
        return BaseResponse.fail("参数解析错误，请检查参数格式");
    }


    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public BaseResponse<Void> SQLIntegrityConstraintViolationExceptionHandle(SQLIntegrityConstraintViolationException e){
        return BaseResponse.fail("数据库错误");
    }
}
