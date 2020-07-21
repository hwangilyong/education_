package com.company.day11;

public class chap7 {
    private static int LINE = 7;
    public static void main(){
//        int index = 0;
//        do{
//            for(int jdex = 0; jdex < index + 1; jdex++)System.out.print(jdex + 1 + "K");
//
//            System.out.println();
//            index++;
//        }while(index < LINE);

        int index = LINE;
        do{
            for(int jdex = LINE + 1; jdex > index; jdex--)
                System.out.print( -1 * ((jdex - 1) - (LINE + 1)) + "K");

            System.out.println();
            index--;
        }while(index > 0);
    }
}
