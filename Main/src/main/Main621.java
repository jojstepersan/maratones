/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main621 {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int casos=Integer.valueOf(in.readLine());
        for (int i = 0; i < casos; i++) 
            {
            String str=in.readLine();
            if(str.equals("1")||str.equals("4")||str.equals("78"))
                System.out.println("+");
            else if(str.charAt(str.length()-2)=='3'&&str.charAt(str.length()-1)=='5')
                System.out.println("-");
            else if(str.charAt(0)=='9'&&str.charAt(str.length()-1)=='4')
                System.out.println("*");
            else
                System.out.println("?");
            }
    }
}
