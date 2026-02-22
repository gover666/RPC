package com.shr.example.provider;


import com.shr.example.common.model.User;
import com.shr.example.common.service.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public User getUser(User user) {
        System.out.println("用户名：" + user.getName());
        return user;
    }
}
