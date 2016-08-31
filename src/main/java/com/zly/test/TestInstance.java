package com.zly.test;

import java.util.Calendar;
import java.util.Date;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/5/24  16:07
 */
public class TestInstance {

    public static TestInstance newInstance(){
        return new TestInstance();
    }

    public void display(){
        System.out.println("hhahah");
    }
    public static void main(String[] args){
        Long sum = 0l;
        long starTime = new Date().getTime();
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum+=i;
        }
        System.out.println(new Date().getTime() - starTime);
        System.out.println(sum);
    }


}
