package com.czz.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public interface DateTest {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat =new SimpleDateFormat("yyyy年-MM月-dd日");
       String s = simpleDateFormat.format(date);
        System.out.println(s);

        System.currentTimeMillis();
    }
}
