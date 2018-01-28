/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 2694	Problem with the Calculator
 * @author jojstepersan
 */
public class Main2694 {
    
    public static void main(String[] args)throws Exception {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int cases;
        cases=Integer.valueOf(in.readLine());
        for (int i = 0; i < cases; i++) {
            String word=in.readLine();
            System.out.println(solve(word));
        }
    }
    
    public static long solve(String s)
        {
        long sum=0;
        String str="";
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            //System.out.println(c);
            if(c>=48&&c<=57)
                {
                str+=c+"";
                }
            else
                {
                //System.out.println(str);    
                
                if(!str.equals(""))try{
                sum+=Long.valueOf(str);
                }catch(Exception e){}    
                str="";
                }
            }
        try{
                sum+=Long.valueOf(str);
                }catch(Exception e){}    
                
        return sum;
        }
   
}
// 48 -57