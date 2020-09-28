package com.company.homework6Calendar;

import com.company.homework6Calendar.calendar.Data;

import java.util.Calendar;

public class Main {
    public static void main(String args[]){
        int year = 2020;

        Data data = new Data(year);
        System.out.println("=====[ " + year + "년 ]=====");

        for(int month = 0; month < data.monthLength; month++){
            System.out.println("======[ " + (month + 1) + "월 ]======");
            System.out.println(data.dayOfWeek);

            data.setMonth(month);
            data.setDate(1);

            int start = data.getStart();

            //for(int index = 0; index < start; index++){
            for(int index = 0; index < start - 1; index++){
                System.out.print("\t");
            }
            //System.out.println();

            int end = data.getEnd();

            for(int index = 0; index < end; index++){
                data.setDate(index + 1);
                System.out.print((index  + 1)+ "\t");

                if(data.checkWeekEnd())System.out.println();
            }
            System.out.println("\n===================");
        }
    }

    public static void test(){
        Calendar today = Calendar.getInstance();

        System.out.println(today.get(1));
        System.out.println(today.get(Calendar.YEAR)); // 1
        System.out.println(today.get(Calendar.MONTH) + 1); //2
        System.out.println(today.get(Calendar.DATE));  //5

        String test = "";
        for(int index = 0; index < 5; index++){
            if(index == 2){
                test += (today.get(index) + 1) + " ";
            }
            test += today.get(index) + " ";
        }

        System.out.println(test);
    }

    public static void test2(){

    }
}
