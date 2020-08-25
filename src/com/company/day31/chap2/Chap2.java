package com.company.day31.chap2;

public class Chap2 {
    public void main() {
        StduMake stduMake = new StduMake();

        stduMake.makeSt("Hwa", 35, 66, 75, -1, 2);
        stduMake.makeSt("Kim", 35, 66, 75, -1, 1);
        stduMake.makeSt("Yon", 35, 60, 75, -1, 1);
        stduMake.makeSt("Kun", 35, 60, 75, 40, 1);
        stduMake.makeSt("Sin", 35, 60, 75, 50, 1);
        stduMake.makeSt("Nam", 35, 66, 75, -1, 3);
        stduMake.makeSt("Mun", 70, 66, 75, -1, 3);
        stduMake.makeSt("Sun", 70, 66, 75, 30, 3);

        stduMake.print();
    }
}
