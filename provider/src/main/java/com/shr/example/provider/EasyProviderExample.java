package com.shr.example.provider;

import com.shr.example.common.service.UserService;
import com.shr.example.rpc.server.HttpServer;
import com.shr.example.rpc.server.VertxHttpServer;
import com.shr.example.rpc.registry.LocalRegistry;

public class EasyProviderExample {
    public static void main(String[] args) {
            // 注册服务
            LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);

            // 启动 web 服务
            HttpServer httpServer = new VertxHttpServer();
            httpServer.doStart(8080);
    }
}
