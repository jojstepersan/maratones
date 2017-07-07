/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author jojstepersan
 * 10300 - Ecological Premium
 */
public class Main10300 {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new  BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int cases=Integer.parseInt(in.readLine());
        for (int i = 0; i < cases; i++)
            {
            long cnt=0;
            int farmers=Integer.parseInt(in.readLine());
            for (int j = 0; j < farmers; j++) 
                {
                long aux=1;    
                st=new StringTokenizer(in.readLine());
                aux*=Long.parseLong(st.nextToken());
                st.nextToken();
                aux*=Long.parseLong(st.nextToken());
                cnt+=aux;
                }
            System.out.println(cnt);
            }
    }
}
