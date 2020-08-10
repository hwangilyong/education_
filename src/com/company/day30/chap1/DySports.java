package com.company.day30.chap1;

public class DySports extends DyCar{
    public int speed;
    public int fuel;
    public int design;

    int[] pArr;
    double[] dArr = {0.5, 0.3, 0.2};

    DySports(){};
    public DySports(int speed, int fuel, int design){
        this.speed = speed;
        this.fuel = fuel;
        this.design = design;
        pArr = new int[]{this.speed, this.fuel, this.design};
        name = "스포츠카";
    }


    @Override
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
        useFuel = hour * 50 * ((100 - fuel)/(double)100);
        distance = hour * 200 * ((100 - speed) /(double)100);

        drivePPP();
    }
}
