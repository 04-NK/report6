package jp.ac.uryukyu.ie.e245746;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// ゲームの進行を管理するクラス
public class Game {
    PlayingCards deck;
    List<Player> players;  
    int PlayerIndex;  
    // ゲームの初期化
    public Game(int PlayersNumber) {
        deck = new PlayingCards();
        deck.addCards();  
        players = new ArrayList<>();
        PlayerIndex = 0;
    
        for (int i = 0; i < PlayersNumber; i++) {
            players.add(new Player());
        }
    }
    public void start() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
        // 現在のプレイヤーの数を取得
            Player currentPlayer = players.get(PlayerIndex);  
            System.out.println("現在のプレイヤー: プレイヤー " + (PlayerIndex + 1));
            System.out.println("集めたカード: " + currentPlayer.getCollectedcard());

            System.out.println("カードを引きますか？(y:引く/n:引かない) ");
            String input = scanner.nextLine();
            // カードを引く
            if (input.equalsIgnoreCase("y")) {
                Object drawnCard = deck.drawRandomCard();  
                if (drawnCard != null) {
                    System.out.println("引いたカード: " + drawnCard);
                    System.out.println();
                    currentPlayer.collectCard(drawnCard);
                // カードが無くなった場合
                } else {
                System.out.println("カードがありません！");
                System.out.println("引き分けです！");
                break;
                }
            // カードを引かない場合
            } else if (input.equalsIgnoreCase("n")) {
                System.out.println("カードを引きませんでした。");
            }
            // プレイヤーがすべてのカードを集めたか確認
            if (currentPlayer.CollectedAllCards()) {
                System.out.println("おめでとう！プレイヤー " + (PlayerIndex + 1) + " がすべてのカードを集めました！");
                break;
            }
            // プレイヤーのインデックスを上書きし、次のプレイヤーに交代
            PlayerIndex = (PlayerIndex + 1) % players.size();
        }
        scanner.close();
    }
}
