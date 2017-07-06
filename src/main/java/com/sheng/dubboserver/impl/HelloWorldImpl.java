package com.sheng.dubboserver.impl;

import com.sheng.dubboserver.HelloWorld;

/**
 * Created by Administrator on 2017/6/28 0028.
 */
public class HelloWorldImpl implements HelloWorld {
    public String hello(String name) {
        System.out.println("执行了-----------------");
        name = name + "小明测试";
        return name;
    }
}
