package com.martain.study.service;

import com.martain.study.common.exception.OperationFailingException;
import com.martain.study.model.entity.User;
import com.martain.study.model.service.UserService;
import com.martain.study.service.inteface.IUserAdminService;
import com.martain.study.service.request.CreateUserRequest;
import com.martain.study.service.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/4/24 2:17 下午
 */
@Service
public class UserAdminService implements IUserAdminService {

    @Autowired
    UserService userService;

    /**
     * 通过id获取用户
     *
     * @param userId
     * @return
     */
    @Override
    public UserVO getUserById(Integer userId) {
        UserVO userVO= new UserVO();
        userVO.setId(1);
        userVO.setUserName("consul Test");
        userVO.setAge(18);
        return userVO;
    }
    /**
     * 添加用户
     *
     * @param request
     * @return
     */
    @Override
    public int createUser(CreateUserRequest request) {
        User user = request.toEntity();
        int effectRows  = userService.createUser(user);
        if (effectRows == 0){
            throw new OperationFailingException("添加用户失败");
        }
        return effectRows;
    }
}
