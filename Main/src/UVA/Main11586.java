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
 * @author stiven
 * 11586 - Train Tracks
 */
public class Main11586 {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new  BufferedReader(new InputStreamReader(System.in));
        int casos=Integer.valueOf(in.readLine());
        for (int i = 0; i < casos; i++) {
            String trains=in.readLine();
            int f=0,m=0;
            for (int j = 0; j < trains.length(); j++) {
                char c=trains.charAt(j);
                if(c=='M')
                    m++;
                else if(c=='F')
                    f++;
            }
            if(f==m&&f>1)
                System.out.println("LOOP");
            else
                System.out.println("NO LOOP");
        }
    }
   
}
