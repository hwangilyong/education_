package com.company.homework10Collection.student.service;

import com.company.homework10Collection.student.entity.StudentVO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface StudentService {
    //학생 정보 추가
    public void addStudent() throws Exception;
    //반 추가
    public void addBan(String ban) throws Exception;
    //분류 추가
    public void addCategory(String ban, String category) throws Exception;
    //상세 학생 정보 추가
    public void addStudentInfo(String ban, String category, String name, int... subjects) throws Exception; 
    //기본 이름 순 정렬
    public void listAll() throws Exception;
    
    //public Map selectBan(String ban) throws Exception;
    //public Map selectCategory(Map ban, String category) throws Exception;
    
    //안만들거얌
    public StudentVO searchStudent() throws Exception;
    //성적(평균)순 정렬
    public void listAllByAvg() throws Exception;
    public List sortByAvg(Map student) throws Exception;

    //반정보 출력 (전체 평균)
    public void listBan() throws Exception;
}
