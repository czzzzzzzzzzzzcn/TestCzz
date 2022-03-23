package com.czz.reflect.reflectio;

public class User extends Object implements Runnable {
    public String name;
    int age;
    public User() {
        System.out.println("user构造方法执行");
        System.out.println("user对象创建");
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static final String toStr(String[] a,String b,String c) {
        System.out.println("toStr方法执行");
        return "User{" +
                "name='"  + '\'' +
                ", age="  +
                '}';
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void run() {

    }
}
