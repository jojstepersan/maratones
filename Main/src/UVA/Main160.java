/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 *
 * @author jojstepersan 160 - Factors and Factorials
 */
public class Main160 {

    static BigInteger memo[] = new BigInteger[101];
    static int primos[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
    static int con[];

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (!(s = in.readLine()).equals("0")) {
            int n = Integer.valueOf(s);
            con = new int[primos.length];
            BigInteger facto = factorial(n);
            System.out.printf("%3d! =", n);
            descomponer(facto);
        }
    }

    public static void descomponer(BigInteger n) {
        int i = 0;
        while (!n.equals(BigInteger.ONE)) {
            if (n.mod(BigInteger.valueOf(primos[i])).equals(BigInteger.ZERO)) {
                n = n.divide(BigInteger.valueOf(primos[i]));
                con[i]++;
            } else {
                i++;
            }
        }
        int c = 0;
        for (int j = 0; j < con.length; j++) {
            if (con[j] == 0) {
                break;
            }
            if (c >= 15) {
                System.out.printf("\n%9d", con[j]);
                c = 0;
            } else {
                System.out.printf("%3d", con[j]);
                c++;
            }
        }
        System.out.println("");
    }

    public static BigInteger factorial(int n) {
        if (n == 0) {
            return BigInteger.ONE;
        } else {
            if (memo[n] == null) {
                memo[n] = BigInteger.valueOf(n).multiply(factorial(n - 1));
            }
            return memo[n];
        }
    }

}
