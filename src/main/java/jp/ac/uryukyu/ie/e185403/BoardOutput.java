package jp.ac.uryukyu.ie.e185403;

/**
 * boardOutputクラス
 */
public class BoardOutput {
    static int i,j;

    /**
     * 五目並べの盤面を出力するメソッド
     * 縦*横　20×20
     */
    public static void boardOutput(int[][] board){
        System.out.print("  ");
        for (i=0;i<Input.getBoardSquare();i++){
                System.out.printf("%2d",i);
        }
        System.out.println("");

        for (i=0;i<Input.getBoardSquare();i++){
            System.out.printf("%2d ",i);

            for (j=0;j<Input.getBoardSquare();j++){
                switch (board[j][i]){
                    case 0: System.out.print("• ");
                            break;
                    case 1: System.out.print("○ ");
                            break;
                    case 2: System.out.print("● ");
                            break;
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
