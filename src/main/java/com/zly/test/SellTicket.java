package com.zly.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2016/8/9  17:07
 */
public class SellTicket {

    public static void main(String[] args) throws Exception{
        Ticket t = new Ticket();
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        t1.start();
        t2.start();

    }
}
