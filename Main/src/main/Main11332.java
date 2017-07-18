/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author jojstepersan
 */
public class Main11332 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long x=sc.nextLong();
        while(x!=0)
            {
            System.out.println(sum(sum(sum(x))));
            x=sc.nextLong();
            }
    }
    
    public static long sum(long x)
        {
        long c=0;
        while(x>0)
            {
            c+=x%10;
            x/=10;
            }
        return c;
        }
}
