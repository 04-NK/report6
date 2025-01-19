package jp.ac.uryukyu.ie.e245746;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;

import org.junit.jupiter.api.Test;

public class PlayerTest {
    @Test
    public void testCollectCard() {
        Player player = new Player(); 
        // プレイヤーがカードを集める
        player.collectCard(1);
        Set<Integer> cardsCollect = player.getCardsCollect();
        Set<Object> collectedCards = player.getCollectedcard();
        
        // 1番のカードが収集され、cardsCollectから削除され、collectedcardに追加されていることを確認
        assertFalse(cardsCollect.contains(1));
        assertTrue(collectedCards.contains(1));
    }
    @Test
    public void testCollectedAllCards() {
        Player player = new Player(); 
        // すべてのカードを集めた場合
        for (int i = 1; i <= 10; i++) {
            player.collectCard(i);
        }
        // すべてのカードを集めたので、CollectedAllCardsはtrueを返すべき
        assertTrue(player.CollectedAllCards());
    }
}
