package com.zly.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2017/3/7 16:12
 */
public class HelloAdvice implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object[] args = methodInvocation.getArguments();
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i].toString());
        }

        Method method =  methodInvocation.getMethod();
        System.out.println(method.getName());
        System.out.println("kskddddd");

        methodInvocation.proceed();
        return null;
    }
}
