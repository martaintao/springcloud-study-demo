package com.martain.study.service;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/6/29 1:37 下午
 */
public interface IMessageProvider {
    /**
     * 发送接口
     * @param msg
     * @return
     */
    public String send(String msg);
}
