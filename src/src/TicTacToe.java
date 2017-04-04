package src;


import java.io.IOException;
import java.util.Arrays;

public class TicTacToe {
    //マルバツゲーム
    public static void main(String[] args) throws IOException {
        Field board = new Field();
        Player player = new Player();
        Opponent opponent = new Opponent();

        System.out.println("マルバツゲームです。あなたの先番で、○（マル）です。書き込むマスを指定してください。");
        System.out.println("");

        board.DrawField();
        player.play();
        opponent.play();
        if (board.CheckWinner() == true) {
            return;
        }
        board.CheckDraw();
    }
}
