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
public class Main11547 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int casos=sc.nextInt();
        for (int i = 0; i < casos; i++)
            {
            long l=(sc.nextInt()*567/9+7492)*235/47-498;
            l/=10;
            l=l%10;
            System.out.println(l>0?l:l*-1);
            }
    }
}
