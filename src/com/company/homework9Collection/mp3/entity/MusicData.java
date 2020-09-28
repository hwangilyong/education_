package com.company.homework9Collection.mp3.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MusicData {
    private List musicData = new ArrayList();
    private Stack next = new Stack();
    private Stack back = new Stack();

    public MusicData(){
        initData data = new initData();
        for(String[] strings : data.initData){
            musicData.add(new MusicVO(strings[0], strings[1]));
        }
    }

    public List getMusicData(){
        return new ArrayList(musicData);
    }

    public void addMusic(String musicName, String artistName){
        musicData.add(new MusicVO(musicName, artistName));
    }

    public void addNext(MusicVO musicVO){
        next.push(musicVO);
    }

    public void addBack(MusicVO musicVO){
        back.push(musicVO);
    }

    public MusicVO getNext() throws Exception{
        if(next.empty()){
            throw new Exception("다음 곡이 없음");
        }
        return (MusicVO)next.pop();
    }

    public MusicVO getBack() throws Exception{
        if(back.empty()){
            throw new Exception("이전 곡이 없음");
        }
        return (MusicVO)back.pop();
    }

    public void getNextInfo(){
        if(!next.empty()){
            //System.out.println(next.toString());
            System.out.println(next);
            return;
        }

        System.out.println("다음 곡 없음");
    }

    public void getBackInfo(){
        if(!next.empty()){
            System.out.println(back.toString());
            return;
        }

        System.out.println("이전 곡 없음");
    }

    public void clearNext(){
        next.clear();
    }

    public void clearBack(){
        back.clear();
    }
}
