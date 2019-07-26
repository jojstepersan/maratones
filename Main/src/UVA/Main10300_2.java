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
 *10300 - Ecological Premium
 * @author jojstepersan
 */
public class Main10300_2 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] argsth) throws Exception {
        int t = Integer.valueOf(in.readLine());
        for (int i = 0; i < t; i++) {
            int f = Integer.valueOf(in.readLine());
            int result = 0;
            for (int j = 0; j < f; j++) {

                st = new StringTokenizer(in.readLine());
                int m, n, g;
                m = Integer.valueOf(st.nextToken());
                n = Integer.valueOf(st.nextToken());
                g = Integer.valueOf(st.nextToken());

                result += m  * g;

            }
            System.out.println(result);
        }
    }
}
