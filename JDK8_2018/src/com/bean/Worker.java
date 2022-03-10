package com.bean;

import com.jdk.lambda.inter.FiledAnnotation;
import com.jdk.lambda.inter.MethodAnnotation;
import com.jdk.lambda.inter.TypeAnnotation;

/**
 * @Author lisang
 * @Date 2022/3/10 21:50
 * @Description
 * @Version 1.0
 */
@TypeAnnotation(value = "doWork")
public class Worker {

    @FiledAnnotation(value = "CSDN博客")
    private String myfield = "";

    @MethodAnnotation()
    public String getDefaultInfo() {
        return "do the getDefaultInfo method";
    }

    @MethodAnnotation(name = "百度", url = "www.baidu.com")
    public String getDefineInfo() {
        return "do the getDefineInfo method";
    }
}
