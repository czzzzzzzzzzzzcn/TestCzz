package com.czz.baozhuang;

import java.util.Random;

public class RanDomTest {
    public static void main(String[] args) {
        Random random  = new Random();
//        指定范围
        int val = random.nextInt(100)+10;
        System.out.println(val);
    }
}
