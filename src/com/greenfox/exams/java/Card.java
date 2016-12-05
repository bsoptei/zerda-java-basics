package com.greenfox.exams.java;

/**
 * Created by Balazs Soptei on 2016.12.05. Java exam
 */
public class Card {
    public String color;
    public Integer value;

    public Card(String color, Integer value) {
        this.color = color;
        this.value = value;
    }

    public String getValue(){
        return String.format("%s %d", color, value);
    }
}
