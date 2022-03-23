package com.czz.collection;

import java.util.TreeSet;
//Comparable 设置TreeSet的比较规则，进而排序，第一种方式
public class TreeSetTest01 {
    public static void main(String[] args) {
        Person p1 = new Person(20,"zs");
        Person p2 = new Person(18,"ls");
        Person p3  = new Person(23,"ww");
        Person p4  =  new Person (21,"zlCopy");
        Person p5  =  p4;
        TreeSet<Person> treeSet = new TreeSet<>();
       treeSet.add(p1);
       treeSet.add(p2);
       treeSet.add(p3);
       treeSet.add(p4);
       treeSet.add(p5);
        for (Person p:treeSet
             ) {
            System.out.println(p);
        }
    }
}
class Person implements Comparable<Person>{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int age, String name){
        this.name=name;
        this.age=age;
    }
    @Override
    public int compareTo(Person o) {
        if(this==o){
            return 0;
        }
        if (this.age==o.age){
            return this.name.compareTo(o.name);
        }else if (this.age>o.age) {
            return -1;
        }else {
            return 1;
        }

    }
}