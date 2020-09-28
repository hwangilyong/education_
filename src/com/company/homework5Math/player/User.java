package com.company.homework5Math.player;

public class User {
    private int winCount = 0;
    private int loseCount = 0;
    private double odds = 0;

    public void increaseWin(){
        winCount++;
    }

    public void increaseLose(){
        loseCount++;
    }

    public int calcOdds(){
        int total = winCount + loseCount;
        return (int)((winCount / (double)total) * 100);
    }


}
