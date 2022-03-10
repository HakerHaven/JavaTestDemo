package com.jdk.lambda;

import com.jdk.lambda.inter.LambdaInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * JDK 1.8 -> lambda表达式的使用
 * Create by lisang on 2018/10/6.
 */
public class LambdaTest {

    public static void main(String[] args) {
        String pre = "-";
        Arrays.asList("a", "b", "c").forEach(e -> System.out.println(pre + e));

        final String last = ".";
        Arrays.asList("a", "b", "c").forEach(e -> System.out.println(e + last));

        Arrays.asList("a", "b", "c").sort((e1, e2) -> e1.compareTo(e2));
        String str = "Hello";
        System.out.println(str.startsWith("E"));


    }

}
