package com.czz.reflect.reflectio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.ResourceBundle;

public class ReflectIOTest01 {
    public static void main(String[] args)  {
        try {
            test03();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    /**
     * 第一种方式获取properties内容，及绝对路径的方法
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static void test01()throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException{
        //类路径是以src为起点
        //获取db.的绝对路径
        String path = Thread.currentThread()
                .getContextClassLoader()
                .getResource("com/czz/reflect/reflectio/db.properties")
                .getPath();
        System.out.println(path);
        //获取properties文件内容
        FileReader fileReader = new FileReader(path);
        Properties properties = new Properties();
        properties.load(fileReader);
        String className = properties.getProperty("className");//注意该类的权限
        System.out.println(className);
        Class c = Class.forName(className);
        Object o = c.newInstance();
        System.out.println(o);
    }
    /**
     * 第二种方式获取properties内容
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static void test02() throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        //以流的方式返回
        InputStream inputStream = Thread.currentThread()
                .getContextClassLoader()
                .getResourceAsStream("com/czz/reflect/reflectio/db.properties");

        Properties properties = new Properties();
        properties.load(inputStream);
        String className = properties.getProperty("className");
        Class c = Class.forName(className);
        Object o = c.newInstance();
        System.out.println(o);
    }

    /**
     * 第三种方式获取properties内容，只能用在properties当中，文件路径名不能加后缀
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static void test03() throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        ResourceBundle resourceBundle = ResourceBundle.getBundle("com/czz/reflect/reflectio/db");
        String className = resourceBundle.getString("className");
        Class c = Class.forName(className);
        Object o = c.newInstance();
        System.out.println(o);
    }
}
