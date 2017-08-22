/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author stiven
 */

public class Main2157 {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int casos=Integer.valueOf(in.readLine());
        for (int i = 0; i < casos; i++)
            {
            StringTokenizer st=new StringTokenizer(in.readLine());
            int x=Integer.valueOf(st.nextToken());
            int y=Integer.valueOf(st.nextToken());
            String st1="",st2="";
            for (int j = x; j <= y; j++)     
                {  
                st1+=j;
                String index=j+"";
                st2=reverse(index)+st2;
                }    
            System.out.println(st1+st2);
    
            }
    }
    public static String reverse(String palabra) {
        if (palabra.length() == 1)
            return palabra;
        else 
            return reverse(palabra.substring(1)) + palabra.charAt(0);
}

    
}
