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
 */
public class Main11942 {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int casos=Integer.valueOf(in.readLine());
        System.out.println("Lumberjacks:");
        for (int i = 0; i < casos; i++)
            {
            boolean flag1=true,flag2=true;
            StringTokenizer st=new StringTokenizer(in.readLine());
            int aux=Integer.valueOf(st.nextToken());
            for (int j = 1; j < 10; j++) 
                {
                int x=Integer.valueOf(st.nextToken());    
                if(aux>x)
                    flag1=false;
                if(aux<x)
                    flag2=false;
                aux=x;
                }
            if(flag1||flag2)
                System.out.println("Ordered");
            else
                System.out.println("Unordered");
            }
    }
}
