package com.jdk.lambda.inter.impl;

import com.jdk.lambda.inter.LambdaInterface;

/**
 * @Author lisang
 * @Date 2022/3/10 21:39
 * @Description
 * @Version 1.0
 */
public class LambdaInterfaceImpl implements LambdaInterface {
    @Override
    public void doSomething(String s) {
        System.out.println("inter impl " + s);
    }
}
