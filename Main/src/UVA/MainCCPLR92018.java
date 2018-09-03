/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author jojstepersan
 */
public class MainCCPLR92018 {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = in.readLine()) != null) {
            long n = Long.valueOf(s);
            String resp = "";
            while (n > 0) {
                if (n % 2 == 0) {
                    resp = "7" + resp;
                } else {
                    resp = "4" + resp;
                }
                n = (n - 1) / 2;
            }
            System.out.println(resp);
        }
    }
}
