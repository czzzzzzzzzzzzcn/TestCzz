package com.czz.javaSeHomeWork;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {4,65,2,63,6,22,1,-1,9};
       maoPaoSort(arr);

        System.out.println(Arrays.toString(arr));
    }
    public static void xuanZheSort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            int min=arr[i];
            int index = i;
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[j]<min){
                    min=arr[j];
                    index=j;
                }

            }
            int temp = arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
    }

    public static void maoPaoSort(int[] arr){
        for (int i = arr.length-1; i >=0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp  = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= temp;
                }

            }
        }
    }
}
