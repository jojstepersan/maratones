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
 * @author Usuario
 */
public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        String s;
        int lmd = 0;
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
               // System.out.println(s);
                String arr[] = s.split(" ");
                for (int i = 0; i < arr.length; i++) {
                    if (!arr[i].equals("")) {
                        lmd++;
                        if (freq.containsKey(arr[i])) {
                            freq.replace(arr[i], freq.get(arr[i])+1);
                        } else {
                            freq.put(arr[i], 1);
                        }
                    }
                }
            } else {
                System.out.println(freq);
                System.out.println("res: " + lmd);
                lmd = 0;
                freq = new HashMap<>();
            }

        }

    }

}
