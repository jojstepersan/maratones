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
 * @author jojstepersan 10918
 */
public class Main10918 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static int[] dpF = new int[50];
    static int[] dpG = new int[50];

    public static void main(String[] args) throws Exception {
        String s;
        init();
        while (!(s = in.readLine()).equals("-1")) {
            int n = Integer.valueOf(s);
            System.out.println(F(n));
        }
    }

    static void init() {
        for (int i = 0; i < dpF.length; i++) {
            dpF[i] = dpG[i] = -1;

        }
    }

    static int F(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 0;
        }
        if (dpF[n] != -1) {
            return dpF[n];
        }
        return dpF[n] = F(n - 2) + 2 * G(n - 1);
    }

    static int G(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (dpG[n] != -1) {
            return dpG[n];
        }
        return dpG[n] = F(n - 1) + G(n - 2);
    }
}
