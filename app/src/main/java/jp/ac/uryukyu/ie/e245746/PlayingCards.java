package Report6.app.src.main.java.jp.ac.uryukyu.ie.e245746;

import java.util.ArrayList;

public class PlayingCards {
    ArrayList<Object> cards = new ArrayList<>();
    
    void addCards(){
        for (int j = 0; j < 4; j++){
            for (int i = 1; i <= 10; i++) {
                cards.add(i);
            }
            cards.add("J"); 
            cards.add("Q");  
            cards.add("K");
        }
    }

    public Object drawRandomCard() {
        if (cards.size() == 0) {
            return null;
        }
        int randomIndex = (int) (Math.random() * cards.size());
    
        return cards.remove(randomIndex);
    }

    
    public static void main(String[] args) {
        
        PlayingCards playingCards = new PlayingCards();

        playingCards.addCards();

        for (Object card : playingCards.cards) {
            System.out.print(card + " ");  
        }
        
    }
}

