public class Board {
    private static String[][] board = {{".",".","."},{".",".","."},{".",".","."}};

    @Override
    public String toString(){
        System.out.println("================================");
        System.out.println("   |    1   |     2   |    3    |");
        System.out.println("================================");

        System.out.printf(" A |   %s    |    %s    |    %s    |\n", (String) board[0][0],(String)board[0][1],(String)board[0][2]);
        System.out.println("-------------------------------");
        System.out.printf(" B |   %s    |    %s    |    %s    |\n", (String)board[1][0],(String)board[1][1],(String)board[1][2]);
        System.out.println("-------------------------------");
        System.out.printf(" C |   %s    |    %s    |    %s    |\n", (String)board[2][0],(String)board[2][1],(String)board[2][2]);
        System.out.println("================================");
        return "";
    }

    public static String getBoardSymbol(int rowIndex, int columnIndex){
        return board[columnIndex][rowIndex];
    }

    public static void setBoardSymbol(int rowIndex, int columnIndex, String symbol){
        board[columnIndex][rowIndex] = symbol;
    }

}
