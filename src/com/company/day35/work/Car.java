package com.company.day35.work;

public class Car {
    public String carKind;
    public double carScore;
    public int rank = 0;

    public Car(String carKind,CarPart... carParts){
        this.carKind = carKind;
        evaluation(carParts);
    }

    private void evaluation(CarPart... carParts){
        for(int index = 0; index < carParts.length; index++){
            carScore += carParts[index].partScore * carParts[index].ratio;
        }
    }

    public void calcRank(Car[] cars){
        rank = 1;
        for(Car temp : cars){
            if(temp.carScore > carScore)rank++;
        }
    }

    public void ppp(){
        String ttt = carKind + "\t" + carScore + "\t" + rank;
        System.out.println(ttt);
    }
}
