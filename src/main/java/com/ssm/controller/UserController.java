package com.ssm.controller;

import com.alibaba.fastjson.JSON;
import com.ssm.pojo.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/7/20.
 */
@RestController
public class UserController {
    @Autowired(required = false)
    private UserService userService;
    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String getUserById(){
        User user = userService.getUserById(1);
        String userStr= JSON.toJSONString(user);
        return userStr;
    }
}
