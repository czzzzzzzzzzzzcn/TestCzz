package com.czz;
//接口之间能被继承不能被实现，不能实例化因为没有构造函数概念
public interface MyInterface {
//    这里必须初始化
//    接口中所有变量都是public static final类型，且必须初始化
    String no="3948";
//    String no;错误
    public abstract void test();
    //接口当中可以有静态方法，调用跟类中的一样
    static void test01(){
        System.out.println("接口中的静态方法");
    }


}
interface MyInterface1 extends MyInterface{

}
class test implements MyInterface1{

    @Override
    public void test() {

    }

    public static void main(String[] args) {
        MyInterface.test01();
        System.out.println();

    }
}
abstract class absClass{
    //抽象方法不能是静态的，抽象类中可以有其他方法
    //另外final关键字与abstract是冲突的。

    //    这里必须初始化
//    接口中所有变量都是public static final类型，且必须初始化

    String no="1";
    public abstract void test01();
    public static void test(){
        System.out.println("实例方法");
    }
    public static void test03(){
        System.out.println("非静态方法");
        String s=new String();
    }
}

class absClassSon extends absClass{
//继承抽象类必须实现抽象方法。
    public void test01() {
        System.out.println(no);
    }
}