package com.zly.test;

import com.zly.service.IHelloService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2017/3/7 14:48
 */
public class App {

    private static ApplicationContext ctx;


    public static void main(String[] args){
        ctx = new ClassPathXmlApplicationContext("classpath:spring/common/spring-aop.xml");

        IHelloService helloService = ctx.getBean("helloService",IHelloService.class);
        helloService.SayHello("哈哈哈哈哈哈");
    }
}
