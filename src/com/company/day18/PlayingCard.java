package com.company.day18;

public class PlayingCard {
    int kind;   //필드멤버변수
    int num;    //필드멤버변수

    static int width;   //Static 멤버 변수
    static int height;  //Static 멤버 변수

    PlayingCard(int k, int n){//파라미터 정수형 변수 2개를 가진 생성자
        kind = k;   //필드멤버 kind에 k를 할당
        num = n;    //필드멤버 name에 n를 할당
    }

    public static void main(String args[]){                
        PlayingCard card = new PlayingCard(1, 1); //card라는 PlayingCard타입의 참조변수 생성
                                                        //생성자를 통해 각 kind, num에 1를 할당
    }
}
