package com.company.homework9Collection.mp3.assembler;

import com.company.homework9Collection.mp3.entity.MusicData;
import com.company.homework9Collection.mp3.entity.MusicVO;
import com.company.homework9Collection.mp3.service.MusicService;
import com.company.homework9Collection.mp3.service.impl.MusicServiceImpl;

import java.util.Scanner;

public class MusicAssembler {
    private MusicServiceImpl musicService = new MusicServiceImpl();
    private MusicData musicData = new MusicData();

    public void assembler(){
        musicService.setMusicData(musicData);
        Scanner scanner = new Scanner(System.in);

        while(true){
            if(musicService.checkRun()){
                System.out.println("현재 재생되는 음악이 없음.");
            }else{
                System.out.println("===[이전 곡]===");
                musicData.getBackInfo();
                System.out.println("===[현재 곡]===");
                System.out.println("현재 재생 곡 : " + musicService.getCurrentMusic().toString());
                System.out.println("===[다음 곡]===");
                musicData.getNextInfo();
            }

            System.out.println("1.곡 리스트 2.검색 3.재생 4.다음 곡 5.이전 곡 6.곡 선택 7.종료");
            try{
                int cmd = scanner.nextInt();

                switch (cmd){
                    case 1 :
                        musicService.selectAll();
                        break;
                    case 2 :
                        search();
                        break;
                    case 3:
                        musicService.run(musicService.getCurrentMusic());
                        break;
                    case 4:
                        //musicService.next();
                        musicService.run(musicService.next());
                        break;
                    case 5:
                        //musicService.back();
                        musicService.run(musicService.back());
                        break;
                    case 6:
                        System.out.println("번호 선택");
                        musicService.run(musicService.selectMusic());
                        break;
                    case 7:
                        return;
                    default:
                        break;
                }
            }catch(Exception e){
                System.out.println(e.getMessage());
            }

        }
    }

    private void search() throws Exception{
        Scanner scanner = new Scanner(System.in);

        MusicVO musicVO = musicService.search();
        if(musicVO == null){
            throw new Exception("곡이 없음");
        }

        System.out.println("1.해당 곡 재생 2.나가기");

        int cmd = scanner.nextInt();

        switch(cmd){
            case 1:
                musicService.setCurrentMusic(musicVO);
                musicService.run(musicVO);
                break;
            case 2:
                return;
            default:
                break;
        }
    }
}
