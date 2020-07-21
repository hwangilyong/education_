package com.company.day09;

public class chap5 {
    public void main(){
        for(int group = 0; group < 3; group++) {
            for (int index = 1; index < 10; ) {
                for (int jdex = 1 + (3 * group); jdex < 4 + (3 * group); jdex++) {
                    System.out.print(jdex + " * " + index + " = " + jdex * index + "\t");
                    if (jdex % 3 == 0) {
                        System.out.println("");
                    }
                }
                index++;
            }
            System.out.println();
        }
    }
}
