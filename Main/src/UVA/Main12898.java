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
 * 12898 - And Or
 */
public class Main12898 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws Exception {
        int t = Integer.valueOf(in.readLine());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(in.readLine());
            int A, B;
            A = Integer.valueOf(st.nextToken());
            B = Integer.valueOf(st.nextToken());
            if (A == B) {
                System.out.printf("Case %d: %d %d\n", i + 1, A | B, A & B);
            } else {
                long or = A, and = A;
                int j = 0;
                while (A + j != B) {
                    or |= (A + j);
                    and &= (A + j);
                    j++;
                }
                or |= B;
                and &= B;

                System.out.printf("Case %d: %d %d\n", i + 1, or, and);

            }

        }
    }

}