/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

/**
 *
 * @author Jojstepersan
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main10680 {

    static int MAX = 10000000;
    static ArrayList<Integer> primes = new ArrayList<>();
    static boolean sieve[] = new boolean[MAX + 5];
    static List<Long> memo[] = new ArrayList[10];

    public static void calculatePrimes() {
        sieve[0] = sieve[1] = true;
        int i;
        for (i = 2; i * i <= MAX; i++) {
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
            s *= Math.pow(prime, k);
            s %= 1000000000;
            prime = primes.get(++i);
            while (s % 10 == 0) {
                s /= 10;
            }
        }
        //  System.out.println(s % 10);
        int x = (int) s % 10;
        memo[x].add(n);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        calculatePrimes();
        for (int i = 0; i < memo.length; i++) {
            memo[i] = new ArrayList<>();
        }
       // System.out.println( Arrays.toString(sieve));
        //  System.out.println(primes);
        //System.out.println(primes.size());
        // String s;
        //while (!(s = in.readLine()).equals("0")) {
        for (int i = 1; i < 100000; i++) {
            solve(i);
        }
        String st = "";
        for (int i = 0; i < memo.length; i++) {

            st += ("int arr" + i + "[]={");
            for (int j = 0; j < memo[i].size(); j++) {
                st += (memo[i].get(j) );
                if (j != memo[i].size() - 1) {
                    st+=",";
                }
                
            }
            st+="};\n";
        }
        BufferedWriter wr=new BufferedWriter(new FileWriter("out.txt"));
        wr.write(st);
        wr.close();
        System.out.println(st);

        //Long n = Long.parseLong(i);
//solve(n);
//}
    }

}
