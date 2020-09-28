package com.company.homework.cafe;

import com.company.homework.cafe.menu.*;

public class Cafe {
    Coffee[][] allOrderList = {{}};

    Beans[] usedBeans = new Beans[]{ //사용된 원두내역 저장할 공간
            new Beans("원두"),
            new Beans("우유"),
            new Beans("카라멜"),
            new Beans("쌍화"),
            new Beans("유자"),
    };

    public static Beans headBeans = new Beans("원두"); //본사원두

    public void order(Order... orders){
        Coffee[] currentOrderList = {}; // 현재 주문내역 저장할 공간

        for(Order order : orders){
            Coffee[] menus = new Coffee[]{new Americano(order.orderCount),
                                      new Cappuccino(order.orderCount),
                                      new Caramel(order.orderCount),
                                      new TwinWagon(order.orderCount),
                                      new YuzaTea(order.orderCount),
            };

            for(Coffee menu : menus){
                if(order.orderName.equals(menu.coffeeName)){
                    currentOrderList = addList(menu, currentOrderList);
                }
            }
        }

        currentOrderListPrint(currentOrderList);
        toBeUsedBeans(currentOrderList);    //현재주문의 원두 양 출력
        addAllList(currentOrderList); // 주문내역 저장
    }

    private Coffee[] addList(Coffee coffee, Coffee[] currentOrderList){
        Coffee[] buffer = new Coffee[currentOrderList.length + 1];

        for(int index = 0; index < currentOrderList.length; index++){
            buffer[index] = currentOrderList[index];
        }

        buffer[currentOrderList.length] = coffee;

        return buffer;
    }

    public void addAllList(Coffee[] cuffentOrderList){ //주문내역 저장
        Coffee[][] buffer = new Coffee[allOrderList.length + 1][];

        for(int index = 0; index < allOrderList.length; index++){
            buffer[index] = allOrderList[index];
        }

        buffer[allOrderList.length] = cuffentOrderList;
        allOrderList = buffer;
    }

    public void currentOrderListPrint(Coffee[] coffees){
        System.out.println("=========[현재 주문 내역]=========");
        for(Coffee coffee : coffees){
            coffee.ppp();
        }

        System.out.println("[총 결제 금액] : " + getTotalPrice(coffees));
        System.out.println("=================================");
    }

    public int getTotalPrice(Coffee[] coffees){
        int totalPrice = 0;

        for(Coffee coffee : coffees){
            totalPrice += coffee.totalPrice;
        }

        return totalPrice;
    }

    public void toBeUsedBeans(Coffee[] currentOrderList){ // 현재 주문의 사용될 원두 양 출력
        Beans[] currentUsedBeans = new Beans[]{
                new Beans("원두"),
                new Beans("우유"),
                new Beans("카라멜"),
                new Beans("쌍화"),
                new Beans("유자"),
        };

        for(int index = 0; index < currentUsedBeans.length; index++){
            for(Coffee coffee : currentOrderList){
                for(Beans beans : coffee.beans){
                    if(currentUsedBeans[index].beansName.equals(beans.beansName)){
                        currentUsedBeans[index].totalUsage += beans.totalUsage;
                    }
                }
            }
        }

        System.out.println("==[현재 주문에 사용될 원두 총 양]==");
        for(Beans temp : currentUsedBeans){
            if(temp.totalUsage != 0){
                temp.ppp();
            }
        }

        saveUsedBeans(currentOrderList);
    }

    public void saveUsedBeans(Coffee[] currentOrderList){
        for(int index = 0; index < usedBeans.length; index++){
            for(Coffee coffee : currentOrderList){
                for(Beans beans : coffee.beans){
                    if(usedBeans[index].beansName.equals(beans.beansName)){
                        usedBeans[index].totalUsage += beans.totalUsage;
                    }
                }
            }
        }
    }

    public void totalUsedBeansPrint(){
        System.out.println("=================================");
        System.out.println("=========[원두 총 사용량]=========");
        for(Beans beans : usedBeans){
            beans.ppp();
        }

        headBeans.totalUsage += usedBeans[0].totalUsage; // 본사 원두
    }

    public void printHeadBeans(){
        System.out.println();
        System.out.println("[사용되어질 총 본사 원두]");
        headBeans.ppp();
    }

    public void printTotalOrder(){
        Coffee[] menus = new Coffee[]{new Americano(0),
                new Cappuccino(0),
                new Caramel(0),
                new TwinWagon(0),
                new YuzaTea(0),
        };

        for(int index = 0; index < menus.length; index++){
            for(Coffee[] orders : allOrderList){
                for(Coffee order : orders){
                    if(menus[index].coffeeName.equals(order.coffeeName)){
                        menus[index].totalPrice += order.totalPrice;
                        menus[index].orderCount += order.orderCount;
                    }
                }
            }
        }

        System.out.println("\n\n=================");
        System.out.println("[총 가게 매출 내역]");
        for(Coffee print : menus){
            if(print.orderCount != 0)
            print.ppp();
        }
    }
}
