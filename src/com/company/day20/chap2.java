package com.company.day20;

public class chap2 {
    private int balance;

    public void setBalance(int balance){
        if(balance < 0 || balance > 1000000) return;
        else this.balance = balance;
    }

    public int getBalance(){
        return balance;
    }

    public void main(){
        chap2 account = new chap2();

        account.setBalance(10000);
        System.out.println("현재 잔고" + account.getBalance());

        account.setBalance(-100);
        System.out.println("현재 잔고" + account.getBalance());

        account.setBalance(2000000);
        System.out.println("현재 잔고" + account.getBalance());

        account.setBalance(300000);
        System.out.println("현재 잔고" + account.getBalance());
    }
}
