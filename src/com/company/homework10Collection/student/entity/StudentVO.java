package com.company.homework10Collection.student.entity;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentVO {
    private Map subject = new HashMap();
    private int total = 0;
    private double avg = 0;
    private String rank = "";
    private int ranking = 1;

    public StudentVO(int... subjects){
        subject.put("국어",subjects[0]);
        subject.put("영어",subjects[1]);
        subject.put("수학",subjects[2]);

        total = subjects[0] + subjects[1] + subjects[2];
        avg = total / (double)subjects.length;

        rank = new String[]{"가","가","가","가","가","가","양","미","우","수"}[(int)avg/10];
    }

    public double getAvg(){
        return avg;
    }

    public int getRanking(){
        return ranking;
    }

    public void setRanking(Map students){
        ranking = 1;

        for(Object object : students.keySet()){
            double avg = ((StudentVO)students.get(object)).getAvg();
            if(this.avg < avg) ranking++;
        }
    }

    @Override
    public String toString(){
        return "국어 : " + subject.get("국어") + " 영어" + subject.get("영어") +
        " 수학 : " + subject.get("수학") + " 평균 : " + avg + " 등급 : " + rank + " 등수 : " + ranking;
    }
}
