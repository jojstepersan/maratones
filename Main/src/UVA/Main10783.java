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
 * uva-10783
 */
public class Main10783 {
    
    static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args)throws Exception {
        int t=Integer.valueOf(in.readLine());
        for (int i = 0; i < t; i++) {
            int x,y;
            x=Integer.valueOf(in.readLine());
            y=Integer.valueOf(in.readLine());
            int max, min;
            max=Math.max(x, y);
            min=Math.min(x, y);
            int result=0;
            for (int j = min; j <=max ; j++) {
                if(j%2!=0){
                    result+=j;
                }
                
            }
            System.out.printf("Case %d: %d\n",i+1,result);
        }
    }
}
