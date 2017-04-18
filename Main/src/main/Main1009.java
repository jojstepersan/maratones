/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Locale;
import java.util.Scanner;


public class Main1009 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Locale.setDefault(Locale.US);
        String name=sc.nextLine();
        Double sueldo=sc.nextDouble();
        Double ventas=sc.nextDouble();
        System.out.print("TOTAL = R$ ");
        System.out.printf("%.2f",sueldo+ventas*0.15);
        System.out.println("");
    }
    
}
