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
 * 
 */

public class Main624 {
    static int MAX_W;
    static int MAX_N;
    static int weight[];
    static int memo[][];
    static int MAX=20000;
    static int dp[][];

    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s;

        while((s=in.readLine())!=null)
            {
            StringTokenizer st=new StringTokenizer(s);
            MAX_W=Integer.valueOf(st.nextToken());
            MAX_N=Integer.valueOf(st.nextToken());
            memo=new int[MAX_N][MAX_W];
            dp=new int[25][MAX+5];
            init();
            weight=new int[MAX_N+1];
            for (int i = 1; i <=MAX_N ; i++)
                {
                weight[i]=Integer.valueOf(st.nextToken());
                }
            for (int i = 1; i <=MAX_N ; i++)
                {
                for (int j = 0; j <=MAX_W ; j++)
                    {
                    if(weight[i]<=j)dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-weight[i]]+weight[i]);
                    else dp[i][j]=dp[i-1][j];
                    }
                }
            int sum=dp[MAX_N][MAX_W];
            for (int i = 0; i <4; i++) {
                for (int j = 0; j <6 ; j++) {
                    System.out.print(dp[i][j]+" ");
                }
                System.out.println();
                }
            int ans[]=new int[MAX_N];
            int k=0;
            while (MAX_N!=0)
                {
                System.out.printf("%d %d %d %d %d\n",MAX_N,MAX_W,weight[MAX_N],dp[MAX_N][MAX_W],dp[MAX_N-1][MAX_W]);
                if(dp[MAX_N][MAX_W]!=dp[MAX_N-1][MAX_W])
                    {
                    ans[k++]=weight[MAX_N];
                    MAX_W-=weight[MAX_N];
                    }
                MAX_N--;
                }
            for (k--; k>=0 ; k--)
                {
                System.out.printf("%d ",ans[k]);

                }
            System.out.printf("sum:%d\n",sum);
            }
    }

    public static void init()
        {
        for (int i = 0; i <=MAX_W ; i++) {
            dp[0][i]=0;
            }
        for (int i = 0; i <memo.length ; i++) {
            for (int j = 0; j <memo[i].length ; j++) {
                memo[i][j]=-1;
            }
        }
        }
  
}
