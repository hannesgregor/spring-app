package com.spring.models;

public class Place {

    private String name;
    private String phenomenon;
    private int tempMin;

    public Place(){}

    public Place(String name, String phenomenon, int tempMin){
        this.name = name;
        this.phenomenon = phenomenon;
        this.tempMin = tempMin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhenomenon() {
        return phenomenon;
    }

    public void setPhenomenon(String phenomenon) {
        this.phenomenon = phenomenon;
    }

    public int getTempMin() {
        return tempMin;
    }

    public void setTempMin(int tempMin) {
        this.tempMin = tempMin;
    }
}
