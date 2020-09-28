package com.company.homework10Collection.student.assembler;

import com.company.homework10Collection.student.service.impl.StudentServiceImpl;

import java.util.Scanner;

public class Assembler {
    public void assembler(){
        Scanner scanner = new Scanner(System.in);
        StudentServiceImpl studentService = new StudentServiceImpl();
        while(true){
            try{
                System.out.println("1.학생 검색 2.반 정보 3.학생 정보 추가" +
                        " 4.전체 출력(이름 순) 5.전체 출력(성적 순)" );
                int cmd = scanner.nextInt();

                switch(cmd){
                    case 1 :
                        studentService.searchStudent();
                        break;
                    case 2 :
                        studentService.listBan();
                        break;
                    case 3 :
                        studentService.addStudent();
                        break;
                    case 4 :
                        System.out.println("이름 순");
                        //studentService.listAll();
                        studentService.choiceList(cmd);
                        break;
                    case 5:
                        System.out.println("성적 순");
                        studentService.choiceList(cmd);
                        //studentService.listAllByAvg();
                }
                System.out.println();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
