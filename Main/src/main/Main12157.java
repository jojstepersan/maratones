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
public class Main12157 {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int casos=Integer.valueOf(in.readLine());
        for (int i = 0; i < casos; i++)
            {
            int llamadas=Integer.valueOf(in.readLine());
            StringTokenizer st=new StringTokenizer(in.readLine());
            int mile=0,juice=0;
            while(st.hasMoreTokens())
                {
                int llamada=Integer.valueOf(st.nextToken());
                int llamadaj=llamada;
//                System.out.println(llamada);
//                System.out.println(llamadaj);
                while(llamada>=0)
                    {
                    mile+=10;
                    llamada-=30;
                    }
                while(llamadaj>=0)
                    {
                    juice+=15;
                    llamadaj-=60;
                    }
                }
            System.out.print("Case "+(i+1)+": ");
            if(mile<juice)
                System.out.println("Mile "+mile);
            else if(mile>juice)
                System.out.println("Juice "+juice);
            else if(mile==juice)
                System.out.println("Mile Juice "+mile); 
            //System.out.println("mile "+mile+" juice "+juice);
            }
    }
}
