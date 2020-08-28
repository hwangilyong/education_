package com.company.day35.work;

public class Evaluation {
    Sports[] sports = new Sports[0];
    Truck[] trucks = new Truck[0];
    Van[] vans = new Van[0];

    public void addSports(int speed, int fuel){
        Sports[] buffer = new Sports[sports.length + 1];
        for(int index = 0; index < sports.length; index++){
            buffer[index] = sports[index];
        }

        buffer[sports.length] = new Sports(speed, fuel);
        sports = buffer;

        for(int index = 0; index < sports.length; index++){
            sports[index].calcRank(sports);
        }
    }

    public void sportsPpp(){
        ppp(sports);
    }

    private void ppp(Car[] cars){
        for(int jdex = 1; jdex <= cars.length; jdex++) {
            for (int index = 0; index < cars.length; index++) {
                if ((jdex) == cars[index].rank)
                    cars[index].ppp();
            }
        }
    }

}
