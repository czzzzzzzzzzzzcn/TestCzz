package com.czz.reviewsetandmap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayLIstTest01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵柳");
        System.out.println("_______________________");
        for (String s:list){
            System.out.println(s);
        }
        System.out.println("_______________________");
        list.set(0,"zs");
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("_______________________");
        list.remove("zs");
        list.remove(1);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("_______________________");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("_______________________");
        Iterator iterator1 =list.iterator();
        for (;iterator1.hasNext();){
            System.out.println(iterator1.next());
        }
    }
}
