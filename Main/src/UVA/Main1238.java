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
 * @author jojstepersan
 */
public class Main1238{
    
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    
    public void read()
        {
        try {
            int casos=Integer.parseInt(in.readLine());
            for(int i=0;i<casos;i++)
                System.out.println(solve(in.readLine()));
        } catch (IOException ex) {
        
        }
        
        }
    
    public static String solve(String string)
        {
        String ans="";
        String[] str=string.split(" ");
        int l=Math.min(str[0].length(), str[1].length());
       for(int i=0;i<l;i++)
            ans+=str[0].charAt(i)+""+str[1].charAt(i);
        if(l==str[0].length())
            ans+=str[1].substring(l, str[1].length());
        else
            ans+=str[0].substring(l, str[0].length());
        return ans;
        }
    
    public static void main(String[] args) {
       Main1238 m=new Main1238();
       m.read();
       
    }
}
