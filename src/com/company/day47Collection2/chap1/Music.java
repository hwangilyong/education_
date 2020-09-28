package com.company.day47Collection2.chap1;

public class Music {
    private static int musicNum = 0;
    private String musicName;
    private String artistName;

    public Music(String musicName, String artistName){
        this.musicName = musicName;
        this.artistName = artistName;
        
        musicNum++;
    }
}
