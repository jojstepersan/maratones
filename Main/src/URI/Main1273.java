/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jojstepersan
 * uri 1273	Justifier
 */
public class Main1273 {
    
    static  int maxL=0;
    public static void main(String[] args)throws Exception {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String  s;
        boolean f=false;
        while(!(s=in.readLine()).equals("0")){
            if(f){
                System.out.println("");
            }
            maxL=0;
            f=true;
            int t=Integer.valueOf(s);
            List<String> l=new ArrayList<>();
            for (int i = 0; i < t; i++) {
                String line=in.readLine().trim();               
                maxL=Math.max(maxL, line.length());
                l.add(line);
            }
            l.forEach(w->solve(w));    
        }
    
    }
    
    static  void solve(String s){
        for (int i = 0; i < maxL-s.length(); i++) {
            System.out.print(" ");
        }
        System.out.println(s);
    }
    
    
    
    
}
