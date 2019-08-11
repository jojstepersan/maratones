/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author jojstepersan
 * 579A - Raising Bacteria
 */
public class Main597A {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        int n = Integer.valueOf(in.readLine());
        int sol = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                sol+=1;
            }
            n/=2;
        }
        System.out.println(sol);
    }
}
