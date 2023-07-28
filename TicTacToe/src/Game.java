import java.util.*;
public class Game {

    private Player player1 = new Player(1);
    private Player player2 = new Player(0);
    private static Board b = new Board();
    private static Scanner sc = new Scanner(System.in);

    private List<String> positions = Arrays.asList("A1", "A2", "A3", "B1", "B2", "B3", "C1", "C2", "C3");

    public static void playGame(){
        int count = 0;
        String choice;
        do{
            do {
                System.out.println("Player 1 input your grid choice.");
                choice = sc.nextLine();
            }while(validChoice(choice, "X") == false);
            System.out.println(b);
            count++;
            if(count == 9){
                break;
            }
            do {
                System.out.println("Player 2 input your grid choice.");
                choice = sc.nextLine();
            }while(validChoice(choice, "O") == false);
            System.out.println(b);
            count ++;
        }while(win()==0 || count <=9);
    }

    public static boolean validChoice(String choice, String symbol) {
        int columnIndex;
        int rowIndex;
        if (choice.charAt(0) == 'A') {
            columnIndex = 0;
        } else if (choice.charAt(0) == 'B') {
            columnIndex = 1;
        } else if (choice.charAt(0) == 'C') {
            columnIndex = 2;
        } else {
            System.out.println("Column index incorrect format.");
            return false;
        }
        if (choice.charAt(1) == '1') {
            rowIndex = 0;
        } else if (choice.charAt(1) == '2') {
            rowIndex = 1;
        } else if (choice.charAt(1) == '3') {
            rowIndex = 2;
        } else {
            System.out.println("Row index incorrect format.");
            return false;
        }
        if (!(b.getBoardSymbol(rowIndex,columnIndex) == ".")){
            System.out.println("Position already filled, invalid choice.");
            return false;
        }else{
            b.setBoardSymbol(rowIndex, columnIndex, symbol);
        }
        return true;
    }

    public void playerInput(){

    }
    public static int win(){
        return 0;
    }

}
