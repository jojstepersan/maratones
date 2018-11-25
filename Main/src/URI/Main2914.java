/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author Usuario
 */
public class Main2914 {

    static int MAX = 0;//100000;
    static ArrayList<Integer> primes = new ArrayList<>();
    static boolean sieve[] = new boolean[MAX + 5];
    static ArrayList<Integer> primeFactors = new ArrayList<>();
    static int maxPrime[] = new int[MAX + 5];
    static List<In> input=new ArrayList<>();

    public static void calculatePrimes() {
        maxPrime = new int[MAX + 5];
        sieve = new boolean[MAX + 5];
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

    static void calculatePrimeFactors(int value) {
        primeFactors.clear();
        int temp = value;
        int factor;
        for (int i = 0; (long) primes.get(i) * primes.get(i) <= value; ++i) {
            factor = primes.get(i);
            while (temp % factor == 0) {
                primeFactors.add(factor);
                temp /= factor;
            }
        }
        if (temp != 1) {
            primeFactors.add(temp);
        }
        maxPrime[value] = primeFactors.get(primeFactors.size() - 1);
    }

    public static void main(String[] args) throws Exception {
        
//        for (int i = 2; i <= MAX; i++) {
//            calculatePrimeFactors(i);
//        }
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine().trim());
        for (int i = 0; i < t; i++) {
           int n, k;
            StringTokenizer st = new StringTokenizer(in.readLine().trim());
            n = Integer.valueOf(st.nextToken());
            k = Integer.valueOf(st.nextToken());
            MAX=Math.max(MAX, n);
            input.add(new In(n, k));
            
            //System.out.println(solve(n, k));
        }
        //MAX=Collections.max(input).n;
        calculatePrimes();
        for (In x : input) {
            System.out.println(solve(x.n, x.k));
        }
    }

    public static int solve(int n, int k) {
        int c = 0;
        for (int i = 2; i <= n; i++) {
            if (maxPrime[i] == 0) {
                calculatePrimeFactors(i);
            }
            if (maxPrime[i] <= k) {
                c++;
            }
        }
        return c;
    }
}

class In implements Comparable<In> {

    Integer n, k;

    public In(Integer n, Integer k) {
        this.n = n;
        this.k = k;
    }

    @Override
    public int compareTo(In o) {
        return this.n.compareTo(o.n);
    }

}
/*
4
10 3
10 4
15 3
5 20
 */
