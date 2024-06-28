/*
    Thanapoom Chaisena
    6510450437
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int playerNumber;

        System.out.println("Please enter number of players: ");
        Scanner scanner = new Scanner(System.in);
        playerNumber = scanner.nextInt();

        boolean flag = true;
        while (flag){
            if (playerNumber < 2 || playerNumber > 8){
                System.out.println("Must have 2 to 8 player to start the game.");
                System.out.println("Please enter a number of player again.");
                playerNumber = scanner.nextInt();
            }else {
                System.out.println("Total number of players: " + playerNumber);
                System.out.println("----------------------------------------");
                MGame game = new MGame(playerNumber);
                for (int i = 0; i < playerNumber; i++){
                    System.out.println("Enter player name: ");
                    String playerName = scanner.next();
                    System.out.println(playerName + " Has joined the game.");
                    Player player = new Player(playerName);
                    game.players.add(player);
                }
                System.out.println("----------------------------------------");

                game.playGame();

                flag = false;
            }
        }

    }
}