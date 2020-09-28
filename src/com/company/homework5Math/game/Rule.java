package com.company.homework5Math.game;

public class Rule {
    private String [] attack = {"가위","바위","보"};

    private String [][] res = {            //user
            {"비김","패","승"},         //가위
            {"승","비김","패"},         //바위
            {"패","승","비김"}            //보
            //com  가위, 바위, 보
    };


    public String gameValidation(int userAttack, int comAttack){
        return res[userAttack][comAttack];
    }

    public boolean continuePlay(int userAttack, int comAttack){
        if(res[userAttack][comAttack] == "비김")return false;
        return true;
    }

    public String getAttack(int index){
        return attack[index];
    }
}
