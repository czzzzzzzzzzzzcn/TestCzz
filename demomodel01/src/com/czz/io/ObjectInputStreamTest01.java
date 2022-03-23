package com.czz.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream  objectInputStream = new ObjectInputStream(new FileInputStream("demomodel01\\src\\com\\obj"));
       Student student = (Student) objectInputStream.readObject();
        System.out.println(student);
    }
}
