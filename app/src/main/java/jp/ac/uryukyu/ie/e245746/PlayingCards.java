package jp.ac.uryukyu.ie.e245746;

import java.util.ArrayList;
// カードデッキを管理するクラス
public class PlayingCards {
    ArrayList<Object> cards = new ArrayList<>();
    // 1〜10の数字カードと、絵札（"J", "Q", "K"）を4セット（スートなし）デッキに加える
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
    // デッキからランダムにカードを1枚引く
    // デッキが空でない場合、カードを1枚ランダムに引いてデッキから削除する
    // デッキが空の場合は、`null` を返す
    public Object drawRandomCard() {
        if (cards.size() == 0) {
            return null;
        }
        int randomIndex = (int) (Math.random() * cards.size());
    
        return cards.remove(randomIndex);
    }
}

