/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.util.Scanner;

/**
 *
 * @author jojstepersan
 */
public class Main11044 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int casos=sc.nextInt();
        for (int i = 0; i < casos; i++)
            {
            int n=sc.nextInt(),m=sc.nextInt();
            n -= 2; m -=2;
            System.out.println((n / 3 + ((n % 3 != 0) ? 1 : 0)) * (m / 3 + ((m % 3 != 0) ? 1 : 0)));
            }
        
    }
}
