package com.shr.example.provider;

import com.shr.core.rpc.registry.LocalRegistry;
import com.shr.example.common.service.UserService;
import com.shr.core.rpc.RpcApplication;
import com.shr.core.rpc.server.HttpServer;
import com.shr.core.rpc.server.VertxHttpServer;



public class EasyProviderExample {

    public static void main(String[] args) {
        // RPC 框架初始化
        RpcApplication.init();

        // 注册服务
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);

        // 启动 web 服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(RpcApplication.getRpcConfig().getServerPort());
    }
}

