package jp.ac.uryukyu.ie.e185403;

/**
 * Created by e185403
 */
public class Gomoku {
    public static final int BOARD_SQUARE = 20;
    public static final int[][] board = new int[BOARD_SQUARE][BOARD_SQUARE];
    public int playerNumber = 1;

    public static void main(String[] args){
        BoardOutput.boardOutput(board);
    }
}
