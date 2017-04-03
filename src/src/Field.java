package src;

public class Field {


    public int[][] getCoord() {
        return coord;
    }

    public void setCoord(int[][] coord) {
        this.coord = coord;
    }

    private int[][] coord;

    public Field() {
        this.coord = new int[][]{
                {0, 0, 0}, {0, 0, 0}, {0, 0, 0}
        };
    }

    //引き分けチェック
    public void CheckDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((coord[i][j] != 0)) {
                    System.out.println("引き分けです。");
                    return;
                }
            }
        }
    }

    public void DrawField() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (coord[i][j]) {
                    case 0:
                        System.out.println("　");
                        break;
                    case -1:
                        System.out.println("×");
                        break;
                    case 1:
                        System.out.println("○");
                        break;
                }
            }
            System.out.println("");
        }
    }

    public boolean CheckWinner() {
        if (
                (coord[0][0] + coord[0][1] + coord[0][2] == 3)
                        || (coord[1][0] + coord[1][1] + coord[1][2] == 3)
                        || (coord[2][0] + coord[2][1] + coord[2][2] == 3)
                        || (coord[0][0] + coord[1][0] + coord[2][0] == 3)
                        || (coord[0][1] + coord[1][1] + coord[2][1] == 3)
                        || (coord[0][2] + coord[1][2] + coord[2][2] == 3)
                        || (coord[0][0] + coord[1][1] + coord[2][2] == 3)
                        || (coord[0][2] + coord[1][1] + coord[2][0] == 3)
                ) {
            System.out.println("○の勝ちです。");
            return true;
        } else if (
                (coord[0][0] + coord[0][1] + coord[0][2] == -3)
                        || (coord[1][0] + coord[1][1] + coord[1][2] == -3)
                        || (coord[2][0] + coord[2][1] + coord[2][2] == -3)
                        || (coord[0][0] + coord[1][0] + coord[2][0] == -3)
                        || (coord[0][1] + coord[1][1] + coord[2][1] == -3)
                        || (coord[0][2] + coord[1][2] + coord[2][2] == -3)
                        || (coord[0][0] + coord[1][1] + coord[2][2] == -3)
                        || (coord[0][2] + coord[1][1] + coord[2][0] == -3)
                ) {
            System.out.println("×の勝ちです。");
            return true;
        } else {
            return false;
        }
    }
}
