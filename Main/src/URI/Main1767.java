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
 * 1767 Santa Claus Bag
 * @author jojstepersan
 */
public class Main1767 {
    static int MAX_WEIGHT=50;
    static int N;
    static int sum=0,c=0;
    static int prices[]=new int[N];
    static int weight[]=new int[N];
    static boolean llevados[]=new boolean[N];
    static int memo[][]=new int[N][MAX_WEIGHT];
    
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int casos=Integer.valueOf(in.readLine());
        for (int i = 0; i < casos; i++)
            {
            N=Integer.valueOf(in.readLine());
            prices=new int[N];
            weight=new int[N];
            llevados=new boolean[N];
            for (int j = 0; j < N; j++) 
                {
                StringTokenizer st=new StringTokenizer(in.readLine());
                prices[j]=Integer.valueOf(st.nextToken());
                weight[j]=Integer.valueOf(st.nextToken());
                }
            init();
            System.out.printf("%d brinquedos\nPeso: %d Kg\nsobra(m) %d pacote(s)\n\n",knapsack(0, MAX_WEIGHT),sum,N-c);

            
            }
        
    }
 
    static void init()
        {
        memo=new int[N][MAX_WEIGHT];
        for (int i = 0; i < N; i++)
            for(int j = 0; j <MAX_WEIGHT; j++)
                memo[i][j]=-1;
        sum=0;
        c=0;        
        }
    
    static void show()
        {
        for(int i = 0; i < memo.length; i++) {
                for (int j = 0; j < memo[i].length; j++) {
                    System.out.print( memo[i][j]+" ");
            }
                System.out.println("");
            }
        }
    
    static int knapsack(int id,int w)
        {
        if(id==N||w==0)
            return 0;
        if(memo[id][w-1]!=-1)
            return memo[id][w-1];
        if(weight[id]>w)
            memo[id][w-1]=knapsack(id+1, w);
        else
            {
            //memo[id][w-1]=Math.max(knapsack(id+1, w),prices[id]+knapsack(id+1, w-weight[id]));

            int llevar=prices[id]+knapsack(id+1, w-weight[id]);
            int noLlevar=knapsack(id+1, w);
            if(llevar>noLlevar)
                {
                llevados[id]=true;
                System.out.println(weight[id]+" llevar");
                memo[id][w-1]=llevar;
                }
            else
                {
                memo[id][w-1]=noLlevar;
                }
            }
        return memo[id][w-1];
        }
}
