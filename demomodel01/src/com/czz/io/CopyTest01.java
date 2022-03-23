package com.czz.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTest01 {
    public static void main(String[] args) {
        FileOutputStream fos=null;
        FileInputStream fis=null;
        try {
            fos = new FileOutputStream("D:\\knowladge\\1-Java\\java-newFirst\\foundation\\javaseTest\\demomodel01\\src\\com\\fiel\\file03",true);
            fis = new FileInputStream("D:\\knowladge\\1-Java\\java-newFirst\\foundation\\javaseTest\\demomodel01\\src\\com\\czz\\io\\FileInputStreamTest01.java");
            byte[] bytes = new byte[32];
            int readData=0;
            while ((readData=fis.read(bytes))!=-1){
                fos.write(bytes,0,readData);
            }
            fos.flush();
            System.out.println("复制完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
