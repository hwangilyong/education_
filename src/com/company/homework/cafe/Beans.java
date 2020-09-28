package com.company.homework.cafe;

public class Beans {
    public String beansName;
    public int beansUsage;

    public int totalUsage = 0;

    public Beans(String beansName){
        this.beansName = beansName;
    }

    public Beans(String beansName, int beansUsage){
        this.beansName = beansName;
        this.beansUsage = beansUsage;
    }

    public void ppp(){
        String ttt = "[" + beansName + ":" + totalUsage + "]";
        System.out.println(ttt);
    }
}
