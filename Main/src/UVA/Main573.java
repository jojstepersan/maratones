/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author ingenieria
 * 573	The Snail
 */
public class Main573 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        String s;
        while(!(s=in.readLine()).equals("0 0 0 0"))
            {
            StringTokenizer st=new StringTokenizer(s);
            int h,d,day=1;
            double f,al=0,u;
            h=Integer.valueOf(st.nextToken());
            u=Double.valueOf(st.nextToken());
            d=Integer.valueOf(st.nextToken());
            f=Double.valueOf(st.nextToken());
            f=u*f/100;
            if(h==0)
                break;
            while(true)
                {
                al+=u;
                if(u>0)
                    u-=f;
                if(al>h)
                    break;
                al-=d;
                if(al<0)
                    break;
                day++;     
                }
            if(al<0)
                System.out.printf("failure on day %d\n",day);
            else
                System.out.printf("success on day %d\n",day);
            }
    }
    
}

/**
 6 3 1 10
10 2 1 50
50 5 3 14
50 6 4 1
50 6 3 1
1 1 1 1
0 0 0 0
success on day 3
failure on day 4
failure on day 7
failure on day 68
success on day 20
failure on day 2
 */