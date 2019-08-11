package RPC.R19_08;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jojstepersan
 */
public class parity {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static boolean odd,even;
    public static void main(String[] args) throws Exception {
        char[] s = in.readLine().toCharArray();
        Map<Character, Integer> freq = new HashMap<>();
        odd=even=false;
        for (char c : s) {
            if(freq.containsKey(c)){
                freq.replace(c, freq.get(c)+1);
            }else{
                freq.put(c, 1);
            }
        }
        
        freq.forEach((k,v)->{
            if(v%2==0)
                even=true;
            else odd=true;
            if(even && odd)return;
        });                
        if(odd && even)System.out.println("2");
        else if(even) System.out.println("0");
        else if(odd)System.out.println("1");
            
        

    }
}
