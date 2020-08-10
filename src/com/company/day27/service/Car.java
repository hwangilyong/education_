package com.company.day27.service;

public class Car {
    public Tire fronLeftTire = new KumhoTire();
    public Tire frontRightTire = new KumhoTire();
    public Tire backLeftTire = new HankookTire();
    public Tire backRightTrie = new  HankookTire();

    public void run(){
        fronLeftTire.repair();
        frontRightTire.repair();
        backLeftTire.repair();
        backRightTrie.repair();
    }
}
