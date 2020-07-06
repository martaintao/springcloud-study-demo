package com.martain.study.common.enums;


/**
 * @author Martin
 * @version 1.0
 * @date 2020/3/24 11:16 上午
 */
public enum  StatusCode {

    Success(0,"success"),
    Fail(-1,"fail"),
    InvalidParams(200,"无效的参数"),
    ItemNotExist(201,"商品不存在!");

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 描述信息
     */
    private String msg;
    StatusCode(Integer code,String msg){
        this.code = code;
        this.msg = msg;
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
}
