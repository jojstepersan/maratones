/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author stiven
 * 10324 - Zeros and Ones
 */
public class Main10324 {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String string;
        int x=1;
        while((string=in.readLine())!=null)
            {
            int consultas=Integer.valueOf(in.readLine());
            System.out.println("Case "+(x++)+":");
            for (int i = 0; i < consultas; i++)
                {
                String[] query=in.readLine().split(" ");
                int max,min;
                max=Math.max(Integer.valueOf(query[0]), Integer.valueOf(query[1]));
                min=Math.min(Integer.valueOf(query[0]), Integer.valueOf(query[1]));
                String sub=string.substring(min,max+1);
                //    System.out.println(sub);
                System.out.println(igual(sub)?"Yes":"No");
                }
            }
    }
 public static boolean  igual(String s)
    {
    for (int i = 0; i < s.length()-1; i++)
        if(s.charAt(i)!=s.charAt(i+1))
            return false;
    return true;
    }
}
