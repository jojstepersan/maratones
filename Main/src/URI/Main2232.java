/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author stiven
 */
public class Main2232 {

    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int casos=Integer.valueOf(in.readLine());
        for (int i = 0; i < casos; i++) 
            {
            int x= Integer.valueOf(in.readLine());    
            if(x!=31)
                System.out.println((int)Math.pow(2,x)-1);
            else
                    System.out.println((int)Math.pow(2,x));
            }
    }
    
}

