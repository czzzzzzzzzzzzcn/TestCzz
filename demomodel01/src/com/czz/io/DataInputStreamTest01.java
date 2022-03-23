package com.czz.io;

import java.io.*;

public class DataInputStreamTest01 {
    public static void main(String[] args) {
        DataInputStream  dis =null;
        try {
            dis= new DataInputStream(new FileInputStream("demomodel01/src/com/fiel/file07"));
           int i= dis.read();
           int i1=dis.read();
           String s1= dis.readUTF();
            System.out.println(i);
            System.out.println(i1);
            System.out.println(s1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dis!=null){
                try {
                    dis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
