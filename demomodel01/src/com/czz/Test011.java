package com.czz;

import java.util.ArrayList;
import java.util.List;

public class Test011 {
   private String no;
    public Test011() {
        System.out.println("hello");
    }

    public Test011(String no) {
        this();
        this.no = no;
    }
}
class Test022 extends Test011{
    public Test022() {
        super();
    }

    public Test022(String no) {

        super(no);

    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> generate = new ArrayList();
        for(int i=0;i<numRows-1;i++){
            List<Integer> list = new ArrayList();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    list.add(1);
                }else{
                    list.add(generate.get(i-1).get(j-1)+generate.get(i-1).get(j));
                }
            }

            generate.add(list);

        }
        return generate;
    }

    public static void main(String[] args) {
//        List<List<Integer>> generate = generate(5);
////        for (List l:generate
////             ) {
////            for (Object k:l
////                 ) {
////                System.out.print(k);
////            }
////            System.out.println();
////        }

        
    }
}