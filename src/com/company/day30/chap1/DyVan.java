package com.company.day30.chap1;

public class DyVan extends DyCar{
    public int speed;
    public int fuel;
    public int cnt;

    public int[] pArr;
    public double[] dArr = {0.15, 0.35, 0.5};

    public DyVan(int speed, int fuel, int cnt){
        this.speed = speed;
        this.fuel = fuel;
        this.cnt = cnt;
        name = "승합차";
        pArr = new int[]{speed, fuel, cnt};
    }

    public void calc(){
        int sum = 0;
        for(int index = 0; index < pArr.length; index++){
            sum += pArr[index] * dArr[index];
        }

        res = sum;
        ppp();
    }

    @Override
    public void drive(int hour){
        useFuel = hour * 30 * ((100 - fuel)/(double)100) * (((int)(cnt/20) * 10)/(double)100);
        distance = hour * 100 - (hour * 100 * (((int)(cnt/20)) / (double)100));

        drivePPP();
    }
}
