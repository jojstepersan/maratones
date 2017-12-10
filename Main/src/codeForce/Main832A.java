package codeForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 832A - Sasha and Sticks
 * @author jojstepersan
 */
public class Main832A {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s=in.readLine();
        StringTokenizer st=new StringTokenizer(s);
        long n,k;
        n=Long.valueOf(st.nextToken());
        k=Long.valueOf(st.nextToken());
        if((n/k)%2==0)
            System.out.println("NO");
        else System.out.println("YES");
        
    }
    
}
