package com.czz.io;

import java.io.*;

//BufferReaderTest01缓冲流
//InputStreamReader转换流
public class BufferReaderTest01 {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\knowladge\\1-Java\\java-newFirst\\foundation\\javaseTest\\demomodel01\\src\\com\\czz\\io\\CopyTest01.java")));
            String s="";
            while ((s=br.readLine())!=null){
                System.out.print(s+"\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br!=null){
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }
}
