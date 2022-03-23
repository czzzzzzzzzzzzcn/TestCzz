package com.czz.test1;

import java.time.LocalDate;
import java.util.Arrays;

public class ArrayTest01 {
    public static void main(String[] args) {
        int[]  arr ={1,2,3};
        int[] arr1= Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr==arr1);


        int r = (int) (Math.random()*104);
        System.out.println(r);
        LocalDate date = LocalDate.now();
        System.out.println(date
        );
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getEra());
        System.out.println(date.getChronology());

    }


}
