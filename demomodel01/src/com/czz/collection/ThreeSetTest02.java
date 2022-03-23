package com.czz.collection;

import java.util.Comparator;
import java.util.TreeSet;

//使用Comparator 对TreeSet排序规则改写
public class ThreeSetTest02 {
    public static void main(String[] args) {
        People p1 = new People(20,"zs");
        People p2 = new People(18,"ls");
        People p3  = new People(23,"ww");
        People p4  =  new People (21,"zlCopy");
        People p5  =  p4;
        TreeSet<People> treeSet = new TreeSet<>(new PeopleCompleTo());
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        treeSet.add(p4);
        treeSet.add(p5);
        for (People p:treeSet
        ) {
            System.out.println(p);
        }
    }

}
class People{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "People{" +
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

    public People(int age, String name){
        this.name=name;
        this.age=age;
    }
}

class PeopleCompleTo implements Comparator<People>{

    @Override
    public int compare(People o1, People o2) {
        if(o1==o2){
            return 0;
        }
        if (o1.getAge()==o2.getAge()){
            return o1.getName().compareTo(o2.getName());
        }else if (o1.getAge()>o2.getAge()) {
            return -1;
        }else {
            return 1;
        }
    }
}