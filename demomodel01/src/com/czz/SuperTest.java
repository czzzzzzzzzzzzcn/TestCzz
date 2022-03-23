package com.czz;

public class SuperTest {
    public static void main(String[] args) {
        B b = new B("张三");
        String s = new String();

    }
}
class A{
    String name;
    public A(){}
    public A(String name){
        this.name=name;
        System.out.println(this.name+"父类中的this.name");
    }
}
class B extends A{
    String name;
    public B(String name){
        super(name);
        System.out.println(this.name+"子类中的this.name");
        System.out.println(super.name+"子类中的super.name");
    }
}



