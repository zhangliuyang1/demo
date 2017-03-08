package com.zly.service.impl;

import com.zly.service.IHelloService;
import org.springframework.stereotype.Service;

/**
 * @author zhangliuyang
 * @email zhangliuyang@nggirl.com.cn
 * @date 2017/3/7 14:35
 */
@Service("helloService")
public class HelloServiceImpl implements IHelloService {

    @Override
    public void SayHello(String words) {
        System.out.println("-----Hello World !------" + words);
    }
}
