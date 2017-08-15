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
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int casos=Integer.valueOf(in.readLine());
        String[] friends=new String[casos];
        int money[]=new int[casos];
        friends=in.readLine().split(" ");
        for (int i = 0; i < casos; i++)
            {
            StringTokenizer st=new StringTokenizer(in.readLine());
            st.nextToken();
            money[i]=Integer.valueOf(st.nextToken());
            int hm=Integer.valueOf(st.nextToken());
            money[i]=-money[i]/hm;
            for (int j = 0; j < hm; j++)
                {
                    
                }
            }
    }
}
