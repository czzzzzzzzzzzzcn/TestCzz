package com.czz.reflect;

import java.util.Date;

public class ReflectTest02 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
       // Class c = Date.class;//获取class时不会类加载执行
        //Class c =Class.forName("com.czz.reflect.MyClass");//这个会类加载
        MyClass myClass = new MyClass();
        System.out.println("+++++++++++++++++");
        Class c  = myClass.getClass();//不会导致类加载，
        Object o = c.newInstance();
        System.out.println(o);
    }
}
class MyClass{
    static {
        System.out.println("类加载");
    }
    public MyClass(){
        System.out.println("Myclass的无参构造方法执行");
    }
}