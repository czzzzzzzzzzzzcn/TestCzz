package com.czz.reviewsetandmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"猪");
        map.put(2,"猴");
        map.put(3,"狗");
        map.put(4,"猫");
        Set<Integer> integers = map.keySet();
        for (Integer s: integers) {
            System.out.println(map.get(s));
        }
        System.out.println("修改后：——————————————————————————");
        map.put(2,"蛇");
        for (Integer s: integers) {
            System.out.println("Key:"+s+"  Value:"+map.get(s));
        }
        System.out.println("_____________________________");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry node:entries
             ) {
            System.out.println("Key:"+node.getKey()+"  Value:"+node.getValue());
        }
    }

}
