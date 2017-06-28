/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author jojstepersan
 */
public class Main11727 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int casos=sc.nextInt();
        for (int i = 0; i < casos; i++)
            {
            int[] p=new int[3];
            for (int j = 0; j < 3; j++) 
                p[j]=sc.nextInt();
            Arrays.sort(p);
            System.out.println("Case "+(i+1)+": "+p[1]);
            }
    }
}
