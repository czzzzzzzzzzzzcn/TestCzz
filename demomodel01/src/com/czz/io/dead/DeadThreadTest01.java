package com.czz.io.dead;

public class DeadThreadTest01 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        MyThread t1 = new MyThread(obj1,obj2);
        MyThread t2 = new MyThread(obj2,obj1);
        t1.setName("小明");
        t2.setName("小红");
        t1.start();
        t2.start();
    }
}
class MyThread extends Thread{
    Object object1;
    Object object2;
    public MyThread(Object obj1,Object obj2) {
        this.object1=obj1;
        this.object2=obj2;
    }

    @Override
    public void run() {
        synchronized (object1) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("线程："+Thread.currentThread().getName()+"对象:" + object1.toString() + "已被锁定！");
            synchronized (object2){
                System.out.println("线程："+Thread.currentThread().getName()+"对象:"+object2.toString()+"已被锁定！");
            }
        }


    }
}

