/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * 417	Word Index
 * @author jojstepersan
 */
public class Main417 {

    static String[] letras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public static void main(String[] args) throws Exception {
        TreeMap<String, Integer> tree = new TreeMap<>();
        int c1 = 1, c2 = 1, c3 = 1, c4 = 1;
        for (int i = 0; i < letras.length; i++) {
            tree.put(letras[i], i + 1);
            for (int j = i + 1; j < letras.length; j++) {
                tree.put(letras[i] + letras[j], 26 + (c1++));
                for (int k = j + 1; k < letras.length; k++) {
                    tree.put(letras[i] + letras[j] + letras[k], 351 + (c2++));
                    for (int l = k + 1; l < letras.length; l++) {
                        tree.put(letras[i] + letras[j] + letras[k] + letras[l], 2951 + (c3++));
                        for (int m = l + 1; m < letras.length; m++) {
                            tree.put(letras[i] + letras[j] + letras[k] + letras[l] + letras[m], 17901 + (c4++));
                        }
                    }
                }
            }
        }
//        tree.forEach((s, i) -> System.out.println(s + " " + i));
        String s;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        // while ((s = in.readLine().trim()) != null) {
        while (sc.hasNext()) {
            s = sc.nextLine().trim();
            if (s.length() > 5) {
                System.out.println("0");
            } else if (tree.containsKey(s)) {
                System.out.println(tree.get(s));
            } else {
                System.out.println("0");
            }
        }
    }
}
