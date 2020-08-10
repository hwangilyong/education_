package com.company.day30.chap1;

public abstract class DyCar {
    public String name;
    public int res;

    public double useFuel;
    public double distance;

    public abstract void calc();
    public abstract void drive(int hour);

    public void ppp(){
        System.out.println(name + "\t" + res);
    }

    public void drivePPP(){
        System.out.println(name + "\t" + "연료사용량 : "
                + useFuel + "\t주행거리 : " + distance);
    }
}
