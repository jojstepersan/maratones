/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 10763 - Foreign Exchange
 * @author jojstepersan
 */
public class Main10763 {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while (!(s = in.readLine()).equals("0")) {
            int stu = Integer.valueOf(s);
            int a[] = new int[stu];
            int b[] = new int[stu];
            StringTokenizer st;
            for (int i = 0; i < stu; i++) {
                st = new StringTokenizer(in.readLine().trim());
                a[i] = Integer.valueOf(st.nextToken());
                b[i] = Integer.valueOf(st.nextToken());
            }
            boolean f=false;
            Arrays.sort(a);
            Arrays.sort(b);
            for (int i = 0; i < stu; i++) {
                if (a[i] != b[i]) {
                    f = true;
                    break;
                }
            }
            if(f)System.out.println("NO");
            else System.out.println("YES");

        }
    }
}
