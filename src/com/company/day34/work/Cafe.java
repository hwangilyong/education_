package com.company.day34.work;

public class Cafe {
    private Coffee[] coffees = new Coffee[0];

    private static int headBeans = 100;  //본사 원두 재고
    private int beans = 0;       //지점 원두 재고
    private int milk = 100;      //우유 재고
    private int caramel = 50;    //카라멜 재고
    private int yuza = 100;      //유자 재고
    private int twin = 50;       //쌍화차 재고
    private int cop = 50;        //경찰 재고
    private int totalPrice = 0;

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
                System.out.println("주문오류");
                break;
        }

        addCoffee(coffee);
    }

    public void showInfo(){
        setTotalPrice();

        for(Coffee string : coffees){
            System.out.println(string.ttt);
        }
        System.out.println("============");
        System.out.println("총 금액 : " + totalPrice);
    }

    private void addCoffee(Coffee coffee){
        Coffee[] buffer = new Coffee[coffees.length + 1];

        for(int index = 0; index < coffees.length; index++){
            buffer[index] = coffees[index];
        }

        buffer[coffees.length] = coffee;
        coffees = buffer;
    }

    //아메리카노
    private Coffee makingCoffee(String name, int beans, int amount){
        Coffee coffee = new Coffee();
        if(this.beans < beans){
            addBeans();
            if(this.beans < beans) {
                coffee.init(name + " 재료 없음", 0, amount);

                return coffee;
            }
        }

        this.beans -= beans * amount;

        coffee.init(name, 3000, amount);
        return coffee;
    }

    //카푸치노
    private Coffee makingCoffee(String name, int beans, int amount, int milk){
        Coffee coffee = new Coffee();
        if(this.beans < beans){
            addBeans();
            if(this.beans < beans) {
                coffee.init(name + " 재료 없음", 0, amount);

                return coffee;
            }
        }

        if(this.milk < milk){
            System.out.println("우유 없음 제작불가");
            return null;
        }

        this.beans -= beans * amount;
        this.milk -= milk * amount;

        coffee.init(name, 3500, amount);

        return coffee;
    }

    //카라멜마끼
    private Coffee makingCoffee(String name, int beans, int amount, int milk, int caramel){
        Coffee coffee = new Coffee();

        if(this.beans < beans){
            addBeans();
            if(this.beans < beans) {
                coffee.init(name + " 재료 없음", 0, amount);

                return coffee;
            }
        }

        if(this.milk < milk || this.caramel < caramel){
            System.out.println("우유 또는 카라멜 부족 제작 불가");
            coffee.init(name + " 재료 없음",0,amount);

            return coffee;
        }

        this.beans -= beans * amount;
        this.milk -= milk * amount;
        this.caramel -= caramel * amount;

        coffee.init(name, 4000, amount);

        return coffee;
    }

    //유자차
    private Coffee makingYuza(String name, int yuza, int amount){
        Coffee coffee = new Coffee();
        if(this.yuza < yuza){
            System.out.println("유자 부족 제작 불가");
            coffee.init(name + " 재료 없음", 0, amount);

            return coffee;
        }

        this.yuza -= yuza * amount;

        coffee.init(name, 3000, amount);

        return coffee;
    }

    //쌍화차
    private Coffee makingTwinwagon(String name, int twin, int amount){
        Coffee coffee = new Coffee();
        if(this.yuza < yuza){
            System.out.println("쌍화차 부족 제작 불가");
            coffee.init(name + " 재료 없음", 0, amount);

            return coffee;
        }

        this.twin -= twin * amount;

        coffee.init(name, 4000, amount);

        return coffee;
    }

    private Coffee makingCopcar(String name, int cop, int amount){
        Coffee coffee = new Coffee();
        if(this.cop < cop){
            System.out.println("쌍화차 재료 부족 제작 불가");
            coffee.init(name + " 재료 없음",0,amount);

            return coffee;
        }

        this.twin -= twin * amount;

        coffee.init(name, 2500, amount);

        return coffee;
    }

    private static int callBeans(){
        if(headBeans < 100){
            System.out.println("본사 원두 부족.");
            return 0;
        }
        headBeans -= 100;
        return 100;
    }

    private void addBeans(){
        beans = callBeans();
    }

    private void setTotalPrice(){
        for(Coffee coffee : coffees){
            totalPrice += coffee.totalPrice;
        }
    }
}
