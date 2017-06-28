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
public class Main11172 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int casos=sc.nextInt();
        for (int i = 0; i < 10; i++) 
            {
            long a=sc.nextLong(),b=sc.nextLong();
            if(a>b)
                System.out.println(">");
            else if(a<b)
                System.out.println("<");
            else
                System.out.println("=");
            }
    }
}
