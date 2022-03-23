package com.czz.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("demomodel01\\src\\com\\jdbcMsg.properties");
        Properties properties = new Properties();
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("password") );
    }
}
