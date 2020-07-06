package com.martain.study.service.vo;

import com.martain.study.model.entity.User;
import lombok.Data;
import org.springframework.beans.BeanUtils;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/4/24 2:01 下午
 */
@Data
public class UserVO {
    private Integer id;
    private String userName;
    private Integer age;

    public static UserVO of(User user){
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(user,userVO);
        return userVO;
    }
}
