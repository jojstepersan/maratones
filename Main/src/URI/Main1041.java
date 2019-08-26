/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author jojstepersan
 */
public class Main1041 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        float x, y;
        StringTokenizer st = new StringTokenizer(in.readLine());
        x = Float.valueOf(st.nextToken());
        y = Float.valueOf(st.nextToken());
        if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x == 0 && y!=0) {
            System.out.println("Eixo Y");
        } else if (y == 0 && x!=0) {
            System.out.println("Eixo X");
        } else {
            System.out.println("Origem");
        }

    }
}
