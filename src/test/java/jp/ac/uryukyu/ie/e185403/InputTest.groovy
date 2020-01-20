package jp.ac.uryukyu.ie.e185403

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputTest {
    /**
     * 指定した座標に置けるか確認
     */
    @Test
    void testInput() {
        playerNumber = 1;
        x = 0;
        y = 0;
        Input.input();
        assertEquals(playerNumber,board[0][0]);
    }
}
