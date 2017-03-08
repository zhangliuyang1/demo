package com.zly.aop;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2017/3/7 14:33
 */
public class HelloAspect {

    public void beforeAdvice(){
        System.out.println("======before advice");
    }


    public void afterFinallyAdvice(){
        System.out.println("=======after finally advice");
    }
}
