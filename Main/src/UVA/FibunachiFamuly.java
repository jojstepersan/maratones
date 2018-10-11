/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 *
 * @author jojstepersan
 */
public class FibunachiFamuly {

    static double a, b;//alphan y betta
   static long memo1[] = new long[100000009];
    //static long memo2[] = new long[Integer.MAX_VALUE];

    public static void main(String[] args) throws IOException {
        a = (1 + Math.sqrt(5)) / 2d;
        b = (1 - Math.sqrt(5)) / 2d;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        long k, n;
        String s;
        StringTokenizer st;
        
        while (!(s = in.readLine()).equals("0 0")) {
            st = new StringTokenizer(s);
            k = Long.valueOf(st.nextToken());
            n = Long.valueOf(st.nextToken());
            double m, r;
            m = n / k;
            r = n % k;
            //System.out.println((long)fibu(n));
            long fibu = fibuFamily(k, n);
            System.out.println( fibu);
        }

    }

    public static double fibuFamily(double k, double n, double m, double r) {
        double x, y, z;
        x = Math.pow((1 / Math.sqrt(5)), k);
        y = Math.pow(a, m + 2) - Math.pow(b, m + 2);
        z = Math.pow(a, m + 1) - Math.pow(b, m + 1);
        return (x * Math.pow(y, r) * Math.pow(z, k - r));
    }

    public static double fibu(double n) {
        //a = (1 + Math.sqrt(5)) / 2d;
        //b = (1 - Math.sqrt(5)) / 2d;
        return (1 / Math.sqrt(5) * (Math.pow(a, n + 1) - Math.pow(b, n + 1)));
    }

    public static long fibuFamily(long k, long n) {
        if (n<0 ) {
            return 0;
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return (2 * fibuFamily(k, n - 1) - fibuFamily(k, n - k - 1))%100000009;
    
    }
}
