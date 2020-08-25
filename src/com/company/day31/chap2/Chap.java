package com.company.day31.chap2;

public class Chap {
    public void main(){
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();


        student1.name = "Hwang";
        student1.jumsu = new int[]{78,79,81};

        student2.name = "Hwang";
        student2.jumsu = new int[]{78,79,81};

        student3.name = "Hwang";
        student3.jumsu = new int[]{78,79,81};

        student4.name = "Hwang";
        student4.jumsu = new int[]{78,79,81};

        student5.name = "Hwang";
        student5.jumsu = new int[]{78,79,81};


        //student1.ttt = student1.name + "\t";

        for(int index : student1.jumsu){
            student1.total += index;
        //    student1.ttt += index + "\t";
        }

        student1.avg = student1.total / student1.jumsu.length;
       // student1.ttt += student1.total + "\t" + student1.avg;

       // System.out.println(student1.ttt);
    }
}
