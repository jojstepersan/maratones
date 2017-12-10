/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package RPC.R14_2017;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author jojstepersan
 */
public class balloon {
    
   static ArrayList<String> solves=new ArrayList<>();
    public static void main(String[] args) throws Exception {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=in.readLine())!=null)
            {
            int c=Integer.parseInt(s);
            String alumnos[]=new String[c];
            solves=new ArrayList<>();
            for (int i = 0; i < alumnos.length; i++)
                {
                alumnos[i]=in.readLine();
                solve(alumnos[i].toCharArray());
                }
            solve();
            }
    }
    
    public static void solve(char[] arr)
        {
        Arrays.sort(arr);
        String solve=arr[0]+"";
        
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]!=arr[i-1])
                solve+=arr[i];
            }
        solves.add(solve);
        }
    
    public static void solve()
        {
        int c=1;
        Collections.sort(solves);
        String aux=solves.get(0);
        for (int i = 1; i < solves.size(); i++) {
                if(!aux.equals(solves.get(i)))
                    c++;
                aux=solves.get(i);
            }
        System.out.println(c);
        }
    
}
