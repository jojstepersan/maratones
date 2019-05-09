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
 * 12455 - Bars
 *
 * @author jojstepersan
 */
public class Main12455 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        int t = Integer.valueOf(in.readLine());
        for (int i = 0; i < t; i++) {
            int b = Integer.valueOf(in.readLine());
            int p = Integer.valueOf(in.readLine());
            int bars[] = new int[p];
            st = new StringTokenizer(in.readLine());
            int x = 0;
            boolean possible = false;
            while (st.hasMoreTokens()) {
                bars[x++] = Integer.valueOf(st.nextToken());
            }
            for (int j = 0; j < Math.pow(2, p); j++) {
                String bin = Integer.toBinaryString(j);
                int sum = 0;
                for (int k = 0; k < p; k++) {
                    //if (bin.charAt(bin.length()-k-1) == '1') {
                        if ((j >> k & 1) == 1) {
                        sum += bars[k];
                    }
                }
                possible = (sum == b);
                if (possible) {
                    break;
                }
            }
            System.out.println(possible ? "YES" : "NO");

        }

    }

}