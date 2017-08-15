/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class MainNOTerminado_The_Last_Non_zero_Digit {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=in.readLine())!=null)
            {
            StringTokenizer st=new StringTokenizer(s);
            facto(Long.valueOf(st.nextToken()),Long.valueOf(st.nextToken()));
            }
    }
    
    public static void facto(long x,long y)
        {
        BigInteger f=new BigInteger("1");
        for (long i = x; i>= x-y+1; i--)
            {
            f=f.multiply(BigInteger.valueOf(i));
            while(f.mod(BigInteger.valueOf(10)).equals(BigInteger.valueOf(0)))
                f=f.divide(BigInteger.valueOf(10));
            f=f.mod(new BigInteger("100000000"));
            }
        System.out.println(f.mod(BigInteger.valueOf(10))); 
        }
    
}
