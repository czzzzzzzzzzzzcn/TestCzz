package com.czz.javaSeHomeWork;

import java.util.Arrays;

public class Query {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7};
        int[] arr2 = new int[10];
        System.arraycopy(arr,0,arr2,0,7);//数组复制

        System.out.println(Arrays.toString(arr2));
        System.out.println(zheBanQuery(0,arr.length-1,arr,1));
        System.out.println(zheBanQuery2(arr,7));

        //现成的查找算法
       int index= Arrays.binarySearch(arr,6);
        System.out.println(index);
    }

    /**
     * 递归折半查找
     * @param left
     * @param right
     * @param arr
     * @param element
     * @return
     */
    public static int zheBanQuery(int left,int right,int[] arr,int element){
        if (left>right){
            return -1;
        }
            int mid = (left + right) / 2;
            if (element == arr[mid]) {
                return mid;
            } else if (element < arr[mid]) {
                return zheBanQuery(left, mid - 1, arr, element);
            } else {
               return zheBanQuery(mid + 1, right, arr, element);
            }

    }

    /**
     * 非递归折半查找
     * @param arr
     * @param dest
     * @return
     */
    public static int zheBanQuery2(int[] arr,int dest){
        int begin=0;
        int end = arr.length-1;
        while (begin<=end){
            int mid = (begin+end)/2;
            if (dest==arr[mid]){
                return mid;
            }else if (dest<arr[mid]){
                end= mid-1;
            }else {
                begin=mid+1;
            }
        }
        return -1;
    }
}
