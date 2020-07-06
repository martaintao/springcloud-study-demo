package com.martain.study.model.service;

import com.martain.study.model.entity.User;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/4/26 4:41 下午
 */
public interface UserService {

    /**
     * 根据id查询用户
     * @param userId
     * @return
     */
    User findById(Integer userId);

    /**
     * 添加用户
     * @param user
     * @return
     */
    int createUser(User user);
}
