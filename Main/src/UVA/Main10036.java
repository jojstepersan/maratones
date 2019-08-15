/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 *
 * @author jojstepersan
 * 10036	Divisibility
 */
public class Main10036 {

   static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        int t = Integer.valueOf(in.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(in.readLine());
            int n, k;
            boolean divisible = false;
            n = Integer.valueOf(st.nextToken());
            k = Integer.valueOf(st.nextToken());
            st = new StringTokenizer(in.readLine());
            int[] seq = new int[n];
            for (int j = 0; j < n; j++) {
                seq[j] = Integer.valueOf(st.nextToken());
            }
             for (int j = 0; j < 1<<(n-1); j++) {
                int result = 0;
                for (int l = 0; l < n; l++) {
                    result+= (j >> l & 1) == 1? seq[l]:-seq[l];                    
                }
                if (result % k == 0) {
                    out.println("Divisible");
                    divisible = true;
                    break;
                }
            }
            if (!divisible) {
                out.println("Not divisible");
            }
        }
        out.close();
    }

}