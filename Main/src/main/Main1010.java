/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Stiven
 */
public class Main1010{
    
    Scanner sc=new  Scanner(System.in);
    
    public void read()
        {
            
        int a,b,c,d;
        double e,f;
        a=sc.nextInt();
        b=sc.nextInt();
        e=sc.nextDouble();
        c=sc.nextInt();
        d=sc.nextInt();
        f=sc.nextDouble();
        System.out.print("VALOR A PAGAR: R$ ");
        System.out.printf("%.2f",b*e+d*f); 
            System.out.println("");
        }
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Main1010 m=new Main1010();
        m.read();
    }
}
