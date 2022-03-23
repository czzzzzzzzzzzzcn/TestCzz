package com.czz.thread;

public class ThreadTest01 {
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.setName("分支线程");
        Thread.currentThread().setName("主线程");
        thread.start();
        for (int i = 0; i <1000 ; i++) {
            System.out.println(Thread.currentThread().getName()+"-=—=>"+i);
        }
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <1000 ; i++) {
            System.out.println(currentThread().getName()+"-=--=->"+i);
        }
    }
}