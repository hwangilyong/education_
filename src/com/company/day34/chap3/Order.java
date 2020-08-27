package com.company.day34.chap3;

public class Order {
    public Coffee[] coffees = new Coffee[0];

    static int headBeans = 300; //본사 원두
    private int beans = 0;       //지점 원두
    private int milk = 100;      //우유
    private int caramel = 50;    //카라멜
    private int yuza = 100;      //유자
    private int twin = 50;       //쌍화차
    private int cop = 50;        //경찰

    public void setCoffees(String name, int amount){
        Coffee coffee = new Coffee();

        switch(name){
            case "아메리카노": coffee = makingCoffee("아메리카노",20, amount);
            break;
            case "카푸치노"  : coffee = makingCoffee("카푸치노",15, amount, 10);
            break;
            case "카라멜마끼": coffee = makingCoffee("카라멜마끼", 10,amount, 10,5);
            break;
            case "유자차" : coffee = makingYuza("유자차", 30, amount);
            break;
            case "쌍화차" : coffee = makingTwinwagon("쌍화차", 25, amount);
            break;
            case "경찰차" : coffee = makingCopcar("경찰차", 15, amount);
            break;
            default:
                break;
        }

        addCoffee(coffee);
    }

    public Coffee[] getCoffees(){
        return coffees;
    }

    private void addCoffee(Coffee coffee){
        Coffee[] buffer = new Coffee[coffees.length + 1];

        for(int index = 0; index < coffees.length; index++){
            buffer[index] = coffees[index];
        }

        buffer[coffees.length] = coffee;
        coffees = buffer;
    }

    private Coffee makingCoffee(String name, int beans, int amount){
        if(this.beans < beans){
            addBeans();
        }
        Coffee coffee = new Coffee();
        this.beans -= beans;

        coffee.init(name, 3000, amount);

        return coffee;
    }

    private Coffee makingCoffee(String name, int beans, int amount, int milk){
        if(this.beans < beans){
            addBeans();
        }
        if(this.milk < milk){
            System.out.println("우유 없음 제작불가");
            return null;
        }
        Coffee coffee = new Coffee();

        this.beans -= beans;
        this.milk -= milk;

        coffee.init(name, 3500, amount);

        return coffee;
    }

    private Coffee makingCoffee(String name, int beans, int amount, int milk, int caramel){
        if(this.beans < beans){
            addBeans();
        }

        if(this.milk < milk || this.caramel < caramel){
            System.out.println("우유 또는 카라멜 부족 제작 불가");
            return null;
        }

        Coffee coffee = new Coffee();
        this.milk -= milk;
        this.caramel -= caramel;

        coffee.init(name, 4000, amount);

        return coffee;
    }

    private Coffee makingYuza(String name, int yuza, int amount){
        if(this.yuza < yuza){
            System.out.println("유자 부족 제작 불가");
            return null;
        }

        Coffee coffee = new Coffee();
        this.yuza -= yuza;

        coffee.init(name, 3000, amount);

        return coffee;
    }

    private Coffee makingTwinwagon(String name, int twin, int amount){
        if(this.yuza < yuza){
            System.out.println("쌍화차 부족 제작 불가");
            return null;
        }

        Coffee coffee = new Coffee();
        this.twin -= twin;

        coffee.init(name, 4000, amount);

        return coffee;
    }

    private Coffee makingCopcar(String name, int cop, int amount){
        if(this.yuza < yuza){
            System.out.println("유자 부족 제작 불가");
            return null;
        }

        Coffee coffee = new Coffee();
        this.twin -= twin;

        coffee.init(name, 2500, amount);

        return coffee;
    }

    static int callBeans(){
        if(headBeans < 100){
            System.out.println("본사 원두 부족.");
            return 0;
        }
         headBeans -= 100;
         return 100;
    }

    public void addBeans(){
        beans = callBeans();
    }
}
