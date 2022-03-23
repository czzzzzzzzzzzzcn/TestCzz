package com.czz;

import java.util.HashMap;
import java.util.Map;

public class Test03 {
    public static void main(String[] args) {
        String s = "abcabcdeabcdefghjkla";//Abcdefghijk
        System.out.println(rLongStr(s));
    }
    public static int rLongStr(String s){
        if (s.length()==1){
            return 0;
        }
        s+=s.substring(s.length()-1,+s.length());
        char c[] = s.toCharArray();
        int index1=0;
        int k =0;
        String[] strings =new String[s.length()];
        for (int i = 1; i <s.length() ; i++) {
            for (int j = index1; j <i ; j++) {
                if (c[j]==c[i]){
                    strings[k++]=s.substring(index1,i);
                    index1=j+1;
                }

            }
            if (i==s.length()-1){
                strings[k]=s.substring(index1,i+1);
            }
        }

        int maxIndex=0;
        int max=strings[0].length();
        for (int i =1; i < strings.length; i++) {

            if(strings[i]!=null){
            if (strings[i].length()>max){
                max=strings[i].length();
                maxIndex=i;

            }

        }
        }
        return strings[maxIndex].length();
    }
}
