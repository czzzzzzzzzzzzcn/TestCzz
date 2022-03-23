package com.czz.string;

public class StringTest {
    public static void main(String[] args) {
        //当字符串相加的部分中全部都是常量时，那么就会直接进入字符串池中进行操作，所以我们生成的str5对象地址就在字符串池中
        //String str3 = str1 + str2;当字符串相加部分中有变量，那么就会用StringBulider的方式来添加，那么返回的地址就是堆中的地址！
        //一个在堆中，一个在字符串池中，当然会是false
        String str1 = "abc";
        String str2 = "xyz";
        String str3=str1+str2;
        String str = "abc"+"xyz";
        System.out.println(str3.hashCode());
        String str4 = "abcxyz";
        System.out.println(str4.hashCode());
        System.out.println(str3==str4);//f
        System.out.println(str==str4);//t

        //凡是"" 包括都放在方法区中字符串常量池
        String s = "abc";
        String s1 = "abc";
        System.out.println(s==s1);//t


        //由于是采用new 对象的方案所以s2 s3 存放的是对象在堆当中的内存地址，
        // 而对象当中存放的"xyz"地址是相同的。这里共有三个对象
        String s2 = new String("xyz");
        String s3 = new String ("xyz");
        System.out.println(s2==s3);//f
        System.out.println(s2.equals(s3));//t
    }
}
