package com.company.homework10Collection.student.entity;

import com.company.day31.chap2.Student;

import java.util.*;

public class StudentData {
    //("반" : ("분류" : ("학생 이름" : 학생VO)))
    private Map studentData = new HashMap();
    //private Map studentCategory;

    //new Hash를 한것은 실제 주소 안받을려구
    public Map getStudentData(){
        return new HashMap(studentData);
    }

    //반 추가
    public void addBan(String ban){
        if(checkBan(ban)){ //현재 반이 존재하는 반인 경우 그냥 나가기
            return;
        }
        studentData.put(ban, new HashMap());
    }


//    public void addCategory(Object studentCategory, String category) throws Exception {
//        this.studentCategory = (Map)studentCategory;
//        if(this.studentCategory.containsKey(category))
//            throw new Exception(category + " 이미 존재");
//
//        this.studentCategory.put(category, new TreeMap());
//    }

    //분류 추가
    public void addCategory(String ban, String category) throws Exception {
        Map map = new HashMap();
        if(checkCategory(getBan(ban), category)){//현재 분류가 존재하는 분류일 경우 그냥 나가기
          return;
        }
        ((Map)studentData.get(ban)).put(category, map);
    }

    //학생 정보 추가
    public void addStudent(String ban, String category,String name, Object studentVO){
        ((Map)((Map)studentData.get(ban)).get(category)).put(name, studentVO);
    }

    //반의 값 반환 (분류 맵 반환)
    private Map getBan(String ban){
        return new HashMap((Map)studentData.get(ban));
    }

    //분류의 값 반환 (학생정보 맵 반환)
    private Map getCategory(String ban, String category){
        return new HashMap((Map)getBan(ban).get(category));
    }

    //반 중복 확인
    public boolean checkBan(String ban){
        return studentData.containsKey(ban);
    }

    //분류 중복 확인
    public boolean checkCategory(Object ban, String category) throws Exception{
        Map studentCategory = (Map)ban;
        if(studentCategory == null){
            return false;
        }

        return studentCategory.containsKey(category);
    }

    //이터레이터 얻기
    public Iterator getIterator(Map data){
        return data.keySet().iterator();
    }

    //랭킹 계산
    public void calcRanking(){
        for(Object ban : studentData.keySet()){
            Map categoryMap = (Map)studentData.get(ban);
            for(Object category : categoryMap.keySet()){
                Map studentMap = (Map) categoryMap.get(category);
                for(Object student : studentMap.keySet()){
                    //System.out.println(student);
                    ((StudentVO)studentMap.get(student)).setRanking((Map)categoryMap.get(category));
                }
            }
        }
    }

    //반 정보
    public double calcBan(Map students){
        int total = 0;
        for(Object student : students.keySet()){
            total += ((StudentVO)students.get(student)).getAvg();
        }

        return total / (double)students.size();
    }
}
