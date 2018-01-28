/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codeForce;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *591A - Wizards' Duel
 * @author jojstepersan
 */
public class Main591A {
    public static void main(String[] args)throws Exception {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        double l,p,q;
        l=Long.valueOf(in.readLine());
        p=Long.valueOf(in.readLine());
        q=Long.valueOf(in.readLine());
        System.out.println((p*l)/(p+q));
    }
}
