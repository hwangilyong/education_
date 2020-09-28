package com.company.day38.bar;

public class Menu {
    private String menuName = "";
    private int count = 0;
    private int unit = 0;
    private int total = 0;

    public Menu(String menuName, int unit){
        this.menuName = menuName;
        this.unit = unit;
    }

    public void increaseCount(){
        count++;
        total = count * unit;
    }

    public void ppp(){
        System.out.println(menuName + " " + count + " " + (total));
    }

    public int getTotal(){
        return total;
    }
}
