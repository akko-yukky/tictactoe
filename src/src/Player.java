package src;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Player {
    public void play() throws IOException {
        //入力からプレーするマスを(int x,int y)で受取り、マス(x.y)にマルをつける
        System.out.println("プレーする行を1～3から選んでください");
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        String x = br.readLine();

        System.out.println("プレーする行を1～3から選んでください");
        String y = br.readLine();
        while (true) {
            if (!(coord[i][j] == 0)) {
                coord[i][j] = 1;
                break;
            } else {
            System.out.println("不正な入力です。");
            continue;
        }
    }

    }
}
