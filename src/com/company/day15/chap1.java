package com.company.day15;

public class chap1 {
    public static void main(){
        String[] oldStrArray = {"java", "array", "copy"};
        String[] newStrArray = new String[5];

        for(int index = 0; index < oldStrArray.length; index++){
            System.out.print(oldStrArray[index] + " ");
        }

        System.out.println();

        System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
    }
}
