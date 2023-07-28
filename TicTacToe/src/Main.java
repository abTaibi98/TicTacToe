import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Welcome to Tic Tac Toe");
        String nextRound = "";
        Scanner scanner  = new Scanner(System.in);
        do {
            Game.playGame();
            System.out.println("do you want to keep playing? Input x to exit game and anything else to continue.");
            nextRound = scanner.nextLine();
        }while(!nextRound.equals("x"));
    }
}