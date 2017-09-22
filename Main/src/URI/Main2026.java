/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * 2026 christmas tree
 * @author jojstepersan
 */
public class Main2026 {
    static int MAX_WEIGHT;
    static int MAX_N;
    static int adorno[];
    static int weight[];
    static int memo[][];
    
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int casos=Integer.parseInt(in.readLine());
        for (int i = 0; i <casos; i++) 
            {
            MAX_N=Integer.parseInt(in.readLine());
            adorno=new int[MAX_N];
            weight=new int[MAX_N];
            MAX_WEIGHT=Integer.parseInt(in.readLine());
            for (int j = 0; j < MAX_N; j++)
                {
                StringTokenizer st=new StringTokenizer(in.readLine());
                adorno[j]=Integer.parseInt(st.nextToken());
                weight[j]=Integer.parseInt(st.nextToken());
                }
            init();
            System.out.printf("Galho %d:\n",i+1);
            System.out.printf("Numero total de enfeites: %d\n",knapsack(0, MAX_WEIGHT));
            System.out.println("");
            }           
        }
    
    static void init()
        {
        memo=new int[MAX_N][MAX_WEIGHT];
        for (int i = 0; i < memo.length; i++) 
            for (int j = 0; j <memo[i].length; j++) 
                memo[i][j]=-1;
        }
    
    static int knapsack(int id,int w)
        {
        if(id==MAX_N||w==0)
            return 0;
        if(memo[id][w-1]!=-1)
            return memo[id][w-1];
        if(weight[id]>w)
            memo[id][w-1]=knapsack(id+1, w);
        else
            memo[id][w-1]=Math.max(knapsack(id+1, w), adorno[id]+knapsack(id+1, w-weight[id]));
        return memo[id][w-1];
        }
}
