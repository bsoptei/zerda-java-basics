package com.greenfox.exams.java;

import java.util.*;

/**
 * Created by Balazs Soptei on 2016.12.05. Java exam
 */
public class Deck {
    public final ArrayList<String> colors = new ArrayList<>(Arrays.asList("treff", "kor", "pikk", "karo"));
    public ArrayList<Card> cards = new ArrayList<>();
    public ArrayList<Card> used = new ArrayList<>();

    public Deck() {
        generateCards();
        shuffle();
        shuffle();
    }

    public void generateCards() {
        for (String color : colors) {
            for (int value = 2; value <= 14; value++) {
                cards.add(new Card(color, value));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        if (!cards.isEmpty()) {
            Card actualCard = cards.remove(cards.size() - 1);
            used.add(actualCard);
            return actualCard;
        } else {
            return null;
        }
    }
}
