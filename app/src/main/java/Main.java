import java.util.Scanner;

import jp.ac.uryukyu.ie.e245746.Game;  
// プレイヤー数の入力し、ゲームを開始する
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("プレイヤー数を入力してください: ");
        int PlayersNumber = scanner.nextInt();
        scanner.nextLine();  

        Game game = new Game(PlayersNumber);
        game.start();
        scanner.close();
    }
}