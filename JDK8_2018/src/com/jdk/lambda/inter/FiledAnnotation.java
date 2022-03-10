package com.jdk.lambda.inter;

import java.lang.annotation.*;

/**
 * @Author lisang
 * @Date 2022/3/10 21:48
 * @Description
 * @Version 1.0
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface FiledAnnotation {
    String value() default "GetFiledAnnotation";
}
