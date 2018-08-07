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
public class biscuits {
    public static void main(String[] args)throws Exception {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int lados=Integer.valueOf(in.readLine());
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < lados; i++)
            {
            StringTokenizer st=new StringTokenizer(in.readLine());
            int x,y;
            x=Integer.valueOf(st.nextToken());
            y=Integer.valueOf(st.nextToken());
            if(lados<=4)
                {
                min=Math.min(min,Math.abs(x-y));
                }
            else
                {
                
                }
            }
    }
}
