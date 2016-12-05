package com.greenfox.exams.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by Balazs Soptei on 2016.12.05. Java exam
 */
public class BlackJack extends JPanel {
    public JButton reset;
    public JButton drawCard;
    public Player house;
    public Player user;
    public JLabel housePlayed;
    public JLabel userPlayed;
    public Deck deck;

    public BlackJack() {
        createElements();
        addButtonActionListener();
        addElementsToPanel();
        this.house = new Player("Player");
        this.user = new Player("House");
        this.deck = new Deck();
    }

    public void createElements() {
        reset = new JButton("New Game");
        drawCard = new JButton("Draw a drawCard");
        housePlayed = new JLabel("House played: ");
        userPlayed = new JLabel("User played:");
    }

    public void addButtonActionListener() {
        ListenForButton buttonListener = new ListenForButton();
        reset.addActionListener(buttonListener);
        drawCard.addActionListener(buttonListener);
    }

    public void addElementsToPanel() {
        this.add(userPlayed);
        this.add(housePlayed);
        this.add(reset);
        this.add(drawCard);
    }

    public class ListenForButton implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == reset) {
                deck = new Deck();
                user.played = new ArrayList<>();
                house.played = new ArrayList<>();
            } else {
                if (!deck.cards.isEmpty()) {
                    user.add(deck.draw());
                    if (house.sum() < 17) {
                        house.add(deck.draw());
                    }
                }
            }
            update();
        }
    }

    private void update() {
        housePlayed.setText("House played: " + house.showCards());
        userPlayed.setText("User played: " + user.showCards());
    }
}
