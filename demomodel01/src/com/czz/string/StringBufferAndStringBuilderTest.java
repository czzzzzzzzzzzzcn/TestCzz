package com.czz.string;

public class StringBufferAndStringBuilderTest {
    public static void main(String[] args) {
        //默认初始容量都为16
        //线程安全
        StringBuffer stringbuffer = new StringBuffer(16);
        stringbuffer.append("h");
        stringbuffer.append("e");
        System.out.println(stringbuffer.toString());
        //非线程安全
        StringBuilder sb = new StringBuilder(10);
    }
}
