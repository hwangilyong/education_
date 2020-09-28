package com.company.mytest;

import java.util.Calendar;

public class Main8 {
    public static void main(String args[]){
        Calendar cal = Calendar.getInstance();

    }
}

class CalTest{
    private Calendar cal = Calendar.getInstance();
    private String[] calHeader = {"일", "월", "화", "수", "목", "금", "토"};

    private int year = 0;
    private int month = 0;
    private int day = 0;

    public CalTest(int year, int month){
        setCal(year, month);
    }

    public void setCal(int year, int month){
        cal.set(Calendar.YEAR, year);
        cal.set(Calendar.MONTH, month - 1);
        cal.set(Calendar.DATE, 1);
    }

    //public void

    public void print(int month) throws Exception{
        int startDay = cal.get(Calendar.DAY_OF_WEEK);
        int lastDay = cal.getActualMaximum(Calendar.DATE);

        for(String header : calHeader)System.out.println(header + "\t");

        int row = 0;
    }
}