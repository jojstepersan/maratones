/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liveArchives;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 5499 - Just the Facts
 * @author jojstepersan
 */
public class Main5499 {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=in.readLine())!=null)
            {
            int n=Integer.parseInt(s);
            int f=(facto(n));
            if(n<10)
                System.out.println("    "+n+" -> "+f);
            else if(n<100)
                System.out.println("   "+n+" -> "+f);
            else if(n<1000)
                System.out.println("  "+n+" -> "+f);
            else
                System.out.println(" "+n+" -> "+f);
            }
    }
    
    public static int facto(int n)
        {
        long fact=1;
        for (int i = 2; i <= n; i++) 
            {
            fact*=i;
            fact=fact%1000000000;
            while(fact%10==0)
                fact/=10;
            }
        return (int)fact%10;
        }
}
