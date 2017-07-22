/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jojstepersan
 */
public class Main12503 {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int casos=Integer.valueOf(in.readLine());
        for (int i = 0; i < casos; i++)
            {
            int c=0;    
            int ins=Integer.valueOf(in.readLine());
            String[] arr=new String[ins];
            for (int j = 0; j < ins; j++)                            
                arr[j]=in.readLine();
            int j=0; 
            String s=arr[j];
            while(j<ins)
                {
                //System.out.println(s+" "+c+" "+j);    
                if(s.equals("LEFT"))
                    {
                    c--;
                    j++;
                    try
                        {
                        s=arr[j];
                        }catch(Exception e)
                        {}
                    }
                else if(s.equals("RIGHT"))
                    {
                    c++;
                    j++;
                    try
                        {
                        s=arr[j];
                        }catch(Exception e)
                        {}
                    }
                else 
                    {
                    String s2[]=s.split(" ");
                    s=arr[Integer.valueOf(s2[2])-1];
                    }
                
                }
            System.out.println(c);
            }
    }
}
