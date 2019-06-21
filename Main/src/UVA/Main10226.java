/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *
 * @author jojstepersan 10226 - Hardwood Species
 */
public class Main10226 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static Map<String, Integer> trees = new TreeMap<>();
    static double q = 0, hard = 0, soft = 0;

    public static void main(String[] args) throws Exception {
        int n = Integer.valueOf(in.readLine().trim());
        in.readLine();
        boolean f = false;
        for (int i = 0; i < n; i++) {
            String s;
            trees = new TreeMap<>();
            while (!(s = in.readLine()).equals("")) {
                if (s.contains("Cherry") || s.contains("Oak") || s.contains("Maple")) {
                    hard++;
                } else {
                    soft++;
                }
                if (trees.containsKey(s)) {
                    trees.replace(s, trees.get(s) + 1);
                } else {
                    trees.put(s, 1);
                }
                q++;
            }
            if (f) {
                System.out.println("");
            }
            trees.forEach((k, v) -> {
                if (k.contains("Cherry") || k.contains("Oak") || k.contains("Maple")) {
                    System.out.printf("%s %.4f\n", k, (double) (v * 40.d / hard));

                } else {
                    System.out.printf("%s %.4f\n", k, (double) (v * 60.d / soft));

                }
                //System.out.printf("%s %.4f\n", k, (double) (v * 100.d / q));
            });
            f = true;
        }

    }
}
/*
1

Red Alder
Ash
Aspen
Basswood
Ash
Beech
Yellow Birch
Ash
Cherry
Cottonwood
Ash
Cypress
Red Elm
Gum
Hackberry
White Oak
Hickory
Pecan
Hard Maple
White Oak
Soft Maple
Red Oak
Red Oak
White Oak
Poplan
Sassafras
Sycamore
Black Walnut
Willow

 */
