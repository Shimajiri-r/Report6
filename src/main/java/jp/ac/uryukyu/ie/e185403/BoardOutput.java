package jp.ac.uryukyu.ie.e185403;

public class BoardOutput {
    static int i,j;

    public static void boardOutput(int[][] board){
        System.out.print("  ");
        for (i=0;i<Gomoku.BOARD_SQUARE;i++){
                System.out.printf("%2d",i);
        }
        System.out.println("");

        for (i=0;i<Gomoku.BOARD_SQUARE;i++){
            System.out.printf("%2d ",i);

            for (j=0;j<Gomoku.BOARD_SQUARE;j++){
                switch (board[i][j]){
                    case 0: System.out.print("• ");
                            break;
                    case 1: System.out.print("○");
                            break;
                    case 2: System.out.print("●");
                            break;
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
