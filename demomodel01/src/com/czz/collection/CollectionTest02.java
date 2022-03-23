package com.czz.collection;
//泛型继承object,所以不能是引用数据类型
public class CollectionTest02 {
    public static void main(String[] args) {
        A<String> a = new A();
        a.dosonm("ho");
    }
}
class A<E>{
    public void dosonm(E e){
        System.out.println("helloworld");
    }
}