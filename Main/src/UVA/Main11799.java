/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author jojstepersan
 */
public class Main11799 {
    public static void main(String[] args) throws IOException {  
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        int casos=Integer.valueOf(in.readLine());
        for (int i = 0; i < casos; i++)
            {
            StringTokenizer st=new StringTokenizer(in.readLine());
            int aux=0;
            while(st.hasMoreTokens())
                aux=Math.max(aux, Integer.valueOf(st.nextToken()));
            System.out.println("Case "+(i+1)+": "+aux);    
            }
    }
}
