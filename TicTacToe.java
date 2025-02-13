import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TicTacToe {

    static String[] board;
    static String turn;

    static String checkWinner() {
        for (int i = 0; i < 8; i++) {
            String line = null;

            switch (i) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }

            if (line.equals("XXX")) {
                return "X";

            } else if (line.equals("OOO")) {
                return "O";
            }

        }
        for (int i = 0; i < 9; i++) {
            if (Arrays.asList(board).contains(String.valueOf(i + 1))) {
                break;

            } else if (i == 8) {
                return " draw";

            }
        }
        System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");

        return null;
    }

    static void printBoard() {
        System.out.println("|---|---|---");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");

        System.out.println("|---|---|---|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");

        System.out.println("|---|---|---|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ;
        board = new String[9];
        turn = "X";
        String winner = null;

        for (int i = 0; i < 9; i++) {
            board[i] = String.valueOf(i + 1);
        }

        System.out.println(" Welcome to 3X3 TicTac Toe.");
        printBoard();

        System.out.println(" X will be first player. Enter a slot number to place x in: ");
        while (winner == null) {
            int numInput;


            try {
                numInput = in.nextInt();
                if (!(numInput > 0 && numInput <= 9)) {
                    System.out.println("Invalid input; re-enter slot number:");
                    continue;
                }
            }
            catch(InputMismatchException e) {
                   System.out.println("Invalid input; re-enter slot number:");
                    continue;
        }
            if (board[numInput - 1].equals( String.valueOf(numInput))) {
                board[numInput-1] = turn;

                if (turn.equals("X")) {
                    turn = "O";
                }
                else {
                    turn = "X";
                }
                printBoard();
                winner = checkWinner();

                }
            else {
                System.out.println("Slot is already taken; re-enter slot number:");
            }
        }

        if ( winner.equalsIgnoreCase("draw")) {
            System.out.println(" It is a draw! Thanks for playing.");
        }

        else{
            System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
        }
        in.close();
    }
}