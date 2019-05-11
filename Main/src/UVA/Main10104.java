/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author jojstepersan
 * 10104 - Euclid Problem
 */
public class Main10104 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        String s;
        while ((s = in.readLine()) != null) {
            int a, b;
            StringTokenizer st = new StringTokenizer(s);
            a = Integer.valueOf(st.nextToken());
            b = Integer.valueOf(st.nextToken());
            Triple t = gcd(a, b);
            System.out.println(t);

        }

    }

    public static Triple gcd(int a, int b) {
        if (b == 0) {
            return new Triple(1, 0, a);
        } else {
            Triple t = gcd(b,a%b);
            return new Triple(t.y, t.x - (a / b) * t.y, t.g);
        }
    }
}

class Triple {

    int x, y, g;

    public Triple(int x, int y, int g) {
        this.x = x;
        this.y = y;
        this.g = g;
    }

    @Override
    public String toString() {
        return  x + " " + y + " " + g ;
    }
    

}
