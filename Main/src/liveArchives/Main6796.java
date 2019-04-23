/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liveArchives;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 6796 - Factorial Factors
 *
 * @author jojstepersan
 */
public class Main6796 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static int MAX = 150000;
    static List<Integer> primes = new ArrayList<>();
    static boolean sieve[] = new boolean[MAX + 5];
    static List<Long> primesFactors = new ArrayList<>();
    static Set<Long> primesFactorDistincs = new HashSet<Long>();
    static int DPP[] = new int[MAX + 5];
    static int DPPD[] = new int[MAX + 5];

    static void calculatePrime() {
        sieve[0] = sieve[1] = true;
        int i;
        for (i = 2; i * i <= MAX; ++i) {
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
        primesFactors.clear();
        //  primesFactorDistincs.clear();
        long temp = value;
        int factor;
        for (int i = 0; (long) primes.get(i) * primes.get(i) <= value; ++i) {
            factor = primes.get(i);
            while (temp % factor == 0) {
                primesFactors.add((long) factor);
                Long auxFactor = (long) factor;
                primesFactorDistincs.add(auxFactor);
                temp /= factor;
            }
        }
        if (temp != 1) {
            primesFactors.add(temp);
            primesFactorDistincs.add(temp);
        }
    }

    public static void main(String[] args) throws Exception {
        calculatePrime();
        for (int i = 2; i < MAX; i++) {
            calculatePrimeFactors(i);
            DPP[i] = DPP[i - 1] + primesFactors.size();
            DPPD[i] = primesFactorDistincs.size();
        }
        int c = Integer.valueOf(in.readLine().trim());

        for (int i = 0; i < c; i++) {
            int n = Integer.valueOf(in.readLine().trim());
            System.out.println(DPPD[n] + " " + DPP[n]);
        }
    }

}
