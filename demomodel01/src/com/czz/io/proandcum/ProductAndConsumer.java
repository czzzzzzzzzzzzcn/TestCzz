package com.czz.io.proandcum;

import com.czz.io.safe.MyThread;

public class ProductAndConsumer {
    public static void main(String[] args) {
        Num num = new Num();
        num.i=1;
        MyThread1 t1 = new MyThread1(num);
        MyThread2 t2 = new MyThread2(num);
        t1.setName("线程一");
        t2.setName("线程二");
        t1.start();
        t2.start();
    }
}
class Num{
    Integer i;
}
class MyThread1 extends Thread{
    Num num;

    public MyThread1(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (num) {

                if (num.i % 2 ==0) {
                   // System.out.println("线程一");
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                }
               // System.out.println("线程一等待结束");
                System.out.println(Thread.currentThread().getName() + "---+>" + num.i);
                num.i+=1;
                num.notifyAll();
            }
        }
    }
}
class MyThread2 extends Thread{
    Num num;
    public MyThread2(Num num) {
        this.num = num;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (num) {
                if (num.i % 2!=0) {
                    //System.out.println("线程2");
                    try {
                        num.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
              //  System.out.println("线程二等待结束");
                System.out.println(Thread.currentThread().getName() + "---+>" + num.i);
                num.i+=1;
                num.notifyAll();

            }
        }
    }
}