
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 * regional 2018 A
 *
 * @author jojstepersan
 */
public class MainA {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        String s = in.readLine().trim();
        double f = Float.valueOf(s);
        int g = 36000;
        String st[] = s.split("[.]");
        String n = st[0] + st[1];
//        int x = Integer.valueOf(st[1]);
//        if (x > 0) {
//            if (x % 10 == 0) {
//                f *= 10;
//                g *= 10;
//            } else {
//                f *= 100;
//                g *= 100;
//            }
//        }
        int x = Integer.valueOf(n);
      //  System.out.println(mcm((int) f, g) / (int) f);
      System.out.println(mcm((int) x, g) / (int) x);
    }

    static int mcm(int x, int y) {
        return x * y / mcd(x, y);
    }

    static int mcd(int x, int y) {
        int aux;
        while (y != 0) {
            x %= y;
            aux = y;
            y = x;
            x = aux;
        }
        return x;
    }
}
