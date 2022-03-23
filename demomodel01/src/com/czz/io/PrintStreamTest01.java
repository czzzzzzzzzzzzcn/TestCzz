package com.czz.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest01 {
    public static void main(String[] args) {
        PrintStream ps =null;
        try {
            ps = new PrintStream(new FileOutputStream("D:\\knowladge\\1-Java\\java-newFirst\\foundation\\javaseTest\\demomodel01\\src\\com\\fiel\\log"));
            ps.print("helloWorld");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if (ps!=null){
               ps.close();
            }
        }
    }
}
