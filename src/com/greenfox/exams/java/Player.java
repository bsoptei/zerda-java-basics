package com.greenfox.exams.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Balazs Soptei on 2016.12.05. Java exam
 */
public class Player {
    public String name;
    public ArrayList<Card> played = new ArrayList<>();

    public int sum() {
        Integer sum = 0;
        for (Card card : played) {
            sum += card.value;
        }
        return sum;
    }

    public void add(Card card) {
        played.add(card);
    }

    public String showCards() {
        StringBuilder temp = new StringBuilder();
        for (Card card : played) {
            temp.append(card.getValue());
        }
        return temp.toString();
    }
}
