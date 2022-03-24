package com.czz.servlet;

public class Test {
    public static void main(String[] args) {
        int[] nums={10,5,2,6};
        int[] nums1={3,2,4};
        int k=100;
        int count=0;
        count=numSub(nums,k);
//        count=numSub2(nums,k);
        System.out.println(count);

        System.out.println("===============");
        int[] ints = twoSum(nums1, 6);
        for (int i : ints) {
            System.out.println(i);
        }
        System.out.println("===============");
        System.out.println("Test Git!");
        System.out.println("===============");
        System.out.println("Test hot-fix");
        System.out.println("Test master2");
        System.out.println("Test hot-fix2");
        System.out.println("Test push");
        System.out.println("Test pull");


    }

    private static int numSub(int[] nums, int k) {
        int count=0;
        long product=1;
        int left=0;
        for (int right = 0; right <nums.length ; right++) {
            product *=nums[right];
            while(left<=right && product>=k){
                product /=nums[left++];
            }
            count +=right>=left ? right-left+1 : 0;
        }
        return count;

    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            while(j<nums.length){
                if(nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }else {
                    j++;
                }
            }
        }
        return new int[] {0};
    }

}

