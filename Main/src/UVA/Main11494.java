package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/***
 *uva 11494	Queen
 * jojstepersan
 */

public class Main11494 {

    public static void main(String[] args) throws Exception{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while(!(s=in.readLine()).equals("0 0 0 0"))
            {
            int x1,x2,y1,y2;
            String str[]=s.split(" ");
            x1=Integer.valueOf(str[0]);
            y1=Integer.valueOf(str[1]);
            x2=Integer.valueOf(str[2]);
            y2=Integer.valueOf(str[3]);
            if(x1==x2 && y1==y2)
                System.out.println(0);
            else if(x1==x2 || y1==y2 || Math.abs(x1-x2)==Math.abs(y1-y2))
                System.out.println(1);
            else System.out.println(2);
            }
    }
}
