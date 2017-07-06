package com.sheng.dubboserver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by Administrator on 2017/6/28 0028.
 */
public class DubboProviderMain {
    public static void main(String[] args) throws IOException {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] { "applicationProvider.xml" });
        context.start();
        System.out.println("Press any key to exit.");
        System.in.read();
    }
}
