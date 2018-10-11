package maraton.argentina;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jojstepersan
 */
public class MainD {
    static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args)throws Exception {
        StringTokenizer st=new StringTokenizer(in.readLine());
        int n,m;
        n=Integer.valueOf(st.nextToken());
        m=Integer.valueOf(st.nextToken());
        System.out.printf("%.1f\n",(n+m-1)/2.f);
    }
}
