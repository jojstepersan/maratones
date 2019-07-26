/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Usuario
 */
public class Main10018 {
    
    static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args)throws Exception {
        int t=Integer.valueOf(in.readLine().trim());       
        for (int i = 0; i < t; i++) {
            int itr=1;
            long n=Long.valueOf(in.readLine().trim());
            long result=sumReverse(n);
            while(!isPalindrome(String.valueOf(result))){
                result=sumReverse(result);
                itr++;
            }
            System.out.println(itr+" "+result);
        }
    }
    
    
    static long sumReverse(long n){
        StringBuilder sb=new StringBuilder(String.valueOf(n));
        return n+Integer.valueOf(sb.reverse().toString());
        
    }
    
    static boolean isPalindrome(String s){
        boolean isPalindrome=true;
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                isPalindrome=false;
                break;
            }
        }
        return isPalindrome;
    }

}
