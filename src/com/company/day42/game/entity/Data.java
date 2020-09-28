package com.company.day42.game.entity;

public class Data {
    private Object[] data = {new Paper(), new Rock(), new Scissors()};
//    private String[] dataClassInfo = new String[data.length];
//
//    public Data(){
//        for(int index = 0; index < data.length; index++){
//            dataClassInfo[index] = data[index].getClass().getName();
//        }
//    }

//    public String[] getDataClassInfo(){
//        return dataClassInfo.clone();
//    }
//
//
    public Object[] getData(){
        return data.clone();
    }
}
