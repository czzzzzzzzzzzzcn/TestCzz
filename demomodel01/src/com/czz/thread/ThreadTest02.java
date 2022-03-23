package com.czz.thread;

public class ThreadTest02 {
    public static void main(String[] args) {
       MyRunnable runnable =new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();
        //6秒后唤醒thread线程
        System.out.println("开始唤醒分支线程！");
        try {
            Thread.sleep(1000*6);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       //thread.interrupt();//异常终止睡眠，分支进程后续代码继续执行
       // thread.stop(); //直接杀死进程，分支进程后续代码不会执行
        //flag标志终止睡眠,//分支进程后续代码不会执行
       runnable.flag=false;
//        for (int i = 0; i <1000 ; i++) {
//            System.out.println(Thread.currentThread().getName()+"---->"+i);
//        }
    }
}
class MyRunnable implements Runnable{
    boolean flag =true;
    @Override
    public void run() {
        System.out.println("副线程启动！");
//        Thread thread = Thread.currentThread();
//        try {
//            Thread.sleep(1000*60*60*24);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
       // System.out.println("睡眠结束");
        System.out.println("间隔睡眠一秒,实际睡了无限秒（秒数通过循环控制），只不过是拆分了，不这样无法判断flag,因为睡了很长时间,只有短暂唤醒才能判断flag");
        while (true){
            if (flag){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                System.out.println("睡眠结束");
                return;
            }
    }
    }
}

