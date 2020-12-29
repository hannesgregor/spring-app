package com.spring.models;

import java.util.ArrayList;

public class Night {
    private String phenomenon;
    private int tempMin;
    private int tempMax;
    private String text;
    private ArrayList<Place> place;
    private ArrayList<Wind> wind;
    private String sea;

    public Night(){}
    public Night(String phenomenon, int tempMin, int tempMax, String text, ArrayList<Place>place,
               ArrayList<Wind>wind, String sea){
        this.phenomenon = phenomenon;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.text = text;
        this.place = place;
        this.wind = wind;
        this.sea = sea;
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

    public int getTempMax() {
        return tempMax;
    }

    public void setTempMax(int tempMax) {
        this.tempMax = tempMax;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<Place> getPlace() {
        return place;
    }

    public void setPlace(ArrayList<Place> place) {
        this.place = place;
    }

    public ArrayList<Wind> getWind() {
        return wind;
    }

    public void setWind(ArrayList<Wind> wind) {
        this.wind = wind;
    }

    public String getSea() {
        return sea;
    }

    public void setSea(String sea) {
        this.sea = sea;
    }
}
