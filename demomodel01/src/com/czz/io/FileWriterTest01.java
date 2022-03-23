package com.czz.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("D:\\knowladge\\1-Java\\java-newFirst\\foundation\\javaseTest\\demomodel01\\src\\com\\fiel\\file04");
            String s ="I am Chinese!";
            fw.write(s);
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
        }
    }
}
