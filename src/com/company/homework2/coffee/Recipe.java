package com.company.homework2.coffee;

public class Recipe {
    private double beanRatio;
    private double waterRatio;

    public Recipe(double beanRatio, double waterRatio){
        this.beanRatio = beanRatio;
        this.waterRatio = waterRatio;
    }

    public double getBeanRatio(){
        return beanRatio;
    }

    public double getWaterRatio(){
        return waterRatio;
    }
}
