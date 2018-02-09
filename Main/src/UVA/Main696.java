/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *696	How Many Knights
 * @author jojstepersan
 */
public class Main696 {
    public static void main(String[] args)throws Exception {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String  s;
        while(!(s=in.readLine()).equals("0 0")) {
            String str[] = s.split(" ");
            long r, c, ans;
            r = Long.valueOf(str[0]);
            c = Long.valueOf(str[1]);
            if (r == 0 || c == 0)
                System.out.print(0);
            else if (r == 1)
                System.out.print(c);
            else if (c == 1)
                System.out.print(r);
            else if (c == 2 || r == 2)
                {
                if(c==2&&r==2)
                    System.out.print(4);
                else if(c==2)
                    {
                    if(r%2==0)
                        {
                        if(r%4!=0)
                            System.out.print(r+2);
                        else
                            System.out.print(r);
                        }
                    else
                        {
                        System.out.print(r+1);
                        }
                    }
                else if(r==2)
                    {
                    if(c%2==0)
                        {
                        if(c%4!=0)
                            System.out.print(c+2);
                        else
                            System.out.print(c);
                        }
                    else
                        {
                        System.out.print(c+1);
                        }
                    }
                }
            else if (c != r)
                {
                 if(c%2!=0&&r%2!=0)
                     System.out.print(c * r / 2+1);
                 else
                     System.out.print(c * r / 2);
                }
            else if(c==r)
                {
                if(c%2!=0)
                    System.out.print(c * r / 2 + 1);
                else
                    System.out.print(c*r/2);
                }
                System.out.println(" knights may be placed on a "+r+" row "+c+" column board.");
            }
        
    }
}
