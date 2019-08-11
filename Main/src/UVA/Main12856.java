/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jojstepersan
 * 12856 - Counting substhreengs
 */
public class Main12856 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static String s;

    public static void main(String[] args) throws Exception {
        while ((s = in.readLine()) != null) {
            List<String> subStr = new ArrayList<>();
            String str = "";
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c >= 48 && c <= 57) {
                    str += c;
                } else {
                    if (!str.equals("")) {
                        str = str.trim();
                        subStr.add(str);
                    }
                    str = "";
                }
            }
            if (!str.equals("")) {
                str = str.trim();
                subStr.add(str);
            }
            solve(subStr);

        }
    }

    static void solve(List<String> word) {
        int c = 0;

        for (String w : word) {
            List<String> suf = suffixWhile(w);
            for (String item : suf) {
                BigInteger x = new BigInteger(item);
                if (x .mod(BigInteger.valueOf(3)).equals(BigInteger.ZERO) ) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }

    static List<String> suffix(String s) {
        List<String> suf = new ArrayList<>();
        int x = 1;
        for (int i = 0; i < s.length(); i++) {
            try {
                for (int j = 0; j < s.length(); j++) {
                    suf.add(s.substring(j, j + x));
                }
            } catch (Exception e) {
            }
            x++;
        }
       // System.out.println(suf.size());
        return suf;
    }

    static List<String> suffixWhile(String s) {
        int x = 1;
        List<String> suffix = new ArrayList<>();
        int i = 0;
        while (x != s.length() + 1) {
            try {
                suffix.add(s.substring(i, i + x));
            } catch (Exception e) {

            }
            i++;
            if (i == s.length()) {
                i = 0;
                x++;
            }
        }
        return suffix;
    }

}
/*
130a303
0000000000
icpc2014refional
*/
