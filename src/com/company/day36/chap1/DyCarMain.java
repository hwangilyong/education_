package com.company.day36.chap1;
/*
 //자동차 성능 테스트 클래스를 구현하세요

부모클래스 : 자동차 - 차종, 점수

자식클래스 :      모든 점수는 100점 기준

스포츠카   -- 속도  60, 연비 40     :::::>    속도 80,  연비   70  ==>   80*0.6 +  70*0.4

승합차 -- 연비 30, 탑승인원 30, 안정성 40

 트럭    -- 연비 50, 적재량 50, 화물종류(갯수마다 1점)
 * */

class DyCar{

    String name;
    double jum;

    public DyCar(String name) {

        this.name = name;
    }

    void calc() {}

    void ppp() {
        calc();
        System.out.println(name+"\t"+jum);
    }

}

class DySports extends DyCar{
    int speed, fuel;

    public DySports(int speed, int fuel) {
        super("스포츠카");
        this.speed = speed;
        this.fuel = fuel;
    }

    void calc() {
        jum = speed * 0.6 + fuel * 0.4;
    }

}

class DyVan extends DyCar{
    int  fuel, cnt, safe;



    public DyVan( int fuel, int cnt, int safe) {
        super("승합차");
        this.fuel = fuel;
        this.cnt = cnt;
        this.safe = safe;
    }



    void calc() {
        jum = fuel * 0.3 + cnt * 0.3+ safe *0.4;
    }

}

class DyTruck extends DyCar{
    int fuel, loadage;
    String [] kind;


    DyTruck(int fuel, int loadage, String ...kind) {
        super("트럭");
        this.fuel = fuel;
        this.loadage = loadage;
        this.kind = kind;
    }



    void calc() {
        jum = fuel *0.5 + loadage *0.5 + kind.length;
    }

}

class CarCate{
    String name;
    int [] nums = {};
    DyCar [] cars;

    public CarCate(DyCar [] cars, String name, int ... nums) {
        super();
        this.name = name;
        this.nums = nums;
        this.cars = cars;
    }

    public CarCate(DyCar [] cars, String name) {
        super();
        this.name = name;
        this.cars = cars;
    }

    void ppp() {
        System.out.println(name+" >>>>>>>>>>");

        for (int i : nums) {
            cars[i].ppp();
        }
    }

}

class CarData{
    DyCar [] cars;

    CarCate [] kind = {};

    public CarData(DyCar[] cars) {
        super();
        this.cars = cars;


//      kind = new CarCate[]{
//            new CarCate(cars,"스포츠카",0,4,7),
//            new CarCate(cars,"트럭",1,3,5),
//            new CarCate(cars,"승합차",2,6)
//
//      };

/*
      kind = new CarCate[]{
            new CarCate(cars,"스포츠카"),
            new CarCate(cars,"트럭"),
            new CarCate(cars,"승합차")

      };
*/
        add();

    }


    void add(){
        for(int index = 0; index < cars.length; index++){
            CarCate chk = null;

            for(CarCate cc : kind){
                if(cc.name.equals(cars[index].name)){
                    chk = cc;
                    break;
                }
            }

            if(chk == null){
                chk = new CarCate(cars, cars[index].name);

                CarCate[] buffer = new CarCate[kind.length + 1];

                for(int j =0; j < kind.length; j++){
                    buffer[j] = kind[j];
                }

                buffer[kind.length] = chk;
                kind = buffer;
            }
        }
    }
    void ppp() {
        for (DyCar car : cars) {
            car.ppp();
        }
    }

    void kindPP() {
        for (CarCate cc : kind) {

            cc.ppp();
        }
    }


}


public class DyCarMain {

    public static void main() {
        DyCar [] cars = {
                new DySports(87, 76),
                new DyTruck(96, 81, "권용석","길성민"),
                new DyVan(56, 81, 7),
                new DyTruck(56, 71, "김동규","김재호","김찬범","김환준"),
                new DySports(95, 76),
                new DyTruck(56, 81, "남대훈","박민주","박세현"),
                new DyVan(96, 43, 17),
                new DySports(57, 79)

        };


        CarData data = new CarData(cars);

        //data.ppp();
        data.kindPP();
    }

}