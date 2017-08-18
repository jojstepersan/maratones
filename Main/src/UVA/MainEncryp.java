/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Stiven
 */
public class MainEncryp {
    
    
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc=new Scanner(System.in);
        char h=('.'-1);
        System.out.println(h);
       int a,b;
       a=sc.nextInt();
       b=sc.nextInt();
       double c,d;
       c=sc.nextDouble();
       d=c*b;
       System.out.println("NUMBER = "+a);
       System.out.print("SALARY = U$ ");
        System.out.printf("%.2f",d); 
       System.out.println("");
    }
}
