package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 10849	Move the bishop
 *jojstepersan
 */

public class Main10849{
    public static void main(String[] args)throws Exception {
       // BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
       Scanner sc=new Scanner(System.in);
       long cases=sc.nextLong();//Long.valueOf(in.readLine());
        for (long i = 0; i <cases; i++) {
            //in.readLine();
            long subCases=sc.nextLong(); //Integer.valueOf(in.readLine());
            long n=sc.nextLong();//Long.valueOf(in.readLine());
            for (long j = 0; j < subCases; j++) {
                //String str[]=in.readLine().split(" ");
                long x1,x2,y1,y2;
                x1=sc.nextLong();
                y1=sc.nextLong();//Long.valueOf(str[1]);
                x2=sc.nextLong();//Long.valueOf(str[2]);
                y2=sc.nextLong();//Long.valueOf(str[3]);
                long d1,d2;
                d1=Math.abs(x1-x2);
                d2=Math.abs(y1-y2);
                if(x1<0||x2<0||y1<0||y2<0)
                    System.out.println("no move");
                else if(x1==x2 &&y1==y2)
                    System.out.println("0");
                else if(d1==d2)
                    System.out.println("1");
                else if((d1%2==0&&d2%2==0)||(d1%2!=0&&d2%2!=0))
                    System.out.println("2");
                else System.out.println("no move");
                    
                }
            }
    }
}

/*
2

3
8
3 6 6 3
4 2 2 3
7 2 1 4

2
6
1 2 6 5
2 3 5 1


*/