/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Locale;

/**
 *
 * @author jojstepersan 860 - Entropy Text Analyzer
 */
public class Main860 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static double sum = 0;
    static int lmd = 0;

    public static void main(String[] args) throws Exception {
        String s;
        Locale.setDefault(Locale.US);
        HashMap<String, Integer> freq = new HashMap<>();
        while (!(s = in.readLine()).equals("****END_OF_INPUT****")) {
            if (!s.equals("****END_OF_TEXT****")) {
                s = s.toLowerCase();
//                s = s.replace(',', ' ');
//                s = s.replace('.', ' ');
//                s = s.replace(':', ' ');
//                s = s.replace(';', ' ');
//                s = s.replace('!', ' ');
//                s = s.replace('?', ' ');
//                s = s.replace('"', ' ');
//                s = s.replace('(', ' ');
//                s = s.replace(')', ' ');
//                s = s.replace('[', ' ');
//                s = s.replace(']', ' ');
                //     System.out.println(s);
                String arr[] = s.split("[, .:;!?()\"]");
                for (int i = 0; i < arr.length; i++) {
                    if (!arr[i].equals("")) {
                        lmd++;
                        if (freq.containsKey(arr[i])) {
                            freq.replace(arr[i], freq.get(arr[i]) + 1);
                        } else {
                            freq.put(arr[i], 1);
                        }
                    }
                }
            } else {
                if (lmd != 0) {
                    freq.forEach((k, v) -> sum += v * (Math.log10(lmd) - Math.log10(v)));
                    double er = sum / lmd;
                    double res = er * 100 / Math.log10(lmd);
                    System.out.printf("%d %.1f %d\n", lmd, er, (int) Math.round(res));
                } else {
                    System.out.println("0 0.0 0");
                }
                lmd = 0;
                sum = 0;
                freq = new HashMap<>();
            }

        }

    }

}
