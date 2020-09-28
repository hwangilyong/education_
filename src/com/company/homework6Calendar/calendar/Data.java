package com.company.homework6Calendar.calendar;

import java.util.Calendar;

public class Data {
    Calendar calendar = Calendar.getInstance();

    public final int monthLength = 12;
    public final String dayOfWeek = "일\t월\t화\t수\t목\t금\t토\t";

    private int first;

    public Data(int year){
        calendar.set(Calendar.YEAR, year);
    }

    public void setMonth(int month){
        calendar.set(Calendar.MONTH, month);
    }

    public void setDate(int index){
        calendar.set(Calendar.DATE , index);
    }

    public boolean checkWeekEnd(){
        return 7 == calendar.get(Calendar.DAY_OF_WEEK);
    }

    public int getStart(){
        return calendar.get(Calendar.DAY_OF_WEEK);
    }

    public int getEnd(){
        return calendar.getActualMaximum(Calendar.DATE);
    }
}
