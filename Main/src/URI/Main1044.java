/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * uri 	1044	Multiples
 * @author jojstepersan
 */
public class Main1044 {
    public static void main(String[] args) throws Exception{
        BufferedReader in=new  BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(in.readLine());
        long a,b;
        a=Long.valueOf(st.nextToken());
        b=Long.valueOf(st.nextToken());
        if(a%b==0 || b%a==0)
            System.out.println("Sao Multiplos");
        else
            System.out.println("Nao sao Multiplos");
    }
}
