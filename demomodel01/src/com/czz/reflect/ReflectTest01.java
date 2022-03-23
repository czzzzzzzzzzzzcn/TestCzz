package com.czz.reflect;

public class ReflectTest01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1=Class.forName("java.lang.String");
        System.out.println(c1);
        String s = "abc";
        Class<? extends String> aClass = s.getClass();
        System.out.println(aClass);
       Class c3 = String.class;
        System.out.println(c3);
        System.out.println(c1==aClass&aClass==c3);
    }
}
