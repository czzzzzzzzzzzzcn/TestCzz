package com.czz.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutStreamTest01 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("demomodel01\\src\\com\\obj"));
        Student student = new Student("zs",1);
        objectOutputStream.writeObject(student);
        objectOutputStream.flush();
        objectOutputStream.close();
    }
}
