package com.czz.reviewsetandmap;

import java.util.Properties;

public class PropertiesTest01 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("username","root");
        properties.setProperty("password","123");
        System.out.println(properties.getProperty("username"));
        System.out.println(properties.getProperty("h"));//null
    }
}
