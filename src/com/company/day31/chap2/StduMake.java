package com.company.day31.chap2;

public class StduMake {
    StudentArr[] studentArrs;
    int[] banArr = new int[0];

    void makeSt(String name, int kor, int eng, int math, int art, int ban){
        if(studentArrs == null){
            studentArrs = new StudentArr[0];
        }

        StudentArr[] buffer = new StudentArr[studentArrs.length + 1];

        for(int index = 0; index < studentArrs.length; index++){
            buffer[index] = studentArrs[index];
        }

        buffer[studentArrs.length] = new StudentArr();
        buffer[studentArrs.length].init(name, kor, eng, math, art, ban);

        studentArrs = buffer;

        for(int index = 0; index < studentArrs.length; index++){
            studentArrs[index].calc(studentArrs);
        }

        addBanArr();
        banSort();
    }


    void print(){
        for(int index = 0; index < banArr.length; index++){
            System.out.println(banArr[index] + "반");
            System.out.println("\t일반 학생");
            for(int jdex = 0; jdex < studentArrs.length; jdex++){
                if(banArr[index] == studentArrs[jdex].ban && 0 == studentArrs[jdex].division){
                    studentArrs[jdex].ppp();
                }
            }
            System.out.println("\t특기생");
            for(int jdex = 0; jdex < studentArrs.length; jdex++){
                if(banArr[index] == studentArrs[jdex].ban && 1 == studentArrs[jdex].division){
                    studentArrs[jdex].ppp();
                }
            }
            System.out.println("");
        }
    }

    private void addBanArr(){
        int[] banTemp = new int[studentArrs.length];

        for(int index = 0; index < studentArrs.length; index++){
            banTemp[index] = studentArrs[index].ban;
        }

        for(int index = 0; index < banTemp.length; index++){
            for(int jdex = 0; jdex < banTemp.length - 1; jdex++){
                if(banTemp[index] == banTemp[jdex]){
                    if(check(banTemp[index], banArr)) {
                        makeBan(banTemp[index]);
                    }
                }
            }
        }
    }

    private boolean check(int a, int[] ban){
        for(int index = 0; index < ban.length; index++){
            if(a == ban[index]){
                return false;
            }
        }
        return true;
    }

    private void makeBan(int ban){
        int[] buffer = new int[banArr.length + 1];

        for(int index = 0; index < banArr.length; index++){
            buffer[index] = banArr[index];
        }

        buffer[banArr.length] = ban;
        banArr = buffer;
    }

    private void banSort(){
        for(int index = 0; index < banArr.length; index++){
            for(int jdex = 0; jdex < banArr.length - 1; jdex++){
                if(banArr[jdex] > banArr[jdex + 1]){
                    int temp = banArr[jdex + 1];
                    banArr[jdex + 1] = banArr[jdex];
                    banArr[jdex] = temp;
                }
            }
        }
    }

}

