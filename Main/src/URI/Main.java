/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author jojstepersan
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(in.readLine());
        long a,b,c,d;
        a=Long.parseLong(st.nextToken());
        b=Long.parseLong(st.nextToken());
        c=Long.parseLong(st.nextToken());
        d=Long.parseLong(st.nextToken());
        long sum1,sum2,sum3,suma,sumb,sumc;
        sum1=a+b; suma=c+d;
        sum2=a+c; sumb=b+d;
        sum3=a+d; sumc=b+c;
        long min=Long.MAX_VALUE;
        min=Math.min(min,Math.abs(sum1-suma));
        min=Math.min(min,Math.abs(sum2-sumb));
        min=Math.min(min,Math.abs(sum3-sumc));
        System.out.println(min);
    
    }
}
