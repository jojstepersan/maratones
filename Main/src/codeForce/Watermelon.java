/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *4A - Watermelon
 * @author jojstepersan
 */
public class Watermelon {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new  InputStreamReader(System.in));
        String s=in.readLine();
        if(s.equals("2"))
            System.out.println("NO");
        else
        System.out.println(Long.valueOf(s)%2==0?"YES":"NO");
    }
}
