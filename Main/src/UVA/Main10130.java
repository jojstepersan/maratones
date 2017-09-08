/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author jojstepersan
 * 10130 - SuperSale
 */
public class Main10130 {
    
    static int MAX_WEIGHT;
    static int MAX_N;
    static  int prices[];
    static int weight[];
    static  int memo[][];
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int casos=Integer.valueOf(in.readLine());
        for (int i = 0; i <casos; i++)
            {
            MAX_N=Integer.valueOf(in.readLine());
            prices=new int[MAX_N];
            weight=new int[MAX_N];
            for (int j = 0; j <MAX_N; j++)
                {
                StringTokenizer st=new StringTokenizer(in.readLine());
                prices[j]=Integer.valueOf(st.nextToken());
                weight[j]=Integer.valueOf(st.nextToken());
                }
            int max_people=Integer.valueOf(in.readLine());
            long sum=0;
            for (int j = 0; j < max_people; j++)
                {
                MAX_WEIGHT=Integer.valueOf(in.readLine());
                init();
                sum+=knapsack(0, MAX_WEIGHT);
                }
           
            System.out.println(sum);
            }
    }
    
    static void init()
        {
        memo=new int[MAX_N][MAX_WEIGHT];
        for (int i = 0; i < MAX_N; i++) 
            for(int j = 0; j <MAX_WEIGHT; j++)
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
            {
            memo[id][w-1]=Math.max(knapsack(id+1, w),prices[id]+knapsack(id+1, w-weight[id]));
            }
        return memo[id][w-1];
        }
    
}
