package com.czz.reviewsetandmap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//set好象没有修改的方法,转为list也后就可以修改了
public class HashSetTest01 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("张三");
        set.add("李四");
        set.add("王五");
        set.add("赵柳");
        for (String s:set
             ) {
            System.out.println(s);
        }

        System.out.println("____________________________________");

        List<String> arr = new ArrayList<>(set);
       arr.set( arr.indexOf("张三"),"zs");
        Set<String> set1 = new HashSet<>(arr);
        for (String s:
             set1) {
            System.out.println("set!:"+s);
        }

        System.out.println("__________________________________________");

    }
}
