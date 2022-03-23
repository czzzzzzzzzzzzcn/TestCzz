package com.czz.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest01 {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        ((ArrayList) collection).add("11");
        ((ArrayList) collection).add(100000);
        System.out.println("____________________________________");
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
         if (iterator.next().equals("11")){
             iterator.remove();
         }
        }
        System.out.println("____________________________________");
        Iterator iterator1 = collection.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println(collection.size());
        int i =1;
        while (true){
           String s = new String(String.valueOf(i++));
        }
    }
}
