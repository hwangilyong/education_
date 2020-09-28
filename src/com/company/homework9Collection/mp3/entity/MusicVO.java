package com.company.homework9Collection.mp3.entity;

public class MusicVO {
    private String musicName;
    private String artistName;
    private int musicNum = 0;
    private static int globalMusicNum = 0;

    public MusicVO(String musicName, String artistName){
        this.musicName = musicName;
        this.artistName = artistName;
        globalMusicNum++;
        musicNum = globalMusicNum;
    }

    public int getMusicNum(){
        return musicNum;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getMusicName(){
        return musicName;
    }

    public int getGlobalMusicNum(){
        return globalMusicNum;
    }

    @Override
    public String toString(){
       return ("[" + musicNum + "]" + " " + "곡 : " + musicName +
                "  아티스트 : " + artistName);
    }
}
