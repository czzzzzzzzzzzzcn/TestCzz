package com.czz.io.safe;

public class MyAccount {
    private double accountMoney;
    Object obj = new Object();
    public MyAccount(double accountMoney) {
        this.accountMoney = accountMoney;
    }

    public double getAccountMoney() {
        return accountMoney;
    }

    public void setAccountMoney(double accountMoney) {
        this.accountMoney = accountMoney;
    }

    public MyAccount() {
    }
    public void getMoney(double nanMoney){
        synchronized (obj){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setAccountMoney(this.getAccountMoney()-nanMoney);
        }
    }
    public void showMoney(){
        System.out.println("账号余额："+this.getAccountMoney());
    }
}
