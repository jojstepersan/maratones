package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author usuario
 */
public class MainPrimes {

    static int MAX = 10000000;
    static ArrayList<Integer> primes = new ArrayList<>();
    static boolean sieve[] = new boolean[MAX + 5];
    //static  PrintWriter out=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    
    public static void calculatePrimes() {
        sieve[0] = sieve[1] = true;
        int i;
        for (i = 2; i*i <= MAX; i++) {
            if (!sieve[i]) {
                primes.add(i);
                for (int j = i * i; j <= MAX; j += i) {
                    sieve[j] = true;
                }
            }
        }
        for (; i <= MAX; i++) {
            if (!sieve[i]) {
                primes.add(i);
            }
        }
    }

    public static void solve(long n) {
      
        int i = 0;
        long s = 1;
        long prime = primes.get(i);
        while (prime <= n) {
            int k = (int) (Math.log(n) / Math.log(prime));
            long sol = (long) Math.pow(prime,k);
            s *= sol;
            prime = primes.get(++i);
            while(s%10==0) s/=10;
             s%=100000000;
        }
        System.out.println(s%10);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        calculatePrimes();
        String s;
        while (!(s = in.readLine()).equals("0")) {
            Long n = Long.valueOf(s);
            solve(n);
        }
        //out.close();
    }

}
