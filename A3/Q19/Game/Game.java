package Game;
import java.util.Scanner;

import Player.Player;


class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.print("Enter player name: ");
        player.setName(scanner.next());
        System.out.print("Enter player score: ");
        player.setScore(scanner.nextInt());
        scanner.close();
        System.out.println("Player name: " + player.name);
        System.out.println("Player score: " + player.score);
    }
}