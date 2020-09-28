package com.company.homework9Collection.mp3.service.impl;

import com.company.homework9Collection.mp3.entity.MusicData;
import com.company.homework9Collection.mp3.entity.MusicVO;
import com.company.homework9Collection.mp3.service.MusicService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MusicServiceImpl implements MusicService {
    private MusicData musicData;
    private MusicVO currentMusic;

    public void setMusicData(MusicData musicData) {
        this.musicData = musicData;
    }

    public void setCurrentMusic(MusicVO currentMusic){
        this.currentMusic = currentMusic;
    }

    public MusicVO getCurrentMusic(){
        return currentMusic;
    }

    public boolean checkRun(){
        if(currentMusic == null)return true;

        //System.out.println("현재 곡 : " + currentMusic.getMusicName());
        return false;
    }

    @Override
    public void selectAll(){
        System.out.println("총 곡 : " + musicData.getMusicData().size());
        for(Object musicVO : musicData.getMusicData()){
            System.out.println(musicVO.toString());
        }

        System.out.println();
    }

    @Override
    public void run(MusicVO musicVO) throws Exception {
        if(musicVO == null){
            currentMusic = (MusicVO) (musicData.getMusicData().get(0));
        }else{
            currentMusic = musicVO;
        }

//        for(int index = musicData.getMusicData().indexOf(currentMusic);
//            index < musicData.getMusicData().size(); index++){
//
//            musicData.addNext((MusicVO)musicData.getMusicData().get(index));
//        }

        musicData.clearNext();
        for(int index = musicData.getMusicData().size() - 1;
            index > musicData.getMusicData().indexOf(currentMusic); index--){

            musicData.addNext((MusicVO)musicData.getMusicData().get(index));
        }
    }

    @Override
    public MusicVO search() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String cho = "ㄱㄴㄷㄹㅁㅂㅅㅇㅈㅊㅋㅌㅍㅎ";
        String[] hangle = { "[가-깋]", "[나-닣]", "[다-딯]", "[라-맇]", "[마-밓]", "[바-빟]", "[사-싷]", "[아-잏]", "[자-짛]",
                "[차-칳]", "[카-킿]", "[타-팋]", "[파-핗]", "[하-힣]" };
        List searchResult = new ArrayList();
        int choice = 0;

        while(true){

            System.out.println("곡 검색");
            String search = scanner.nextLine();

            String pattern2 = " ";
            //System.out.println("TEST : " + search.length());
            //System.out.println("test: " + cho.charAt(search.charAt(0)));
            for(int index = 0; index < search.length(); index++){

                if(cho.indexOf(search.charAt(index)) != -1) {
                    pattern2 += hangle[cho.indexOf(search.charAt(index))];
                }else{
                    pattern2 += search.charAt(index);
                }
//                pattern2 += (cho.charAt(search.charAt(index)) != - 1) ?
//                        hangle[cho.indexOf(search.charAt(index))] : search.charAt(index);
            }
            System.out.println(pattern2);

            String test3 = "([a-zA-Zㄱ-ㅎ가-힣0-9]{0,}" + pattern2.trim() + "[a-zA-Zㄱ-ㅎ가-힣0-9]{0,})";
            String test = "";
            int count = 0;
            System.out.println("----[검색결과]----");


            System.out.println("너 여기까지 오니?");
            for (Object data : musicData.getMusicData()) {
                MusicVO musicVO = (MusicVO)data;
                if (Pattern.matches(test3, musicVO.getMusicName().trim())) {
                    searchResult.add(data);
                    count++;
                    System.out.println("TEST : " + musicVO.getMusicName());
                    test += count + "." + musicVO.getMusicName() + " ";
                }
            }

            if(count != 0){
                String[] result = test.split(" ");
                //(test.indexOf(choice + ".");
                for(String res : result){
                    System.out.println(res);
                }
                System.out.println("[곡 선택] 숫자입력");

                try {
                    choice = scanner.nextInt();
                }catch(Exception e){
                    System.out.println("잘못 입력");
                }

                //y/userAddress = result[choice - 1].substring(2);
                break;
            }
            System.out.println("검색결과 없습니다.");
        }
        //return searchResult.get()
        if(currentMusic != null){
            musicData.addBack(currentMusic);
        }
        return (MusicVO)searchResult.get(choice - 1);
    }

    @Override
    public MusicVO next() throws Exception {
//        if(currentMusic == null){
//            currentMusic = (MusicVO)musicData.getMusicData().get(0);
//         }else {
//            musicData.addBack(currentMusic);
//            currentMusic = musicData.getNext();
//        }
        if(currentMusic != null){
            musicData.addBack(currentMusic);
        }
        return musicData.getNext();
    }

    @Override
    public MusicVO back() throws Exception {
//        if(currentMusic != null){
//            musicData.addNext(currentMusic);
//        }
//        currentMusic = musicData.getBack();
        return musicData.getBack();
    }

    @Override
    public void add(String musicName, String artistName) {

    }

    @Override
    public MusicVO selectMusic() throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if(currentMusic != null){
            musicData.addBack(currentMusic);
        }

        return (MusicVO)musicData.getMusicData().get(choice);
    }
}
