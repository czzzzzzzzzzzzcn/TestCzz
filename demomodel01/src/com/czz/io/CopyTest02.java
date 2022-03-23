package com.czz.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTest02 {
    public static void main(String[] args) {
        FileWriter fw = null;
        FileReader fr =null;
        try {
            fw = new FileWriter("D:\\knowladge\\1-Java\\java-newFirst\\foundation\\javaseTest\\demomodel01\\src\\com\\fiel\\file05",true);
            fr = new FileReader("D:\\knowladge\\1-Java\\java-newFirst\\foundation\\javaseTest\\demomodel01\\src\\com\\czz\\io\\CopyTest01.java");
            char[] chars = new char[32];
            int readData=0;
            while ((readData=fr.read(chars))!=-1){
                fw.write(chars,0,readData);
            }
            System.out.println("字符流复制成功！");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
