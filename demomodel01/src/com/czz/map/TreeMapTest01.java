package com.czz.map;
//map的多种遍历方式
import java.util.*;

public class TreeMapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> map  = new HashMap<>();
        map.put(1,"zs");
        map.put(2,"ls");
        map.put(3,"ww");
        map.put(4,"zl");
        print04(map);
    }
    public static  void print01(Map<Integer,String> map){
        System.out.println("第一种");
        Set<Integer> integers = map.keySet();
        Iterator iterator = integers.iterator();
        while (iterator.hasNext()){
          //  System.out.println("Key:"+iterator.next()+"Value:"+ map.get(iterator.next()));//这样不行因为每次next()都走了一步
            Integer key = (Integer) iterator.next();
            System.out.println("Key:"+key+"   Value:"+ map.get(key));
        }
    }
    public static void print02(Map<Integer,String> map){
        System.out.println("第二种");
        Set<Integer> integers = map.keySet();
        for (Integer key:integers) {
            System.out.println("Key:"+key+"   Value:"+ map.get(key));
        }
    }
    public static void print03(Map<Integer,String> map){
        System.out.println("第三种");
        Set<Map.Entry<Integer,String>> entries = map.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator = entries.iterator();
        //Iterator中泛型只能是与对应collection中类型中一致
        while (iterator.hasNext()){
            Map.Entry<Integer,String> node=  iterator.next();
            System.out.println("Key:"+node.getKey()+"   Value:"+ node.getValue());

        }

    }
    public static void print04(Map<Integer,String> map){
        System.out.println("第四种");
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer,String> node:entries) {
            System.out.println("Key:"+node.getKey()+"   Value:"+ node.getValue());
        }
    }
    public static  void test(){
        String s = new String("");
        if (! (s instanceof String)){

        }
    }
}
