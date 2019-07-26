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
 * @author Usuario uva 458
 */
public class Main458{ 

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        String s;
        boolean f=false;
        while ((s = in.readLine()) != null) {
            if(f)
                System.out.println("");
            else f=true;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != '\n') {
                    System.out.print((char) (s.charAt(i) - 7));
                }
            }
        }
        
    }

}
