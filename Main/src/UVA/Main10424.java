/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/**
 *
 * @author stiven 10424 - Love Calculator
 */
public class Main10424 {

    public static void main(String[] args) throws IOException {
        String name1, name2;
        Locale.setDefault(Locale.US);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        while ((name1 = in.readLine()) != null) {
            name1 = name1.toLowerCase();
            name2 = in.readLine().toLowerCase();
            int n1 = 0, n2 = 0;
            for (int i = 0; i < name1.length(); i++) {
                char c = name1.charAt(i);
                if (Character.isAlphabetic(c)) {
                    n1 += (int) c - 96;
                }
            }
            for (int i = 0; i < name2.length(); i++) {
                char c = name2.charAt(i);
                if (Character.isAlphabetic(c)) {
                    n2 += (int) c - 96;
                }
            }
            //System.out.println(n1+" "+n2);
            n1 = oneDigit(n1);
            n2 = oneDigit(n2);
            //System.out.println(n1+" "+n2);
            double min = Math.min(n1, n2);
            double max = Math.max(n1, n2);
            if (max != 0) {
                System.out.printf("%.2f ", (min / max) * 100);
            } else {
                System.out.print("0");
            }
            System.out.println("%");
        }
    }

    public static int oneDigit(double i) {
        if (i < 10) {
            return (int) i;
        } else {
            int sum = 0;
            while (i > 0) {
                sum += i % 10;
                i /= 10;
            }
            return oneDigit(sum);
        }
    }
}
