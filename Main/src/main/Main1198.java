/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Stiven
 */
public class Main1198 {
        public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext())
        {
        long a=sc.nextLong();
        long t=sc.nextLong();
        if(t>a)
            System.out.println(t-a);
        else
            System.out.println(a-t);
        }
    }
}
