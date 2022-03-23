package com.czz;

import java.util.ArrayList;

public class MaxSubString {
    public static void main(String[] args) {
        String s="abcabcdeabcdefghjkl";
        int ans= maxSubString(s);
        System.out.println("最长子串长度是:"+ans);
    }

    private static int maxSubString(String s) {
        char[] chars=s.toCharArray();
//        System.out.println(chars.length);
        int length = s.length();
        int left;
        int right;
        int index=0;
        int ans=0;
        ArrayList list = new ArrayList();

        for (left = 0; left <length ; left++) {
            for ( right = left+1; right <length ; right++) {
                if(chars[right]==chars[left]){
                    ans=right-left;
                    index=left;
                    left++;
                    list.add(ans);
                }
            }
            if(left==length-1){
                ans=left-index;
                list.add(ans);
            }


            //字符重复返回子串长度
            //字符不重复，右指针右移，继续上面判断
        }
        for (Object o : list) {
            System.out.println(o);
            ans = Math.max((int) o, ans);
        }
        return ans;
    }
}

