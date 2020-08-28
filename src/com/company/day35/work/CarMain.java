package com.company.day35.work;

public class CarMain {
    public void main(){
        Sports[] sports = new Sports[]{
                new Sports(100, 100),
                new Sports(40,30),
                new Sports(30,60)
        };

        Truck[] trucks = new Truck[]{
                new Truck(30,10,4),
                new Truck(10,20,30),
                new Truck(70,40,100)
        };

        Van[] vans = new Van[]{
                new Van(10,20,30),
                new Van(20,40,10),
                new Van(40,60,20),
        };

        for(Sports temp : sports){
            temp.ppp();
        }
        for(Truck temp : trucks){
            temp.ppp();
        }
        for(Van temp : vans){
            temp.ppp();
        }
    }
}
