/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmis;

/**
 *
 * @author Usuario
 */
public class UboundedKnapsack { 
      
    static int bills=0;
    
    private static int min(int i, int j) { 
        if(i < j){
            bills++;
            return j;
        }else
            return  i ; 
    } 
      
    // Returns the maximum value with knapsack 
    // of W capacity 
    private static int unboundedKnapsack(int W, int n,  
                                int[] val, int[] wt) { 
          
        // dp[i] is going to store maximum value 
        // with knapsack capacity i. 
        int dp[] = new int[W + 1]; 
          
        // Fill dp[] using above recursive formula 
        for(int i = 0; i <= W; i++){ 
            for(int j = 0; j < n; j++){ 
                if(wt[j] <= i){ 
                    dp[i] = min(dp[i], dp[i - wt[j]] +  
                                val[j]); 
                } 
            } 
        } 
        return dp[W]; 
    } 
    
    public static void main(String[] args) { 
        int W = 125; 
        int val[] = {1,1,1,1, 1}; 
        int wt[] = {1,5,10,20,100}; 
        int n = val.length; 
        System.out.println(unboundedKnapsack(W, n, val, wt)); 
        System.out.println(bills);
    } 
}
