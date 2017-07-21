package com.ssm.service.impl;

import com.ssm.mapper.UserMapper;
import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/7/20.
 */
@Component
public class UserServiceImpl implements UserService{
    @Autowired(required = false)
    private UserMapper userMapper;
    @Override
    public User getUserById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }
}
