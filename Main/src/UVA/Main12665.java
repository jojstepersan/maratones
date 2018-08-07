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
 * 12665	Joking with Fermat's Last Theorem
 */
public class Main12665 {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int t = 1;
        while ((s = in.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(s);
            int x, y, c = 0;
            x = Integer.valueOf(st.nextToken());
            y = Integer.valueOf(st.nextToken());
            long a, b, sol;
            int max = Math.min(1001, y);
            for (int i = x; i <= y; i++) {
                for (int j = i; j <= y; j++) {
                    a = (long) Math.pow(i, 3);
                    b = (long) Math.pow(j, 3);
                    sol = a + b;
                    if (sol / 10 >= x && sol / 10 <= y && sol % 10 == 3) {
                        c+=2;
                    }
                    if (sol / 10 > y) {//.divide(BigInteger.TEN).compareTo(BigInteger.valueOf(y)) > 0) {
                        break;
                    }
                }
                //System.out.println("sol fin: "+sol);
                if (2 * (i * i * i) / 10 > y) {
                    break;
                }
            }
            System.out.printf("Case %d: %d\n", t++, c);
        }
    }
}
/*
1 10
1 20
123 456789
 */
