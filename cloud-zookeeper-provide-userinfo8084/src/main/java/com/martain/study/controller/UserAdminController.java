package com.martain.study.controller;

import com.martain.study.common.response.BaseResponse;
import com.martain.study.service.inteface.IUserAdminService;
import com.martain.study.service.request.CreateUserRequest;
import com.martain.study.service.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/4/24 2:17 下午
 */
@RestController
@RequestMapping("/user")
public class UserAdminController {

    @Value("${server.port}")
    private String serverPort;


    @Autowired
    IUserAdminService userAdminService;

    @GetMapping("/getUserById/{userId}")
    public BaseResponse<UserVO> getUserById(@PathVariable Integer userId){
//        UserVO userVO = userAdminService.getUserById(userId);
        UserVO userVO = new UserVO();
        userVO.setId(userId);
        userVO.setUserName("测试用户");
        userVO.setAge(Integer.valueOf(serverPort));
        return BaseResponse.success(userVO);
    }

    @PostMapping("/createUser")
    public BaseResponse<Void> createUser(CreateUserRequest request){
        userAdminService.createUser(request);
        return BaseResponse.success();
    }
}
