package com.company.homework10Collection.student.service.impl;

import com.company.homework10Collection.student.entity.StudentData;
import com.company.homework10Collection.student.entity.StudentVO;
import com.company.homework10Collection.student.service.StudentService;

import java.util.*;

public class StudentServiceImpl implements StudentService {
    private StudentData studentData = new StudentData();

    @Override
    public void addStudent() throws Exception { //학생 정보 추가 메소드
        Scanner scanner = new Scanner(System.in);

        System.out.println("[반 입력]");
        String ban = scanner.nextLine();

        addBan(ban);

        System.out.println("[분류 입력]");
        String category = scanner.nextLine();

        addCategory(ban, category);

        System.out.println("[이름 입력]");
        String name = scanner.nextLine();

        System.out.println("[점수 입력]");
        System.out.println("국어");
        int korean = scanner.nextInt();
        System.out.println("영어");
        int english = scanner.nextInt();
        System.out.println("수학");
        int math = scanner.nextInt();

        addStudentInfo(ban, category, name, korean, english, math);
        studentData.calcRanking();
    }

    @Override
    public void addBan(String ban) throws Exception {
        studentData.addBan(ban);
    }

    @Override
    public void addCategory(String ban, String category) throws Exception {
        studentData.addCategory(ban, category);
    }

    @Override
    public void addStudentInfo(String ban, String category, String name, int... subjects) throws Exception {
        StudentVO studentVO = new StudentVO(subjects);

        studentData.addStudent(ban, category, name, studentVO);
    }

    /*
    @Override
    public void listAll() throws Exception { //Iterator쓴거
        Map data = studentData.getStudentData();
        Iterator banData = studentData.getIterator(data);

        while(banData.hasNext()) {
            String ban = banData.next().toString();
            System.out.println("반 :" + ban);

            String ttt = "\t";
            Iterator categoryData = studentData.getIterator(studentData.getBan(ban));
            while(categoryData.hasNext()){
                String category = categoryData.next().toString();
                System.out.println(ttt + category);

                ttt = "\t\t";
                TreeMap treeCategory = new TreeMap(studentData.getCategory(ban,category)); //이름순 정렬
                Iterator nameData = studentData.getIterator(treeCategory);
                while(nameData.hasNext()){
                    String name = nameData.next().toString();
                    System.out.println(ttt + name + " "
                            + studentData.getCategory(ban, category).get(name).toString());
                }
                ttt = "\t";
            }
        }

    }
*/
    public void choiceList(int choice) {
        Map studentData = this.studentData.getStudentData();

        for (Object ban : studentData.keySet()) {
            System.out.println(ban);

            Map categoryMap = (Map) studentData.get(ban);
            for (Object category : categoryMap.keySet()) {
                System.out.println("\t" + category);

                TreeMap studentMap = new TreeMap((Map) categoryMap.get(category)); //이름정렬
                switch(choice){
                    case 4:
                        for (Object name : studentMap.keySet()) {
                            System.out.println("\t\t" + name + " " +
                                    studentMap.get(name).toString());
                        }
                        break;
                    case 5:
                        for (int index = 1; index <= studentMap.size(); index++) {
                            for (Object name : studentMap.keySet()) {
                                StudentVO temp = (StudentVO) studentMap.get(name);

                                if (index == temp.getRanking()) {
                                    System.out.println("\t\t" + name + " " +
                                            studentMap.get(name).toString());
                                }
                            }
                        }
                        break;
                }
            }
        }
    }

    @Override
    public void listAll() throws Exception {
        Map studentData = this.studentData.getStudentData();

        for (Object ban : studentData.keySet()) {
            System.out.println(ban);

            Map categoryMap = (Map) studentData.get(ban);
            for (Object category : categoryMap.keySet()) {
                System.out.println("\t" + category);

                TreeMap nameMap = new TreeMap((Map) categoryMap.get(category)); //이름정렬
                for (Object name : nameMap.keySet()) {
                    System.out.println("\t\t" + name + " " +
                            nameMap.get(name).toString());
                }
            }
        }
    }

    /*
    @Override
    public void listAllByAvg() throws Exception { //Collection Sort이용한거
        Map data = studentData.getStudentData();
        Iterator banData = studentData.getIterator(data);

        while(banData.hasNext()) {
            String ban = banData.next().toString();
            System.out.println("반 :" + ban);

            String ttt = "\t";
            Iterator categoryData = studentData.getIterator(studentData.getBan(ban));
            while(categoryData.hasNext()){
                String category = categoryData.next().toString();
                System.out.println(ttt + "분류 : " + category);

                ttt = "\t\t";
                List listCategory = sortByAvg(studentData.getCategory(ban, category));

                int count = 1;
                for(Object name : listCategory){
                    System.out.println(ttt + name + " "
                            + studentData.getCategory(ban, category).get(name).toString() + " "+ count);
                    count++;
                }
                ttt = "\t";
            }
        }
    }
     */
    @Override
    public void listAllByAvg() throws Exception {//평소 방식
        Map studentData = this.studentData.getStudentData();

        for (Object ban : studentData.keySet()) {
            System.out.println(ban);

            Map categoryMap = (Map) studentData.get(ban);
            for (Object category : categoryMap.keySet()) {
                System.out.println("\t" + category);

                Map studentMap = (Map) categoryMap.get(category);
                for (int index = 1; index <= studentMap.size(); index++) {
                    for (Object name : studentMap.keySet()) {
                        StudentVO temp = (StudentVO) studentMap.get(name);

                        if (index == temp.getRanking()) {
                            System.out.println("\t\t" + name + " " +
                                    studentMap.get(name).toString());
                        }
                    }
                }
            }
        }
    }

    @Override
    public void listBan() throws Exception{
        Map studentData = this.studentData.getStudentData();
        for(Object ban : studentData.keySet()){
            int total = 0;
            System.out.println(ban);

            Map categoryMap = (Map)studentData.get(ban);
            for(Object category : categoryMap.keySet()){
                System.out.println("\t" + category);

                Map students = (Map)categoryMap.get(category);
                System.out.println("\t\t[인원] : " + students.size() +
                        " [평균] : " + this.studentData.calcBan(students));
                total += students.size();
            }

            System.out.println("\t[총 인원] : " + total);
        }
    }

    @Override
    public StudentVO searchStudent() throws Exception { // 안만들래여
        return null;
    }

    @Override
    public List sortByAvg(Map student) throws Exception { //그냥 Collection Sort 사용해보기
        List list = new ArrayList();
        list.addAll(student.keySet());

        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                double value1 = ((StudentVO) student.get(o1)).getAvg();
                double value2 = ((StudentVO) student.get(o2)).getAvg();

                return ((Comparable) value2).compareTo(value1);
            }
        });

        return list;
    }
}
