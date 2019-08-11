
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPC.R19_08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author jojstepersan
 */
public class window {
    static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    static  StringTokenizer st;
    
    public static void main(String[] args)throws Exception {
        st=new StringTokenizer(in.readLine());
        int x,y,w;
        x=Integer.valueOf(st.nextToken());
        y=Integer.valueOf(st.nextToken());
        w=Integer.valueOf(st.nextToken());
        int X=(x-2*w);
        int Y=(y-2*w);
        System.out.println(X>0&& Y>0?Y*X:0);
    }
    
}
