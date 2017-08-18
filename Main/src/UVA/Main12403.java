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
public class Main12403 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int casos =sc.nextInt();
        long sum=0;
        for (int i = 0; i < casos; i++) 
            {
            String str=sc.next();
            if(str.equals("donate"))
                sum+=sc.nextLong();
            else
                System.out.println(sum);
            }
    }
}
