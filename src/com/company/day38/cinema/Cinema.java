package com.company.day38.cinema;

public class Cinema {
    Member[] members = {};

    public void reservation(int id){

    }

    private void addMembers(){

    }

    private int[] a;

    public int getA(int index){
        return a[index];
    }

    public int getALength(){
        return a.length;
    }

    public void test(){
        for(int index = 0; index < getALength(); index++){
            System.out.println(getA(index));
        }
    }
}
