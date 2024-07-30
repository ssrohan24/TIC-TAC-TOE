import java.util.Scanner;
import java.util.Random;

public class TicTacToe {
    public static void displayBoard(char[] board) {
        System.out.println("   |   |");
        System.out.println(" " + board[7] + " | " + board[8] + " | " + board[9]);
        System.out.println("   |   |");
        System.out.println("-----------");
        System.out.println("   |   |");
        System.out.println(" " + board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("   |   |");
        System.out.println("-----------");
        System.out.println("   |   |");
        System.out.println(" " + board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("   |   |");
    }

    public static char[] playerInput() {
        Scanner scanner = new Scanner(System.in);
        char marker = ' ';
        while (marker != 'X' && marker != 'O') {
            System.out.print("Player 1: Do you want to be X or O? ");
            marker = scanner.next().toUpperCase().charAt(0);
        }
        if (marker == 'X') {
            return new char[]{'X', 'O'};
        } else {
            return new char[]{'O', 'X'};
        }
    }

    public static void placeMarker(char[] board, char marker, int position) {
        board[position] = marker;
    }

    public static boolean winCheck(char[] board, char mark) {
        return (board[7] == mark && board[8] == mark && board[9] == mark) ||
               (board[4] == mark && board[5] == mark && board[6] == mark) ||
               (board[1] == mark && board[2] == mark && board[3] == mark) ||
               (board[7] == mark && board[4] == mark && board[1] == mark) ||
               (board[8] == mark && board[5] == mark && board[2] == mark) ||
               (board[9] == mark && board[6] == mark && board[3] == mark) ||
               (board[7] == mark && board[5] == mark && board[3] == mark) ||
               (board[9] == mark && board[5] == mark && board[1] == mark);
    }

    public static String chooseFirst() {
        Random rand = new Random();
        return rand.nextInt(2) == 0 ? "Player 2" : "Player 1";
    }

    public static boolean spaceCheck(char[] board, int position) {
        return board[position] == ' ';
    }

    public static boolean fullBoardCheck(char[] board) {
        for (int i = 1; i < 10; i++) {
            if (spaceCheck(board, i)) {
                return false;
            }
        }
        return true;
    }

    public static int playerChoice(char[] board) {
        Scanner scanner = new Scanner(System.in);
        int position = 0;
        while (position < 1 || position > 9 || !spaceCheck(board, position)) {
            System.out.print("Choose your next position: (1-9) ");
            position = scanner.nextInt();
        }
        return position;
    }

    public static boolean replay() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to play again? Enter Yes or No: ");
        String response = scanner.next().toLowerCase();
        return response.startsWith("y");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Tic Tac Toe!");

        do {
            char[] theBoard = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
            char[] markers = playerInput();
            char player1Marker = markers[0];
            char player2Marker = markers[1];
            String turn = chooseFirst();
            System.out.println(turn + " will go first.");

            boolean gameOn = true;
            while (gameOn) {
                if (turn.equals("Player 1")) {
                    displayBoard(theBoard);
                    int position = playerChoice(theBoard);
                    placeMarker(theBoard, player1Marker, position);

                    if (winCheck(theBoard, player1Marker)) {
                        displayBoard(theBoard);
                        System.out.println("Congratulations! You have won the game!");
                        gameOn = false;
                    } else if (fullBoardCheck(theBoard)) {
                        displayBoard(theBoard);
                        System.out.println("The game is a draw!");
                        gameOn = false;
                    } else {
                        turn = "Player 2";
                    }
                } else {
                    displayBoard(theBoard);
                    int position = playerChoice(theBoard);
                    placeMarker(theBoard, player2Marker, position);

                    if (winCheck(theBoard, player2Marker)) {
                        displayBoard(theBoard);
                        System.out.println("Player 2 has won!");
                        gameOn = false;
                    } else if (fullBoardCheck(theBoard)) {
                        displayBoard(theBoard);
                        System.out.println("The game is a draw!");
                        gameOn = false;
                    } else {
                        turn = "Player 1";
                    }
                }
            }
        } while (replay());
    }
}
