package com.martain.study.controller;

import com.martain.study.common.response.BaseResponse;
import com.martain.study.service.inteface.IUserAdminService;
import com.martain.study.service.request.CreateUserRequest;
import com.martain.study.service.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/4/24 2:17 下午
 */
@RestController
@RequestMapping("/user")
public class UserAdminController {

    @Autowired
    IUserAdminService userAdminService;

    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/getUserById/{userId}")
    public BaseResponse<UserVO> getUserById(@PathVariable Integer userId){
        UserVO userVO = new UserVO();
        userVO.setUserName(serverPort);
        return BaseResponse.success(userVO);
    }

    @PostMapping("/createUser")
    public BaseResponse<Void> createUser(CreateUserRequest request){
        userAdminService.createUser(request);
        return BaseResponse.success();
    }


    @GetMapping("/sayHi")
    public String sayHi(){
        return "user-provide-userInfo service,port:"+serverPort+",number:"+ UUID.randomUUID().toString();
    }


}
