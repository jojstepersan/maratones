/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPC.R14_2017;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 *
 * @author jojstepersan
 * Aggressive cows 
 */
public class MainAggressiveCows {

    static int n, c;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            n = Integer.valueOf(st.nextToken());
            c = Integer.valueOf(st.nextToken());
            int arr[] = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = Integer.valueOf(in.readLine());
            }
            Arrays.sort(arr);
            int k = bs(arr);
            System.out.println(k);
        }
    }

    public static int bs(int array[]) {
        int ini = 0, last = array[n - 1], max = -1;
        while (last > ini) {
            int mid = (ini + last) / 2;
            if (evaluate(mid, array) == 1) {
                if (mid > max) {
                    max = mid;
                }
                ini = mid + 1;
            } else {
                last = mid;
            }
        }
        return max;
    }

    public static int evaluate(long d, int arr[]) {
        int cows = 1;
        long pivote = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - pivote >= d) {
                cows++;
                pivote = arr[i];
            }
            if (cows == c) {
                return 1;
            }
        }
        return 0;
    }

}
/*
1
5 3
1
2
8
4
9
*/
