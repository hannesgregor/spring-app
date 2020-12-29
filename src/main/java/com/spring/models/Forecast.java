package com.spring.models;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement
public class Forecast {

    private String date;
    private ArrayList<Day> day;
    private ArrayList<Night> night;

    public Forecast(){
    }

    public Forecast(String date, ArrayList<Day>day, ArrayList<Night>night) {
        this.date = date;
        this.day = day;
        this.night = night;
    }

    @XmlAttribute
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    @XmlElement
    public ArrayList<Day> getDay() {
        return day;
    }

    public void setDay(ArrayList<Day> day) {
        this.day = day;
    }
    @XmlElement
    public ArrayList<Night> getNight() {
        return night;
    }

    public void setNight(ArrayList<Night> night) {
        this.night = night;
    }
}
