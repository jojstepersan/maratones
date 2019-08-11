/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPC.R19_08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author jojstepersan
 */
public class baby {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        int n = Integer.valueOf(in.readLine());
        st = new StringTokenizer(in.readLine());
        boolean sense = true;
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            String s = st.nextToken();
            if (!s.equals("mumble")) {
                sense = i + 1 == Integer.valueOf(s);
                if (!sense) {
                    break;
                }
            }
        }
        if (sense) {
            System.out.println("makes sense");
        } else {
            System.out.println("something is fishy");
        }

    }

}
