/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package RPC.R19_08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author jojstepersan
 */
public class code {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        int t = Integer.valueOf(in.readLine());
        st = new StringTokenizer(in.readLine());
        Map<Integer, Integer> sql = new HashMap<>();
        for (int i = 0; i < t; i++) {
            sql.put(Integer.valueOf(st.nextToken()), 0);
        }
        int dirtiness = 0;
        int badPush = 0;
        int i = 0;
        int cleanUps = 0;
        while (i <= 366) {
            if (dirtiness >= 20) {
                dirtiness = 0;
                badPush = 0;
                cleanUps++;
                i--;
                continue;
            }
            dirtiness += badPush;
            if (sql.containsKey(i)) {
                badPush++;
            }
            i++;
        }
        if (dirtiness > 0) {
            cleanUps++;
        }
        System.out.println(cleanUps);

    }

}
