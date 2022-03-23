package com.czz.test1;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 示例 1：
 *
 * 输入：s = "babad"
 * 输出："bab"
 * 解释："aba" 同样是符合题意的答案。
 * 示例 2：
 *
 * 输入：s = "cbbd"
 * 输出："bb"
 *  
 *
 */
public class Test02 {
    public static void main(String[] args) {
        String s = "bb";
        int start =0;
        int end = s.length()-1;
        char[] chars = s.toCharArray();
        Set<Character> cahr=new HashSet();
        for (char c:chars
             ) {
            cahr.add(c);
        }
//        if (cahr.size()==1){
//            return s;
//        }
        Set<String> strings =new HashSet<>();
        for (int i = 0; i <s.length()-1 ; i++) {
            for (int j =s.length()-1; j >i ; j--) {
                if (chars[i]==chars[j]){
                    if (isH(s,i,j)) {
                        end = j;
                        start = i;
                      strings.add(s.substring(i,j+1));
                    }
                }
            }
        }
        String max ="";
        if(end==s.length()-1){
            System.out.println(s.substring(0,start+1));
        }
        for (String str:strings) {
            if (str.length()>max.length()){
                max = str;
            }

        }
        System.out.println(max);
//        for (int i = 0; i <chars.length-1 ; i++) {
//            for (int j = i+1; j <chars.length; j++) {
//                if (chars[i]==chars[j]&&isH(s,i,j)){
//                    start=i;
//                    end=j;
//
//                }
//
//            }
//
//        }
//        if (end!=0) {
//            System.out.println(s.substring(start, end + 1));
//
//        }

       // isH(s,0,s.length()-1);
    }
    public static boolean isH(String s,int k,int p){
        char[] chars = s.toCharArray();
        for (int i =k,j=p ; i !=p; i++,j--) {
                if (chars[i]!=chars[j]){
                    return false;
                }
        }
        return true;
    }


}
