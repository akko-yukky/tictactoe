package src;

import java.util.Random;

public class Opponent {
    public void play(){
        //空いているマスから一つランダムに選んでペケをつける
        while(true){
        Random rand = new Random();
        int i = rand.nextInt(3);
        int j = rand.nextInt(3);
            if (!(coord[i][j] == 0)) {
            }
            break;
        }
    }
}
