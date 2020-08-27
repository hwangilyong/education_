package com.company.day33.chap2;

public class Chap {
    public void main(){
        OverLoding overLoding = new OverLoding();

        OverLodingStudent st1 = overLoding.makeStudent("Hwang", 7, 8 ,1 );
        st1.ppp();

        OverLodingStudent st2 = overLoding.makeStudent("Gwang", 7, 8 ,1, 4);
        st1.ppp();
    }
}
