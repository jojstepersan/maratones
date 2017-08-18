/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author jojstepersan
 */
public class Main12289 {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new  BufferedReader(new InputStreamReader(System.in));
        int casos=Integer.valueOf(in.readLine());
        for (int i = 0; i < casos; i++) {
            String s=in.readLine();
            int o=0,t=0;
            if(s.length()==3)
                {
                if(s.charAt(0)=='o')
                    o++;
                if(s.charAt(1)=='n')
                    o++;
                
                if(s.charAt(2)=='e')
                    o++;
                if(s.charAt(0)=='t')
                    t++;
                if(s.charAt(1)=='w')
                    t++;
                if(s.charAt(2)=='o')
                    t++;
                if(o>t)
                    System.out.println("1");
                else
                    System.out.println("2");
                }
            else
                System.out.println("3");
            
        }
    }
}
