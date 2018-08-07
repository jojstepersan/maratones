/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author jojstepersan
 */
public class cued {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());
        int colors[] = new int[8];
        int repetido = 0, valorR = 0;
        int max = 0, solve;
        try{
        for (int i = 0; i < t; i++) {
            String s=in.readLine();
            colors[val(s)]++;
        }
        }catch(Exception e){}
        boolean di = true, igu = true;
        int c = 0;
        for (int i = 1; i < 8; i++) {
            if (colors[i] > 1) {
                di = false;
            }
            if (colors[i] == 0) {
                c++;
            }
        }
        if (c != 6) {
            igu = false;
        }
        if (igu) {
            //cuando todos sopn iguales
           try{
            for (int i = 1; i < 8; i++) {
                if (colors[i] != 0) {
                    System.out.println(i);
                    break;
                }
            }}catch(Exception e){}
        } else if (di) {
            try{
            //cuando todos son diferentes
            solve=0;
            for (int i = 1; i < 8; i++) {
                if (colors[i] != 0) {
                    solve += i;
                }
            }
            System.out.println(solve);
            }catch(Exception e){}
        } else {
            try{
            //cuando se repite alguno
            for (int i = 1; i < 8; i++) {
                if (max == 0 && colors[8 - i] != 0) {
                    max = 8 - i;
                }
                if (repetido < colors[i]) {
                    repetido = Math.max(repetido, colors[i]);
                    valorR = i;
                }
            }
//            System.out.println("r:"+repetido);
//            System.out.println("v:"+valorR);
//            System.out.println("m:"+max);
//           // repetido++;
            solve = repetido * valorR + repetido * max;
           // System.out.println(solve);
            for (int i = 1; i < 8; i++) {
                if (i!=valorR && colors[i] != 0) {
                    solve += i;
                //    System.out.println(i);
                }
            }

            System.out.println(solve);
            }catch(Exception e){}
        }
    }

    public static int val(String color) {
        switch (color) {
            case "red":
                return 1;
            case "yellow":
                return 2;
            case "green":
                return 3;
            case "brown":
                return 4;
            case "blue":
                return 5;
            case "pink":
                return 6;
            case "black":
                return 7;
            default:
                return 0;
        }
    }
}
