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
 * @author jojstepersan 1185 - Big Number
 */
public class Main1185 {

    static int MAX = 10000000 + 5;
    static int DP[] = new int[MAX];

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {

        double last = 0;
	for(int i = 1; i <= 10000000; i++) {
            last += Math.log10(i);
            DP[i] = (int)last;
	}
        int x=Integer.valueOf(in.readLine().trim());
        for (int i = 0; i <x; i++) {
            int n=Integer.valueOf(in.readLine().trim());   
            System.out.println(DP[n]+1);
        }
    
    }

}
