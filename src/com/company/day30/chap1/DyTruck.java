package com.company.day30.chap1;

public class DyTruck extends DyCar{
    public int fuel;
    public int loadage;
    public String[] pp;

    private int[] pArr;
    private double[] dArr = {0.6, 0.4};

    public DyTruck(int fuel, int loadage, String... pp){
        this.fuel = fuel;
        this.loadage = loadage;
        this.pp = pp;
        name = "트럭";
        pArr = new int[]{this.fuel, this.loadage};
    }

    @Override
    public void calc(){
        int sum = 0;

        for(int index = 0; index < pArr.length; index++){
            sum += pArr[index] * dArr[index];
        }

        sum = sum + pp.length;
        res = sum;

        ppp();
    }

    @Override
    public void drive(int hour){
        useFuel = hour * 50 * ((100 - fuel)/(double)100) + ((loadage/10)*5);
        distance = hour * 80;

        drivePPP();
    }
}
