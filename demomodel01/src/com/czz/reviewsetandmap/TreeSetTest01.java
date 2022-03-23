package com.czz.reviewsetandmap;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest01 {
    public static void main(String[] args) {
        TreeSet<Person> peoples = new TreeSet<>();
        peoples.add(new Person(1,"xiaoMing"));
        peoples.add(new Person(4,"xiaoHong"));
        peoples.add(new Person(3,"xiaoLi"));
        peoples.add(new Person(2,"xiaoMa"));
        Iterator iterator = peoples.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("===============================================");
        TreeSet<Dog> dogs = new TreeSet<>(new DogComparable());
        dogs.add(new Dog(1,"哈巴狗"));
        dogs.add(new Dog(4,"中华田园犬"));
        dogs.add(new Dog(3,"柴犬"));
        dogs.add(new Dog(2,"哈士奇"));
        for (Dog dog:dogs
             ) {
            System.out.println(dog);
        }
    }
}
class Person implements Comparable<Person>{
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }



    @Override
    public int compareTo(Person o) {
        if (this==o)return 0;
        if (this.age==o.age)return 0;
        if (this.age>o.age){
            return this.age-o.age;
        }else {
            return -1;
        }
    }
}

class Dog{

    int age;
    String name;

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
//比较器
class DogComparable implements Comparator<Dog>{

    @Override
    public int compare(Dog o1, Dog o2) {
        if (o1==o2)return 0;

        if (o1.age==o2.age){
            return o1.name.compareTo(o2.name);
        }else if (o1.age>o2.age){
            return 1;
        }else {
            return -1;
        }
    }
}