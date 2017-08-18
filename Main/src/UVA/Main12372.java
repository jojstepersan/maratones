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
public class Main12372 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int casos=sc.nextInt();
        int c=1;
        for (int i = 0; i < casos; i++) {
            int l,w,h;
            l=sc.nextInt();
            w=sc.nextInt();
            h=sc.nextInt();
            if(l<=20&&w<=20&&h<=20)
                System.out.println("Case "+(c++)+": good");
            else
                System.out.println("Case "+(c++)+": bad");
        }
 
    }
}
