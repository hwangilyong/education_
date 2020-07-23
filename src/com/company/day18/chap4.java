package com.company.day18;

public class chap4 {
    private String name;
    private int ban;
    private int no;
    private int kor;
    private int eng;
    private int math;

    public chap4(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    private int getTotal(){
        return kor + eng + math;
    }

    private float getAverage(){
        float val = (float)getTotal() / 3;
        float avg = Float.parseFloat(test(val));

        return avg;
    }

    public void print(){
        System.out.println("이름 : " + name);
        System.out.println("총점 : " + getTotal());
        System.out.println("퍙군 : " + getAverage());
    }

    private String test(float val){
        int n = 1;
        double n2 = Math.pow(10.0, n);

        return (Math.round(val*n2) / n2) + "";
    }

    private void test2(){
        float num = 3.32f;
        float test = 10f;



        System.out.println(num / test);
    }

    public static void main(){
        chap4 chap = new chap4("홍길동", 1, 1, 100, 60, 76);
        //chap.print();
        chap.test2();
    }
}
