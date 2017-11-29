/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 10071 - Back to High School Physics
 * @author jojstepersan
 */
public class Main10071 {
    public static void main(String[] args) throws Exception {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=in.readLine())!=null)
            {
            String str[]=s.split(" ");
            System.out.println(Long.valueOf(str[0])*Long.valueOf(str[1])*2);
            }
    }
}
