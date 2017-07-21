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
public class Main12015 {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int casos=Integer.valueOf(in.readLine());
        for (int i = 0; i < casos; i++) 
            {
            String aux="";
            int r=0;
            System.out.println("Case #"+(i+1)+":");
            for (int j = 0; j < 10; j++)
                {
                StringTokenizer st=new StringTokenizer(in.readLine());
                String s=st.nextToken();
                int v=Integer.valueOf(st.nextToken());
                if(v>r)
                    {
                    r=v;
                    aux=s;
                    }
                else if(v==r)
                    aux+="\n"+s;
                }
            System.out.println(aux);
            }
    }
}
