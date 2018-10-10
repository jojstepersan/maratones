/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 *
 * @author jojstepersan
 * 860 - Entropy Text Analyzer
 */
public class Main860 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static float sum = 0;
    static int lmd = 0;

    public static void main(String[] args) throws Exception {
        String s;

        HashMap<String, Integer> freq = new HashMap<>();
        while (!(s = in.readLine()).equals("****END_OF_INPUT****")) {
            if (!s.equals("****END_OF_TEXT****")) {
                s = s.toLowerCase();
                s = s.replace(',', ' ');
                s = s.replace('.', ' ');
                s = s.replace(':', ' ');
                s = s.replace(';', ' ');
                s = s.replace('!', ' ');
                s = s.replace('?', ' ');
                s = s.replace('"', ' ');
                s = s.replace('(', ' ');
                s = s.replace(')', ' ');
                s = s.replace('[', ' ');
                s = s.replace(']', ' ');
            //     System.out.println(s);
                String arr[] = s.split(" ");
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

                freq.forEach((k, v) -> {
                    sum += v * (Math.log10(lmd) - Math.log10(v));
                });
                float er = sum / lmd;
                Float res=(float)er*100/(float)Math.log10(lmd);
                System.out.printf("%d %.1f %d\n", lmd, er,(int)Math.round(res));
                lmd = 0;
                sum = 0;
                freq = new HashMap<>();
            }

        }

    }

}
