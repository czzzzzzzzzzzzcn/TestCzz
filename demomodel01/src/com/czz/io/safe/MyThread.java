package com.czz.io.safe;

public class MyThread extends Thread{
    private MyAccount act;

    public MyThread() {
    }

    public MyThread(MyAccount act) {
        this.act = act;
    }

    @Override
    public void run() {
        this.act.getMoney(5000);
        this.act.showMoney();
    }
}
