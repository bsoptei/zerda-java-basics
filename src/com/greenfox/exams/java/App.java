package com.greenfox.exams.java;

import javax.swing.*;

/**
 * Created by Balazs Soptei on 2016.12.05. Java exam
 */
public class App {
    public static void main(String[] args) {
        JFrame display = new JFrame();
        display.setTitle("BlackJackApp");
        display.setSize(300, 400);
        display.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        display.setLocationRelativeTo(null);
        display.add(new BlackJack());
        display.setVisible(true);
    }

}
