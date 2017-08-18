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
public class Main12279 {
    public static void main(String[] args) {
        int c=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0)
            {
            int cnt=0;    
            for (int i = 0; i < n; i++) 
                {
                int num=sc.nextInt();
                if(num!=0)
                    cnt++;
                else
                    cnt--;
                }
            System.out.println("Case "+(c++)+": "+cnt);
            n=sc.nextInt();
            }
    }
}
