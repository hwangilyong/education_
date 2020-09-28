package com.company.day38.Samsung;

public class SmartPhone {
    private Part part;

    public void setPart(Part part){
        this.part = part;
    }
    public Part getPart() {return part;}

    public void takePicture(){
    }

    public void calling(){
    }

    public void checkBattery(){
        if(part.getBattery() < 1){
            System.out.println("휴대폰 종료");        }

        System.out.println("배터리 남은용량 : " + part.getBattery());
    }
}
