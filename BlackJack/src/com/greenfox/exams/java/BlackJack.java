package com.greenfox.exams.java;

import javax.swing.*;

/**
 * Created by Balazs Soptei on 2016.12.05. Java exam
 */
public class BlackJack extends JPanel {
    public JButton newGame;
    public JButton drawCard;
    public Player house;
    public Player user;
    public JLabel housePlayed;
    public JLabel userPlayed;

    public BlackJack() {
        createElements();
        addElementsToPanel();
    }

    public void createElements() {
        newGame = new JButton("New Game");
        drawCard = new JButton("Draw a drawCard");
        housePlayed = new JLabel("House played: ");
        userPlayed = new JLabel("User played:");
    }

    public void addElementsToPanel() {
        this.add(userPlayed);
        this.add(housePlayed);
        this.add(newGame);
        this.add(drawCard);
    }

}
