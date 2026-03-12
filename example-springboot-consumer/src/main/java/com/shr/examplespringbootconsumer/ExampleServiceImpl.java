package com.shr.examplespringbootconsumer;

import com.shr.example.common.model.User;
import com.shr.example.common.service.UserService;
import com.shr.shrrpc.springboot.starter.annotation.RpcReference;
import org.springframework.stereotype.Service;

@Service
public class ExampleServiceImpl {

    @RpcReference
    private UserService userService;

    public void test() {
        User user = new User();
        user.setName("shr");
        User resultUser = userService.getUser(user);
        System.out.println(resultUser.getName());
    }

}
