package com.czz.method;



public class MethodTest01 {
    public static void main(String[] args) {
        int res= jieChe(6);
        System.out.println(res);
        System.out.println(returnNextZhiShu(11));
        System.out.println(sum(3));

    }
    /**
     * 阶乘
     */
    public static int jieChe(int n){
        int res=1;
       if (n>1){
        res = n*jieChe(n-1);
       }
       return res;
    }

    /**
     * 判断是否是质数
     * @param n
     * @return
     */
    public static boolean isZhiShu(int n){
        boolean flag=true;
         for (int i = 2; i <n ; i++) {
           if (n%i==0){
               flag=false;
           }
        }
        return flag;
    }
    public static int returnNextZhiShu(int n){
        int x = n+1;
        while (!isZhiShu(x)){
            x++;
        }
        return x;
    }
    public static int sum(int n){
        int res=0;
        if (n>0){
            res=n+sum(n-1);
        }
        return res;
    }
}
