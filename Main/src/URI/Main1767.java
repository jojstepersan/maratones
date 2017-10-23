/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1767 Santa Claus Bag
 * @author jojstepersan
 */
public class Main1767 {
    static int MAX_WEIGHT=51;
    static int MAX_N=300;
    static int N;
    static int prices[]=new int[MAX_N+1];
    static int weights[]=new int[MAX_N+1];;
    static sol memo[][]=new sol[MAX_N][MAX_WEIGHT];
    
    
    public static void init() {
        for (int i = 0; i <= MAX_N; i++) {
            prices[i] = weights[i] = 0;
        }

        for (int i = 0; i < MAX_N; i++) {
            for (int j = 0; j < MAX_WEIGHT; j++) {
                memo[i][j] = new sol();
            }
        }

    }
  
    public static sol knapsack(int total_weight)
        {
        int i=1;    
        for ( ; i <= total_weight; i++) 
            memo[0][i]=new sol();   
            
        for (i = 1; i <= N; i++) {
            memo[i][0]=new sol();
            for (int w = 1; w <= total_weight; w++) {
                if(weights[i]<=w)
                    {
                    sol choose = new sol(); //muy importante
                    choose.brinq = prices[i] + memo[i - 1][w - weights[i]].brinq;
                    choose.weight = weights[i] + memo[i - 1][w - weights[i]].weight;
                    choose.pkgCount = 1 + memo[i - 1][w - weights[i]].pkgCount;
                    sol noChoose = new sol(memo[i - 1][w]);
                    if(choose.brinq>noChoose.brinq)
                        memo[i][w]=new sol(choose);
                    else
                        memo[i][w]=new sol(noChoose);
                    }
                else
                    memo[i][w]=memo[i-1][w];
                }       
            }
        return memo[N][total_weight];
        }
   
   
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int casos=Integer.valueOf(in.readLine());  
        for (int i = 0; i < casos; i++) {
             init();
            N = Integer.valueOf(in.readLine());
            for (int j = 1; j <= N; j++) {
                String[] line = in.readLine().split(" ");
                prices[j] = Integer.valueOf(line[0]);
                weights[j] = Integer.valueOf(line[1]);
            }
            sol c=knapsack(50);
            System.out.printf("%d brinquedos\n", c.brinq);
            System.out.printf("Peso: %d kg\n", c.weight);
            System.out.printf("sobra(m) %d pacote(s)\n",N- c.pkgCount);
            System.out.println("");
        }
    }
}
class sol{
public int  brinq=0;
public int weight=0;
public int pkgCount=0;
public sol(){}
public sol(sol x)
    {
    brinq=x.brinq;
    weight=x.weight;
    pkgCount=x.pkgCount;
    }

    @Override
    public String toString() {
        return "sol {"+"brinq="+brinq+",weight="+weight+" ,pkgCount="+pkgCount+"} "; 
    }


}
