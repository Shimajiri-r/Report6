package jp.ac.uryukyu.ie.e185403;

import java.util.Scanner;

/**
 * Inputクラス
 *  int BOARD_SQUARE;//盤面の大きさ
 *  int[][] board;//盤面の縦×横の二次元配列
 *  int playerNumber;//手番のプレイヤー番号
 */
public class Input {

    private static int BOARD_SQUARE = 20;
    private static int[][] board = new int[BOARD_SQUARE][BOARD_SQUARE];
    private static int playerNumber = 1;
    private static int x,y;

    /**
     * 手番の確認および入力した座標への配置を行うメソッド
     */
    public static void input(){
        System.out.printf("%d(",getPlayerNumber());
        switch (getPlayerNumber()){
            case 0: System.out.print("• ");
                break;
            case 1: System.out.print("○");
                break;
            case 2: System.out.print("●");
                break;
        }
        System.out.println(")の番です");

        while(true){
            System.out.println("置く位置を指定してください(x y)：");
            Scanner scan = new Scanner(System.in);
            setX(scan.nextInt());
            setY(scan.nextInt());

            if (x >= 0 && x < getBoardSquare() && y >= 0 && y < getBoardSquare()){
                if (board[getX()][getY()] == 0){
                    board[getX()][getY()] = getPlayerNumber();
                    break;
                }
                else{
                    System.out.println("その位置には置けません");
                }
            }
        }
    }

    static void setBoradSquare(int square){
        Input.BOARD_SQUARE = square;
    }

    static int getBoardSquare(){
        return BOARD_SQUARE;
    }

    static int[][] getBoard(){
        return board;
    }

    static void setPlayerNumber(int n){
        Input.playerNumber = n;
    }

    static int getPlayerNumber(){
        return playerNumber;
    }

    static void setX(int x){
        Input.x = x;
    }

    static int getX() {
        return x;
    }

     static void setY(int y){
        Input.y = y;
     }

    static int getY() {
        return y;
    }
}
