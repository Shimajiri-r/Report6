package jp.ac.uryukyu.ie.e185403;

/**
 * Judgmentクラス
 */
public class Judgment {
    /**
     * 盤面を8方向に調べるメソッド
     * @param x 置いた列番号
     * @param y 置いた行番号
     */
    public static void judgment(int x , int y){
        int[] n = new int[4];
        int moveX;
        int moveY;
        int i;

        moveX = 1; moveY = 1;     //[＼]方向
        n[0] = count( x, y, moveX, moveY, Input.getBoard());

        moveX = 0; moveY = 1;     //[│]方向
        n[1] = count( x, y, moveX, moveY, Input.getBoard());

        moveX = 1; moveY = 0;     //[─]方向
        n[2] = count( x, y, moveX, moveY, Input.getBoard());

        moveX = -1; moveY = 1;    //[／]方向
        n[3] = count( x, y, moveX, moveY, Input.getBoard());

        for( i = 0; i < 4; i++ ){
            if(n[i] == 5){
                gameFinish();
            }
        }
    }

    /**
     * 5つ並んでいるか調べるメソッド
     * @param x 置いた列番号
     * @param y 置いた行番号
     * @param moveX 列座標の移動する分の値
     * @param moveY 行座標の移動する分の値
     * @param board 盤面の配列
     * @return
     */
    public static int count(int x,int y,int moveX,int moveY,int[][] board){
        int n =1;
        int j;

        for (j = 1; j < 5; j++) {
            if ( ( x + (moveX * j) >= 0 && x + (moveX * j) <= 19 ) && ( y + (moveY * j) >= 0 && y + (moveY * j) <= 19) ){
                if (board[x + (moveX * j)][y + (moveY * j)] == Input.getPlayerNumber()) {
                    n += 1;
                } else {
                    break;
                }
            }
        }
        for (j = 1; j < 5; j++) {
            if ( (x + (-1 * moveX * j) >= 0 && x + (-1 * moveX * j) <= 19) && ( y + (-1 * moveY * j) >= 0 && y + (-1 * moveY * j) <= 19 ) ){
                if (board[x + (-1 * moveX * j)][y + (-1 * moveY * j)] == Input.getPlayerNumber()) {
                    n += 1;
                } else {
                    break;
                }
            }
        }
        return n;
    }

    /**
     * 5つ並んだ場合、gameを終了させるメソッド
     */
    public static void gameFinish(){
        BoardOutput.boardOutput(Input.getBoard());
        System.out.printf("%d(",Input.getPlayerNumber());
        switch (Input.getPlayerNumber()){
            case 0: System.out.print("• ");
                break;
            case 1: System.out.print("○");
                break;
            case 2: System.out.print("●");
                break;
        }
        System.out.println(")の勝ちです");
        System.exit(0);
    }
}
