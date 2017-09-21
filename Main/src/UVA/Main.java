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
 * 
 */

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=in.readLine())!=null)
            {
            StringTokenizer st=new StringTokenizer(s);
            long n,u,l;
            n=Long.valueOf(st.nextToken());
            l=Long.valueOf(st.nextToken());
            u=Long.valueOf(st.nextToken());
            int max=0,index=0;
             System.out.println(n+" "+Integer.toBinaryString((int)n));
            for (int i = (int)l; i <=u; i++)
                {
                int aux=(int)n|i;
                if(aux>max){
                    max=aux;
                    index=i;
                }
                System.out.println(i+" "+Integer.toBinaryString(i)+" "+(n|i));
                }
                System.out.println(index);
            }
    }
  
}
