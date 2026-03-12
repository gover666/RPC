package com.shr.shrrpc.springboot.starter.annotation;

import com.shr.shrrpc.springboot.starter.bootstrap.RpcConsumerBootstrap;
import com.shr.shrrpc.springboot.starter.bootstrap.RpcInitBootstrap;
import com.shr.shrrpc.springboot.starter.bootstrap.RpcProviderBootstrap;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 启用 Rpc 注解
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Import({RpcInitBootstrap.class, RpcConsumerBootstrap.class, RpcProviderBootstrap.class})
public @interface EnableRpc {

    /**
     * 需要启动 server
     *
     * @return
     */
    boolean needServer() default true;
}
