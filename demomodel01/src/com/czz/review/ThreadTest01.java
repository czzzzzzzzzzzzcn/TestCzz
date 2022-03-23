package com.czz.review;

public class ThreadTest01 {
    public static void main(String[] args) {
        Num num = new Num(1);
        Thread01 thread01 = new Thread01(num);
        Thread02 thread2= new Thread02(num);

        thread01.start();
        thread2.start();

    }
}
    class Thread01 extends Thread{
        private Num num;

        public Thread01(Num num) {
            this.num = num;
        }

        @Override
        public void run() {
            while (true){
           synchronized (num){

                   if (num.i!=1){
                       try {
                           num.wait();
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                   }
               System.out.println("num->"+num.i);
                   num.i=2;
                   num.notifyAll();
               }
           }
        }
    }
    class Thread02  extends Thread{
        private Num num;

        public Thread02(Num num) {
            this.num = num;
        }

        @Override
        public void run() {
            while (true){
                synchronized (num){

                    if (num.i!=2){
                        try {
                            num.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("num->"+num.i);
                    num.i=1;
                    num.notifyAll();
                }
            }
        }
    }


    class Num{

        int i;
        public Num(int i){
            this.i=i;
        }
    }

