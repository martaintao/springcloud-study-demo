package com.martain.study.common.response;


import com.martain.study.common.enums.StatusCode;
import java.io.Serializable;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/3/24 11:29 上午
 */
public class BaseResponse<T> implements Serializable {

    private Integer code;
    private String msg;
    private T data;

    public BaseResponse() {
    }

    public BaseResponse(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
    public BaseResponse(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseResponse(StatusCode statusCode) {
        this.code = statusCode.getCode();
        this.msg = statusCode.getMsg();
    }

    public static <T> BaseResponse<T> success(){
        BaseResponse<T> response = new BaseResponse<T>(StatusCode.Success);
        return response;
    }

    public static <T> BaseResponse<T> success(T data){
        BaseResponse<T> response = new BaseResponse<T>(StatusCode.Success);
        response.setData(data);
        return response;
    }

    public static <T> BaseResponse<T> fail(){
        return new BaseResponse<T>(StatusCode.Fail);
    }

    public static <T> BaseResponse<T> fail(String msg){
        BaseResponse<T> response = new BaseResponse<T>(StatusCode.Fail);
        response.setMsg(msg);
        return response;
    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
