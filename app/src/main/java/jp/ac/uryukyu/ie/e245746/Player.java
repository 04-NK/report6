package jp.ac.uryukyu.ie.e245746;

import java.util.HashSet;
import java.util.Set;

public class Player {
    private Set<Integer> cardsCollect;  

    public Player() {
        cardsCollect = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            cardsCollect.add(i);  
        }
    }

    public void collectCard(Object card) {
        if (card instanceof Integer) {
            cardsCollect.remove(card);  
        }
    }

    public boolean CollectedAllCards() {
        return cardsCollect.isEmpty();  
    }

    public Set<Integer> getCardsCollect() {
        return cardsCollect;  
    }
}