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
public class Main12250 {
    public static void main(String[] args) throws IOException {
        String[] s={"HELLO","HOLA","HALLO","BONJOUR","CIAO","ZDRAVSTVUJTE"};
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String str=in.readLine();
        int i=1;
        while(!str.equals("#"))
            {

            if(str.equals("HELLO"))
                System.out.println("Case "+(i++)+": ENGLISH");
            else if(str.equals("HOLA"))
                System.out.println("Case "+(i++)+": SPANISH");
            else if(str.equals("HALLO"))
                System.out.println("Case "+(i++)+": GERMAN");
            else if(str.equals("BONJOUR"))
                System.out.println("Case "+(i++)+": FRENCH");
            else if(str.equals("CIAO"))
                System.out.println("Case "+(i++)+": ITALIAN");
            else if(str.equals("ZDRAVSTVUJTE"))
                System.out.println("Case "+(i++)+": RUSSIAN");
            else
                System.out.println("Case "+(i++)+": UNKNOWN");  
            str=in.readLine();
            }
    }
}
