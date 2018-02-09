/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 	2174	Pomekon Collection
 * @author jojstepersan
 */
public class Main2174 {
    static String pokemones[];
    public static void main(String[] args)throws Exception {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int cantidad=Integer.valueOf(in.readLine());
        pokemones=new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            pokemones[i]=in.readLine();
        }
        solve();
        
        
    }
    public static void solve()
        {
        Arrays.sort(pokemones);
        int c=1;
        String aux[]=new String[pokemones.length];
        String pok;
        aux[0]=pokemones[0];
        for (int i = 1; i < pokemones.length; i++) {
            pok=pokemones[i];
            if(!pok.equals(pokemones[i-1]))
               aux[c++]=pok;
            }
        System.out.println("Falta(m) "+(151-c)+" pomekon(s).");
        }
}
