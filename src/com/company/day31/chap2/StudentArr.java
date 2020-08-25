package com.company.day31.chap2;

public class StudentArr {
    String name = "";
    String ttt = "";
    int [] jumsu;
    int total;
    double avg;
    int ban;
    int division = 0; //0이면 일반학생 1이면 특기생
    int rank = 1;

    void init(String name, int kor, int eng, int math, int art, int ban){
        this.name = name;
        jumsu = new int[]{kor, eng, math, art};

        total = jumsu[0] + jumsu[1] + jumsu[2];

        if(-1 != art) {
            total += jumsu[3];
            division = 1;
        }

        this.ban = ban;
        avgCalc();
    }

    void avgCalc(){
        avg = ((int)(((total / (double)jumsu.length) * 100) + 0.5))/(double)100;
    }

    void calc(StudentArr[] studentArrs){
        rank = 1;

        for(int index = 0; index < studentArrs.length; index++){
            if(studentArrs[index].division == division && studentArrs[index].ban == ban){
                if(studentArrs[index].avg > avg){
                    rank++;
                }
            }
        }
    }

    void ppp(){
        System.out.println(name + "\t\t" + jumsu[0] + "\t" + jumsu[1] +
                "\t" + jumsu[2] + "\t" + ((division == 1) ? jumsu[3] : "") +  "\t" + total + "\t" + avg + "\t" + rank);

    }
}
