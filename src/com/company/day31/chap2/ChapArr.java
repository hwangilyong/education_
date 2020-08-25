package com.company.day31.chap2;

public class ChapArr {
    public void main(){
        StudentArr[] studentArrs = new StudentArr[5];
        String[] strArr = new String[5];

        for(int index = 0; index < studentArrs.length; index++)
            studentArrs[index] = new StudentArr();

        studentArrs[0].name = "Hwang";
        studentArrs[0].jumsu = new int[]{78, 79, 81,};

        studentArrs[1].name = "IlYong";
        studentArrs[1].jumsu = new int[]{58, 59, 51,};

        studentArrs[2].name = "Yong";
        studentArrs[2].jumsu = new int[]{98, 99, 91,};

        studentArrs[3].name = "Jung";
        studentArrs[3].jumsu = new int[]{68, 69, 61,};

        studentArrs[4].name = "Hwan";
        studentArrs[4].jumsu = new int[]{1, 2, 2,};

        for(int index = 0; index < studentArrs.length; index++){
            studentArrs[index].ttt += studentArrs[index].name + "\t";

            for(int temp : studentArrs[index].jumsu)
                studentArrs[index].total += temp;


            studentArrs[index].avg = (int) (((studentArrs[index].total
                                / (double)studentArrs[index].jumsu.length) * 100) + 0.5 );



            for(int temp : studentArrs[index].jumsu)
                studentArrs[index].ttt += temp + "\t";

            String result = "";

            int temp = (int)studentArrs[index].avg/100;
            if(temp > 90)result = "수";
            else if(temp > 80)result = "미";
            else if(temp > 70)result = "양";
            else result = "가";

            studentArrs[index].ttt += studentArrs[index].total + "\t";
            studentArrs[index].ttt += (studentArrs[index].avg / (double) 100) + "\t";
            studentArrs[index].ttt += result;
        }

        for(StudentArr temp : studentArrs)System.out.println(temp.ttt);

    }
}
