package com.czz.string;

import java.util.Arrays;

public class StringTest01 {
    public static void main(String[] args) {

        //按顺序一个一个比较，根据字典值，用前一个字符字典值相减相同0，不同为正1，负-1
        System.out.println("xyz".compareTo("xyz"));//0
        System.out.println("xz".compareTo("xy"));//1
        System.out.println("xy".compareTo("xz"));//-1

        //将字符串转为byte数组，数组值为ascii
        byte[] bytes ="abc".getBytes();
        /*
        97
        98
        99
         */
        for (byte b:bytes
             ) {
            System.out.println(b);
        }

        //判断是否以特定字符串结尾
        System.out.println("HelloWorld.java".endsWith(".java"));//t
        //判断是否以特定字符串开始
        System.out.println("HelloWorld.java".startsWith("Hello"));//t

        //判断是否包含特定子串
        System.out.println("HelloWorld.java.World".contains("World"));//t

        //返回字符串当中特定下标字符
        System.out.println("HelloWorld.java".charAt(5));//W

        //查找指定元素下标
        System.out.println("javaC#php".indexOf("C"));//4

        //忽略大小写的equals
        System.out.println("Abc".equalsIgnoreCase("abc"));//t


        //判断字符串是否为空
        System.out.println("".isEmpty());//t



        //返回字串最后一次出现的下标
        System.out.println("javajavajava".lastIndexOf("java"));//8

        //将字符串转为char数组
        char[] chars = "http".toCharArray();
        for (char c:chars
             ) {
            System.out.print(c+",");
        }
        //h,t,t,p,
        System.out.println("");

        //将指定字串替换
        System.out.println("http://www.baidu.com".replace("http:","https:"));//https://www.baidu.com

        //根据指定字符作为分割（不包括该字符），分割子串
        System.out.println(Arrays.toString("1980-2-19".split("-")));//[1980, 2, 19]

        //截取指定下标字符串
        System.out.println("http://www.baidu.com".substring(7));
        System.out.println("http://www.baidu.com".substring(7,10));//包头不包尾7开始9结束，www

        //装换大小写
        System.out.println("Abc".toLowerCase());//abc
        System.out.println("abC".toUpperCase());//ABC


        // 20（掌握）. String trim();
        // 去除字符串前后空白
        System.out.println("           hello      world             ".trim());

        // 21（掌握）. String中只有一个方法是静态的，不需要new对象
        // 这个方法叫做valueOf
        // 作用：将“非字符串”转换成“字符串”
        //String s1 = String.valueOf(true);
        //String s1 = String.valueOf(100);
        //String s1 = String.valueOf(3.14);

        // 这个静态的valueOf()方法，参数是一个对象的时候，会自动调用该对象的toString()方法吗？
        String s1 = String.valueOf(new Customer());
        //System.out.println(s1); // 没有重写toString()方法之前是对象内存地址 com.bjpowernode.javase.string.Customer@10f87f48
        System.out.println(s1); //我是一个VIP客户！！！！

        // 我们是不是可以研究一下println()方法的源代码了？
        System.out.println(100);
        System.out.println(3.14);
        System.out.println(true);

        Object obj = new Object();
        // 通过源代码可以看出：为什么输出一个引用的时候，会调用toString()方法!!!!
        //　本质上System.out.println()这个方法在输出任何数据的时候都是先转换成字符串，再输出。
        System.out.println(obj);

        System.out.println(new Customer());
    }


}
class Customer{}