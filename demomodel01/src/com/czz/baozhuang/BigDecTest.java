package com.czz.baozhuang;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class BigDecTest {
    public static void main(String[] args) {
        BigDecimal decimal = new BigDecimal(1.3453);
        System.out.println(decimal);
        DecimalFormat decimalFormat =new DecimalFormat("###,###.00000");
        System.out.println(decimalFormat.format(1232323242.3434));
    }
}
