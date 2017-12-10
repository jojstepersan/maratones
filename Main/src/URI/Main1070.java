/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 1070	Six Odd Numbers
 * @author jojstepersan
 */
public class Main1070 {
    public static void main(String[] args)throws Exception {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        long x=Long.valueOf(in.readLine());
        if(x%2==0)
            x++;
        for (int i = 0; i < 6; i++) {
            System.out.println(x);
            x+=2;
        }
    }
}
