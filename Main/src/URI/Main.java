package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s[];
        int n=Integer.valueOf(in.readLine());
        s=in.readLine().split(" ");
        for (int i = 0; i < n; i++)
            {
            solve(s[i]);
            if(i!=n-1)
                System.out.print(" ");
            }
        System.out.println("");
        
        }
    public static void solve(String s)
        {
        int c=0,n=0;
        if(s.length()==3)
            {
            if(s.charAt(0)=='U')
                c++;
            if(s.charAt(1)=='R')
                c++;
            if(s.charAt(0)=='O')
                n++;
            if(s.charAt(1)=='B')
                n++;
            if(n>=2||c>=2)
                {
                if(c>n)
                    System.out.print("URI");
                else System.out.print("OBI");
                }
            else System.out.print(s);
            }
        else System.out.print(s);
        }

}
/*
10
URA URO URI URU UROS IBO OBA OBAS OBES OBE

URI URI URI URI UROS IBO OBI OBAS OBES OBI 
URI URI URI URI UROS IBO OBI OBAS OBES OBI
*/