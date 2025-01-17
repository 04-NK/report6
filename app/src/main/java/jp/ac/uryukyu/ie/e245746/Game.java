package jp.ac.uryukyu.ie.e245746;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    PlayingCards deck;
    List<Player> players;  
    int PlayerIndex;  
    
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

            Player currentPlayer = players.get(PlayerIndex);  
            System.out.println("現在のプレイヤー: プレイヤー " + (PlayerIndex + 1));
            System.out.println("集めたカード: " + currentPlayer.getCollectedcard());

            System.out.println("カードを引きますか？(y:引く/n:引かない) ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("y")) {

                Object drawnCard = deck.drawRandomCard();  
                if (drawnCard != null) {
                    System.out.println("引いたカード: " + drawnCard);
                    System.out.println();
                    currentPlayer.collectCard(drawnCard);
                } else {
                System.out.println("カードがもうありません！");
                System.out.println("引き分けです！");
                break;
                }
            } else if (input.equalsIgnoreCase("n")) {
                System.out.println("カードを引きませんでした。");
            }

            if (currentPlayer.CollectedAllCards()) {
                System.out.println("おめでとう！プレイヤー " + (PlayerIndex + 1) + " がすべてのカードを集めました！");
                break;
            }
        

            PlayerIndex = (PlayerIndex + 1) % players.size();
        }

        scanner.close();
    }
}
