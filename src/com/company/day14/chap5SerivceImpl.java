package com.company.day14;

public class chap5SerivceImpl implements chap5Service{
    @Override
    public void print(int[] integerArr){
        for(int index = 0; index < integerArr.length; index++){
            System.out.println(integerArr[index]);
        }
    }

    @Override
    public void inputVal(int[] integerArr){
        int num = 0;
        for(int index = integerArr.length; index > 0; index--){
            integerArr[num++] = index;
        }
    }
}
