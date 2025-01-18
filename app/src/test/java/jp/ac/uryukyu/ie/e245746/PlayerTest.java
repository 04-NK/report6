package jp.ac.uryukyu.ie.e245746;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PlayerTest {
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
