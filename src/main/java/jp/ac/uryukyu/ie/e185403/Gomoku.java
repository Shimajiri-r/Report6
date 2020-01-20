package jp.ac.uryukyu.ie.e185403;

/**
 * Gomokuクラス
 * 二人対戦用五目並べ
 * Created by e185403
 */
public class Gomoku {

    public static void main(String[] args){
        BoardOutput.boardOutput(Input.getBoard());//初期盤面

        //最大で20×20の全てが埋まるまで実行可能
        for(int i = 0;i < (Input.getBoardSquare()) * (Input.getBoardSquare());i++) {
            Input.input();
            BoardOutput.boardOutput(Input.getBoard());

            //一度置いたら、プレイヤーの入れ替え(1P->2P->1P->...)
            if(Input.getPlayerNumber() == 1){
                Input.setPlayerNumber(2);
            }
            else{
                Input.setPlayerNumber(1);
            }
        }
    }

}
