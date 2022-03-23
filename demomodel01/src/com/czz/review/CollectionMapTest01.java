package com.czz.review;

import java.util.*;
import  java.util.List;
import  java.util.ArrayList;
import  java.util.Iterator;

public class CollectionMapTest01 {
    public static void main(String[] args) {
        test03();
    }

    /**
     * 遍历List
     */
    public static void test01(){
        List<String> list = new ArrayList<>();
        list.add("2");
        list.add("23");
        list.add("3");
        list.add("232l;");
        for (String s:list
             ) {
            System.out.print("froEach:"+s);
        }
        System.out.println();
        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.print("iterator："+iterator.next());
        }
    }

    /**
     * 遍历map
     */
    public static void test02(){
        Map<String,String> map = new HashMap<>();
        map.put("1","zs");
        map.put("2","ls");
        map.put("3","ww");
        map.put("4","zl");
        Set<String> set = map.keySet();
        for (String key:set) {
            System.out.print(key+":"+map.get(key));
        }
        System.out.println();
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String,String> node:entries
             ) {
            System.out.print(node.getKey()+":"+node.getValue());
        }
    }

    /**
     * TreeSet 比较
     *
     */
    public static void test03(){
        TreeSet personSet=new TreeSet();
      personSet.add(new Person("zs",3));
      personSet.add(new Person("ls",1));
      personSet.add(new Person("jf",2));
      personSet.add(new Person("j",5));
      Iterator iterator = personSet.iterator();
      while (iterator.hasNext()){
          System.out.println( iterator.next());
      }
    }

}
class Person implements Comparable<Person>{
     private String name;

   private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }



    @Override
    public int compareTo(Person o) {
        if (o==this){
            return 0;
        }
        if (o.id==this.id){
            return o.name.compareTo(this.name);
        }else if (o.id>this.id){
            return -1;
        }else {
            return 1;
        }
    }
}