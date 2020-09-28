package com.company.day44.chap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

class Student{
    //String name;
    int [] jum;
    int total;
    int avg;

    public Student(String string){
        String [] arr = string.split(",");

        total = 0;
        for(int index = 0; index < arr.length; index++){
            total += Integer.parseInt(arr[index]);
        }

        avg = total / arr.length;
    }

    @Override
    public String toString() {
        return "Student{" +
                "jum=" + Arrays.toString(jum) +
                ", total=" + total +
                ", avg=" + avg +
                '}';
    }
}

public class Chap {
    public void main(){
        String test = "박혜지,77,76,72_용이,67,66,62_정서윤,97,96,92_김재호,57,56,52_박정환,87,86,82";

        StringTokenizer token = new StringTokenizer(test, "_");
        String res = "";
        List<Student> list = new ArrayList<>();
        while(token.hasMoreElements()){
            list.add(new Student(token.nextToken()));
        }

        for(Student student : list){
            student.toString();
        }
    }
}

