package jp.ac.uryukyu.ie.e185403;

/**
 * Created by e185403
 */
public class Gomoku {

    public static void main(String[] args){
        BoardOutput.boardOutput(Input.getBoard());

        for(int i = 0;i < (Input.getBoardSquare()) * (Input.getBoardSquare());i++) {
            Input.input();
            BoardOutput.boardOutput(Input.getBoard());

            if(Input.getPlayerNumber() == 1){
                Input.setPlayerNumber(2);
            }
            else{
                Input.setPlayerNumber(1);
            }
        }
    }

}
