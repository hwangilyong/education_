package com.company.day09;

public class sort {
    public void main(){
        int[] array = {8,5,6,2,7};

        int num = 0;
        for(int index = 1; index < array.length; index++){
            num = index;
            for(int jdex = index; jdex >= 0; jdex--){
                if(array[num] < array[jdex]){
                    int temp = array[jdex];
                    array[jdex] = array[num];
                    array[num] = temp;
                    num = jdex;
                }
            }
        }

        for(int print : array)System.out.println(print + " ");
    }
}
