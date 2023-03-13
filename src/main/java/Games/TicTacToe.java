package Games;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class TicTacToe {
    static char[][] board ;
    static int col, row;
    //    static BufferedReader predator=new BufferedReader( new InputStreamReader(System.in));
    static Scanner predator = new Scanner(System.in);

    public static void main(String[] args) {
        Monitoring();
        insert(1,2,'x');
        insert(0,2,'x');
        insert(2,2,'x');
        Monitoring();
    }
//    static

    static void Monitoring() {
        for (int i = 0; i < board.length; i++) {
            System.out.println("\n+-----------+");
            System.out.print("|");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(" " + board[i][j] + " |");
            }
        }
        System.out.println("\n+-----------+");
    }

    static void insert( int row,int col,char symbol) {
        board[row][col]=symbol;
        return;
    }

}
