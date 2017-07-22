/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author jojstepersan
 */
public class Main12468 {
    public static void main(String[] args) throws IOException {
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(in.readLine());
        int x,y,min,max;
        x=Integer.valueOf(st.nextToken());
        y=Integer.valueOf(st.nextToken());
        min=Math.min(x,y);
        max=Math.max(x, y);
        while(x>=0&&y>=0)
            {
            int up,down;
            up=max-min;
            down=100-max+min;
            if(up<down)
                System.out.println(up);
            else if(up>down)
                System.out.println(down);
            else if(x==y)
                System.out.println(0);
            st=new StringTokenizer(in.readLine());
            x=Integer.valueOf(st.nextToken());
            y=Integer.valueOf(st.nextToken());
            min=Math.min(x,y);
            max=Math.max(x,y);
            }
    }
}
