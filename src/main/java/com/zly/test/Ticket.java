package com.zly.test;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/8/9  17:05
 */
public class Ticket implements Runnable {
    private int ticket = 10;
    @Override
    public void run() {
        while (ticket > 0){
            ticket--;
            System.out.print(Thread.currentThread().getName());
            System.out.println("但钱票数："+ticket);

        }
    }
}
