package com.company.day38.Samsung;

public class Part {
    private int camera = 2;
    private int internet = 3;
    private int mic = 2;
    private int battery = 10;

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getInternet() {
        return internet;
    }

    public void setInternet(int internet) {
        this.internet = internet;
    }

    public int getMic() {
        return mic;
    }

    public void setMic(int mic) {
        this.mic = mic;
    }

    public void setBattery(int battery){
        this.battery = battery;
    }

    public int getBattery(){
        return battery;
    }
}
