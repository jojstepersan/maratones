/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int n;
        long dp[] = new long[1000000 + 1];
        while ((n = Integer.valueOf(in.readLine())) >= 3) {
            long triangulos = 0;
            if (dp[n] > 0) {
                System.out.println(dp[n]);
            } else {
                for (int i = 1; i <= n - 2; i++) {
                    for (int j = i + 1; j <= n - 1; j++) {
                        for (int k = j + 1; k <= n; k++) {
                            if ((i + j > k) && (i + k) > j && (j + k) > i) {
                                triangulos++;
                                //System.out.println(i + " " + j + " " + k);                            
                            }
                        }
                    }
                }
                System.out.println(triangulos);
                dp[n]=triangulos;
            }

        }
    }
}
