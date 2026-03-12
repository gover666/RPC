package com.shr.example.consumer;

import com.shr.example.common.model.User;
import com.shr.example.common.service.UserService;
import com.shr.core.rpc.proxy.ServiceProxyFactory;

/**
 * 简易服务消费者示例
 *
 */
public class EasyConsumerExample {

    public static void main(String[] args) {
        // 静态代理
//        UserService userService = new UserServiceProxy();
        // 动态代理
        UserService userService = ServiceProxyFactory.getProxy(UserService.class);
        User user = new User();
        user.setName("yupi");
        // 调用
        User newUser = userService.getUser(user);
        if (newUser != null) {
            System.out.println(newUser.getName());
        } else {
            System.out.println("user == null");
        }
    }
}