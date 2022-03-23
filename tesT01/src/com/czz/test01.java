package com.czz;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test01 {
    public static void main(String[] args) {
    int arr[] ={-2,1,-3,4,-1,2,1,-5,4};
   System.out.println( maxSubArray(arr));

    }
    public static  int majorityElement(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i>nums.length/2+1;i++){
            if(nums[i]==nums[i+nums.length/2]){
                return nums[i];
            }
        }

        return -1;
    }
    public static int maxSubArray(int[] nums) {
        if (nums==null||nums.length==0){
            return 0;
        }
        int maxValue=nums[0]+nums[1];
        for (int i = 0; i <nums.length ; i++) {
            int cur=nums[i];
            for (int j = i+1; j < nums.length; j++) {
                cur+=nums[j];
                if (cur>maxValue){
                    maxValue=cur;

                }
            }

        }
        return maxValue;
    }
}
