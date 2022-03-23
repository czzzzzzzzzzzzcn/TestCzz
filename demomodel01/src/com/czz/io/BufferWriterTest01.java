package com.czz.io;

import java.io.*;

public class BufferWriterTest01 {
    public static void main(String[] args) {
        BufferedWriter bw =null;
        try {
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("demomodel01/src/com/fiel/file06")));
            bw.write("Are you Ok?");
            bw.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
