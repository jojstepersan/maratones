/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 *
 * @author Usuario
 * 10106 - Product
 */
public class Main10106 {
    
    public static void main(String[] args)throws  Exception   {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=in.readLine())!=null){
            BigInteger x,y;
            x=new BigInteger(s);            
            y=new BigInteger(in.readLine());
            System.out.println(x.multiply(y));            
        }
    }
    
}
