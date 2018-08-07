/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *word
 * @author jojstepersan
 */
public class Mainword {
    public static void main(String[] args) throws Exception{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String  palabra=in.readLine();
        int M=0,m=0;
        for (int i = 0; i < palabra.length(); i++) {
            char c=palabra.charAt(i);
            if(c>=97&&c<=122)
                m++;
            else
                M++;
        }
        System.out.println(m>=M?palabra.toLowerCase():palabra.toUpperCase());
        
    }
}
