package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*
All-star three-point contest 
*/
public class MainICPCRegional2018A {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        String s;
        int X=1;
        while ((s = in.readLine()) != null) {
            int t = Integer.valueOf(s);
            List<Player> players = new ArrayList<>();
            for (int i = 0; i < t; i++) {

                String scores[] = in.readLine().split(";");
                Player p = new Player(0, scores[0]);
                int score = 0;
                for (int j = 1; j < scores.length; j++) {
                    String sets[] = scores[j].split(" ");
                    for (int k = 0; k < sets.length; k++) {
                        if (k != sets.length - 1 && sets[k].equals("1")) {
                            score++;
                        } else if (sets[k].equals("1")) {
                            score += 2;
                        }
                    }

                }
                p.score = score;
                players.add(p);
            }
            Collections.sort(players);
            System.out.printf("Case %d:\n",X++);
            players.forEach(ply -> System.out.println(ply));
        }
    }
}

class Player implements Comparable<Player> {

    int score;
    String name;

    public Player(int score, String name) {
        this.score = score;
        this.name = name;
    }

    @Override
    public int compareTo(Player t) {
        int c = t.score - this.score;
        if (c == 0) {
            c = this.name.toLowerCase().compareTo(t.name.toLowerCase());
        }
        return c;

    }

    @Override
    public String toString() {
        return name + " " + score;
    }

}
