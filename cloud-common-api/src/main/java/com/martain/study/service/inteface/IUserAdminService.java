package com.martain.study.service.inteface;

import com.martain.study.service.request.CreateUserRequest;
import com.martain.study.service.vo.UserVO;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/4/23 3:42 下午
 */
public interface IUserAdminService {

    /**
     * 通过id获取用户
     * @param userId
     * @return
     */
    UserVO getUserById(Integer userId);

    /**
     * 添加用户
     * @param request
     * @return
     */
    int createUser(CreateUserRequest request);
}
