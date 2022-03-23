package com.czz.baozhuang;

import java.sql.SQLOutput;

public class IntegerTest {
    public static void main(String[] args) {
        //两种构造方法，手动装箱
        Integer integer = new Integer("1234");
        Integer integer1 = new Integer(134);
        System.out.println(integer);//1234
        System.out.println(integer1);//134
        //手动拆箱
        int i = integer.intValue();
        System.out.println(i);//1234

        //自动装箱
        Integer integer2 = 100;
        //自动拆箱
        int x = integer2;

        //最大最小值
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
