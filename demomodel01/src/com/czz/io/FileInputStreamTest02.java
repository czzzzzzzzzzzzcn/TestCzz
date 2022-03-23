package com.czz.io;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest02 {
    public static void main(String[] args) {
        FileInputStream fis =null;
        try {
            fis = new FileInputStream("D:\\knowladge\\1-Java\\java-newFirst\\foundation\\javaseTest\\demomodel01\\src\\com\\fiel\\file01");
            byte[] bytes = new byte[6];
            int readData = 0;
            while ((readData=fis.read(bytes))!=-1){
//                System.out.print( readData); 此时返回的不是文件内容的字节码而是字节的数目，与不传参数不同
//                System.out.println(bytes.length);
//                System.out.println(new String(bytes));这里把整个数组都传进去了，浪费
                System.out.print(new String(bytes,0,readData));//读多少传多少


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
