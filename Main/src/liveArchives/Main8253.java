/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liveArchives;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Usuario
 * live archive 8253
*/
public class Main8253 {
    static BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws Exception {
    
        String s;    
        while((s=in.readLine())!=null){
            int x=Integer.valueOf(s.trim());
            System.out.println(x<=3?1:x-2);
        }
    }
}
