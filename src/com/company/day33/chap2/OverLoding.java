package com.company.day33.chap2;

public class OverLoding {
    OverLodingStudent makeStudent(String name, int kor, int eng, int math){
        OverLodingStudent res = new OverLodingStudent();
        res.init(name, kor, eng, math);
        res.kind = "일반";

        return res;
    }

    OverLodingStudent makeStudent(String name, int kor, int eng, int math, int art){
        OverLodingStudent res = new OverLodingStudent();
        res.init(name, kor, eng, math, art);
        res.kind = "특기생";

        return res;
    }
}
