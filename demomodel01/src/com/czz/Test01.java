package com.czz;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test01 implements MyInterface{
    public static void main(String[] args) {
        System.out.println(no);
        int arr[] ={1,2,3};
        int arr1[] =new int[arr.length+1];
     System.arraycopy(arr,0,arr1,1,arr.length);
        System.out.println(Arrays.toString(arr1));

    }

    @Override
    public void test() {

    }
}
