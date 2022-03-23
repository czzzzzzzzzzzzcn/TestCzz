package com.czz.anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)//表示只能出现在属性当中
@Retention(RetentionPolicy.RUNTIME)//表示注解可以出现在字节码文件当中，并可以反射出来
public @interface MyAnnotation {
}
