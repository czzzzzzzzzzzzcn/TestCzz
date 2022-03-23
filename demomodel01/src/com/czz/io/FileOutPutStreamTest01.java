package com.czz.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream fos= null;
        String s = "abcdefg";
        byte[] bytes=s.getBytes();
        try {
            fos= new FileOutputStream("D:\\knowladge\\1-Java\\java-newFirst\\foundation\\javaseTest\\demomodel01\\src\\com\\fiel\\file02",true);
            fos.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
