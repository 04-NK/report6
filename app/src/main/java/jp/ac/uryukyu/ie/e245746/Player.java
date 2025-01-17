package jp.ac.uryukyu.ie.e245746;

import java.util.HashSet;
import java.util.Set;

public class Player {
    Set<Integer> cardsCollect;
    Set<Object> collectedcard; 
      
    public Player() {
        cardsCollect = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            cardsCollect.add(i);  
        }
        collectedcard = new HashSet<>();
    }

    public void collectCard(Object card) {
        if (card instanceof Integer) {
            cardsCollect.remove(card);
            collectedcard.add(card);
        }
    }

    public boolean CollectedAllCards() {
        return cardsCollect.isEmpty();  
    }

    public Set<Integer> getCardsCollect() {
        return cardsCollect;  
    }
    public Set<Object> getCollectedcard() {
        return collectedcard; 
    }

}