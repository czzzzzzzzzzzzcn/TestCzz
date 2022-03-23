package com.czz.expection;

import java.io.IOException;

public class MyException extends Exception {
    public MyException(){}
    public MyException(String s){
        super(s);
    }

    public static void main(String[] args) {
        try {
            throw new MyException("哈哈！");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}

class A{
    void dosom()throws NullPointerException{}
}
class B extends A{
    @Override
    void dosom() throws NullPointerException
    {
        System.out.println("iijs");
    }
}

class C{

}