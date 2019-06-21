/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Jojstepersan
 * codeforce 996A
 */
public class Main996A {
    
    static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    static int MAXW;
    static int prices[]={1,5,10,20,100};
    static int bills=0;
    
    public static void main(String[] args)throws Exception {
        MAXW=Integer.valueOf(in.readLine());
        int i=prices.length-1;
        while(MAXW>0){
            bills+=MAXW/prices[i];
            MAXW=MAXW%prices[i];
            i--;
        }
        System.out.println(bills);
    }
    
}
