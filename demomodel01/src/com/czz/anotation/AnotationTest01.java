package com.czz.anotation;

import java.lang.reflect.Field;
import java.util.Arrays;

public class AnotationTest01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c =Class.forName("com.czz.anotation.User");
        Field[] declaredFields = c.getDeclaredFields();
        boolean flag=false;
        for (Field f:declaredFields) {
           if (f.isAnnotationPresent(MyAnnotation.class)){
              if (f.getType().getSimpleName().equals("int")&&f.getName().equals("id")){
                 flag=true;
              }
           }
        }
        System.out.println(flag);
        if (flag){
            System.out.println("符合要求");
        }else {
            try {
                throw  new MyException("类型可能不为int或名字不为id");
            } catch (MyException e) {
                e.printStackTrace();
            }
        }

    }
}
