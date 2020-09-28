package com.company.homework9Collection.mp3.service;

import com.company.homework9Collection.mp3.entity.MusicVO;

public interface MusicService {
    public void selectAll();
    public MusicVO search() throws Exception;
    public void run(MusicVO musicVO) throws Exception;
    public MusicVO next() throws Exception;
    public MusicVO back() throws Exception;
    public void add(String musicName, String artistName);
    public MusicVO selectMusic() throws Exception;
}
