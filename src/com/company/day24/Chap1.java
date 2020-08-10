package com.company.day24;

public class Chap1 extends Super{
    String SS = "sub";


    public static String sout(){
        return "SubStatic";
    }


    public String nout(){
        return "SubNormal";
    }

    public void main(){
        Super s = new Chap1();
        Chap1 test = new Chap1();

        System.out.println(s.SS);
        System.out.println(s.sout());
        System.out.println(s.nout());

        System.out.println(((Chap1)s).SS);
        System.out.println(((Chap1)s).sout());
        System.out.println(((Chap1)s).nout());
    }
}

class Super{
    String SS = "super";
    public static String sout(){
        return "SuperStatic";
    }

    public String nout(){
        return "SuperNomal";
    }
}
