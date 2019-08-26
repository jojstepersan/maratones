/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 *
 * @author jojstepersan 10669 - Three powers
 */
public class Main10669 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static BigInteger[] P = new BigInteger[70];

    public static void main(String[] args) throws Exception {
        String s;
        P[0] = BigInteger.ONE;
        for (int i = 1; i < 70; i++) {
            P[i] = P[i - 1].multiply(BigInteger.valueOf(3));
        }
        while (!(s = in.readLine()).equals("0")) {
            long n = Long.valueOf(s);
            n--;
            System.out.print("{");
            boolean f=false;
            for (int i = 0; n != 0; i++, n >>= 1) {
                if ((n & 1) == 1) {
                    if(f)System.out.print(",");
                    f=true;
                    System.out.print(" "+P[i]);
                }
            }
            System.out.println(" }");
        }
    }

}

