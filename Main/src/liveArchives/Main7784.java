/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liveArchives;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 7784 - FBI Universal Control Numbers
 * @author jojstepersan
 */
public class Main7784 {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        //System.out.println(" max: "+Long.MAX_VALUE);
        int casos=Integer.parseInt(in.readLine());
        for (int i = 0; i < casos; i++) {
            StringTokenizer st=new StringTokenizer(in.readLine());
            st.nextToken();
            System.out.print((i+1)+" ");
            solve(st.nextToken());
            }
       
        
    }
    public static void solve(String s)
        {
        int sum=0;
        sum+=2*baseValue(map(s.charAt(0)));
        sum+=4*baseValue(map(s.charAt(1)));
        sum+=5*baseValue(map(s.charAt(2)));
        sum+=7*baseValue(map(s.charAt(3)));
        sum+=8*baseValue(map(s.charAt(4)));
        sum+=10*baseValue(map(s.charAt(5)));
        sum+=11*baseValue(map(s.charAt(6)));
        sum+=13*baseValue(map(s.charAt(7)));
        if(sum%27==baseValue(map(s.charAt(8)))){
        long s2=0;
        for (int i = 0; i < 8; i++) {
            s2+=Math.pow(27, 7-i)*baseValue(map(s.charAt(i)));        
            }
            System.out.println(s2);
        }
        else
                System.out.println("Invalid");
       // System.out.println(Integer.parseInt((String) s.subSequence(0, s.length()-1),27));
        }
    
    public static int baseValue(char c)
        {
        switch (c) {
            case '0':return 0;  
            case '1':return 1;  
            case '2':return 2;  
            case '3':return 3;  
            case '4':return 4;  
            case '5':return 5;  
            case '6':return 6;  
            case '7':return 7;  
            case '8':return 8;  
            case '9':return 9;  
            case 'A':return 10;  
            case 'C':return 11;  
            case 'D':return 12;  
            case 'E':return 13;  
            case 'F':return 14;  
            case 'H':return 15;  
            case 'J':return 16;  
            case 'K':return 17;  
            case 'L':return 18;  
            case 'M':return 19;  
            case 'N':return 20;  
            case 'P':return 21;  
            case 'R':return 22;  
            case 'T':return 23;  
            case 'V':return 24;  
            case 'W':return 25;  
            case 'X':return 26;  
            default:
                    return 0;
        }
        }
    
    public static  char map(char c)
        {
        switch (c) {
            case 'B':return '8';
            case 'G':return 'C';
            case 'I':return '1';
            case 'Q':return '0';
            case 'O':return '0';
            case 'S':return '5';
            case 'U':return 'V';
            case 'Y':return 'V';
            case 'Z':return '2';
            default:return c;
            }
        }
}
