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
public class Main12577 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int c=1;
        while(!str.equals("*"))
            {
            if(str.equals("Hajj"))
                System.out.println("Case "+(c++)+": Hajj-e-Akbar");
            else
                System.out.println("Case "+(c++)+": Hajj-e-Asghar");
            str=sc.next();
            }
    }
}
