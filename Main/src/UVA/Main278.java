package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/***
 * uva 278 Chess
 * jojstepersan
 */

public class Main278 {
    public static void main(String[] args)throws Exception {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        long cases=Long.valueOf(in.readLine());
        for (int i = 0; i < cases; i++)
            {
            String str[]=in.readLine().split(" ");
            String  s=str[0];
            long r,c;
            r=Long.valueOf(str[1]);
            c=Long.valueOf(str[2]);
            solve(s,r,c);
            }
    }

    public static void solve(String s,long r,long c)
        {
        switch (s)
            {
            case "r":System.out.println(Math.min(r,c));
                    break;
            case "k":  if (c != r)
                        {
                        if(c%2!=0&&r%2!=0)
                            System.out.println(c * r / 2+1);
                        else
                            System.out.println(c * r / 2);
                        }
                        else if(c==r)
                        {
                        if(c%2!=0)
                            System.out.println(c * r / 2 + 1);
                        else
                            System.out.println(c*r/2);
                        }
                    break;
            case "Q":System.out.println(Math.min(r,c));
                    break;
            case "K":if(c%2==0)
                        c=c/2;
                    else
                        c=c/2+1;
                    if(r%2==0)
                        r=r/2;
                    else
                        r=r/2+1;
                System.out.println(r*c);
                break;
            }
        }

}
/*
24
K 8 10
K 7 9
K 7 7
K 8 8
K 6 10
K 5 10
Q 8 10
Q 7 9
Q 7 7
Q 8 8
Q 6 10
Q 5 10
k 8 10
k 7 9
k 7 7
k 8 8
k 6 10
k 5 10
r 8 10
r 7 9
r 7 7
r 8 8
r 6 10
r 5 10


* */