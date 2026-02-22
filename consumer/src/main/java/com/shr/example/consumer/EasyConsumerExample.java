package com.shr.example.consumer;

import com.shr.example.common.model.User;
import com.shr.example.common.service.UserService;
import com.shr.example.rpc.proxy.ServiceProxyFactory;

public class EasyConsumerExample {
    public static void main(String[] args) {

        UserService userService = ServiceProxyFactory.getProxy(UserService.class);;
        User user = new User();
        user.setName("shr");
        // 调用
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
    }
}
