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
public class Main1038 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int pro=sc.nextInt();
        double can=sc.nextDouble();
        switch (pro) 
            {
            case 1:System.out.print("Total: R$ ");
                    System.out.printf("%.2f",can*4.00);
                break;
            case 2:System.out.print("Total: R$ ");
                    System.out.printf("%.2f",can*4.50);
                break;
            case 3:System.out.print("Total: R$ ");
                    System.out.printf("%.2f",can*5.00);
                break;
            case 4:System.out.print("Total: R$ ");
                    System.out.printf("%.2f",can*2.00);
                break;
            case 5:System.out.print("Total: R$ ");
                    System.out.printf("%.2f",can*1.50);
                break;
 
            default:
                throw new AssertionError();
        }
        System.out.println("");
    }
}
