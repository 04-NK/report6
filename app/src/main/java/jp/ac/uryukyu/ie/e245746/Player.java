package jp.ac.uryukyu.ie.e245746;

import java.util.HashSet;
import java.util.Set;
// プレイヤーを表すクラス
public class Player {
    Set<Integer> cardsCollect;
    Set<Object> collectedcard; 
    // プレイヤーが収集すべきカードのリスト生成
    public Player() {
        cardsCollect = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            cardsCollect.add(i);  
        }
        // 実際に収集したカードのリスト
        collectedcard = new HashSet<>();
    }
    // 収集すべきカードリストから引いたカードを削除
    // 実際に収集したカードリストに引いたカードを追加
    public void collectCard(Object card) {
        if (card instanceof Integer) {
            cardsCollect.remove(card);
            collectedcard.add(card);
        }
    }
    // プレイヤーが収集すべきカードのリストが空かの確認
    public boolean CollectedAllCards() {
        return cardsCollect.isEmpty();  
    }
    // 収集すべきカードを返す
    public Set<Integer> getCardsCollect() {
        return cardsCollect;  
    }
    // 実際に収集したカードを返す
    public Set<Object> getCollectedcard() {
        return collectedcard; 
    }
}