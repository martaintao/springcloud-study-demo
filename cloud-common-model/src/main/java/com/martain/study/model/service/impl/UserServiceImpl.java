package com.martain.study.model.service.impl;

import com.martain.study.model.dao.UserDynamicSqlSupport;
import com.martain.study.model.dao.UserMapper;
import com.martain.study.model.entity.User;
import com.martain.study.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

/**
 * @author Martin
 * @version 1.0
 * @date 2020/4/26 4:42 下午
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User findById(Integer userId) {
        Optional<User> user = userMapper.selectOne(c -> c.where(UserDynamicSqlSupport.id, isEqualTo(userId)));
        return user.orElse(null);
    }

    @Override
    public int createUser(User user) {
        return userMapper.insertSelective(user);
    }
}
