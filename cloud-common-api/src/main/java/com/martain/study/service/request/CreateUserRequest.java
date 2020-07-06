package com.martain.study.service.request;

import com.martain.study.model.entity.User;
import lombok.Data;
import org.springframework.beans.BeanUtils;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/4/26 4:55 下午
 */
@Data
public class CreateUserRequest {

    private String userName;

    private Integer age;

    public User toEntity() {
        User user = new User();
        BeanUtils.copyProperties(this,user);
        return user;
    }
}
