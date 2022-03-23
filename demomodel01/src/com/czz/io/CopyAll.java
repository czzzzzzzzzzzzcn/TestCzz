package com.czz.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyAll {
    public static void main(String[] args) {

        copyAll("D:/knowladge/1-Java/java-newFirst/foundation/javaseTest/demomodel01/src/com","D:/course/jb");

    }
    public static  void copyAll(String s1,String s2){
        List<String> file = getFile(s1);//获取所有file
        for (String res:file
        ) {

           String str = (res.substring(0, res.lastIndexOf("\\"))).replace(s1,s2);//得到文件夹
//创建文件夹
            File file1=new File(str);
            if (!file1.exists()){
                file1.mkdirs();
            }
//逐个复制·
            copy(res,res.replace(s1,s2));

        }
        System.out.println("复制完成");
    }
    public static void copy(String s1,String s2){


        FileOutputStream fos=null;
        FileInputStream fis=null;
        try {
            fos = new FileOutputStream(s2,true);
            fis = new FileInputStream(s1);
            byte[] bytes = new byte[1024*1024];
            int readData=0;
            while ((readData=fis.read(bytes))!=-1){
                fos.write(bytes,0,readData);
            }
            fos.flush();

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
    public static List<String> getFile(String s){

        List<String> list = new ArrayList<>();
        File  file =new File(s);
        File[] files = file.listFiles();
        for (File f:files) {
            if (f.isDirectory()){
                List<String> file1 = getFile(s+"\\"+f.getName());
                for (String s3:file1
                ) {
                    list.add(s3);
                }

            }else {
                list.add(s+"\\"+f.getName());


            }

        }
        return list;
    }
}
