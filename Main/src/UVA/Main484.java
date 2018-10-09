/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 *
 * @author jojstepersan
 * 484 - The Department of Redundancy Department
 */
public class Main484 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        String s;// = in.readLine();
        StringTokenizer st;
        ArrayList<Long> order = new ArrayList<>();
        HashMap<Long, Long> freq = new HashMap<>();
        while ((s = in.readLine()) != null) {
           // System.out.println(s);
            st = new StringTokenizer(s.trim());
            while (st.hasMoreTokens()) {
                long x = Long.valueOf(st.nextToken());
                if (freq.containsKey(x)) {
                    freq.replace(x, freq.get(x) + 1);
                } else {
                    order.add(x);
                    freq.put(x, 1l);
                }
            }
        }
        order.forEach(x -> System.out.println(x + " " + freq.get(x)));
    }
}
