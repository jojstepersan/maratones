/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author jojstepersan
 */
public class janitor {
    
    static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    static  StringTokenizer st;
    
    public static void main(String[] args)throws Exception {
        st=new StringTokenizer(in.readLine());
        double a,b,c,d;
        a=Double.valueOf(st.nextToken());
        b=Double.valueOf(st.nextToken());
        c=Double.valueOf(st.nextToken());
        d=Double.valueOf(st.nextToken());
        System.out.println(maxArea(a, b, c, d));
        
    }
    
    static double maxArea(double a, double b, 
                           double c, double d) 
    { 
        // Calculating the semi-perimeter  
        // of the given quadilateral 
        double semiperimeter = (a + b + c + d) / 2; 
      
        // Applying Brahmagupta's formula to 
        // get maximum area of quadrilateral 
        return Math.sqrt((semiperimeter - a) * 
                         (semiperimeter - b) *  
                         (semiperimeter - c) *  
                         (semiperimeter - d)); 
    } 
}
