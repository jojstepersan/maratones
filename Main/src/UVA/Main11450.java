/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author Usuario
 */
public class Main11450 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int M, C;
    static int[][] memo=new int[250][25];
    static int prices[][];

    public static void main(String[] args) throws Exception {
        int t = Integer.valueOf(in.readLine());
        for (int i = 0; i < t; i++) {
            //lectura de datos
            st = new StringTokenizer(in.readLine());
            M = Integer.valueOf(st.nextToken());
            C = Integer.valueOf(st.nextToken());
            //memo = new int[M][C];
            init();
            prices=new int[M][];
            for (int j = 0; j < C; j++) {
                st = new StringTokenizer(in.readLine());
                int K = Integer.valueOf(st.nextToken());
                prices[j] = new int[K];
                for (int k = 0; k < K; k++) {
                    prices[j][k] = Integer.valueOf(st.nextToken());
                }
            }
            //solucion
            int ans=shop(M,0);            
            System.out.println(ans>0?ans:"no solution");
        }

    }

    static int shop(int money, int g) {
        if (money < 0) {
            return -1000000000;//excede el presupuesto
        }
        if (g == C) {
            return M - money; //CASO BASE:se compro la ultima prenda
        }
        //VALIDAR SI YA TENEMOS CALCULADO LA PRENDA
        if (memo[money][g] != -1) {
            return memo[money][g];
        }
        int ans= -1;//EMPIEZA NEGATIVO PORQUE LOS PRECIO NO SON NEGATIVOS
        for (int i = 0; i < prices[g].length; i++) {
            //no llevar o llevar
            ans=Math.max(ans,shop(money-prices[g][i],g+1));
            //MONEY - PRECIO DE LA PRENDA ACTUAL, G+1
            //LLEVARLO ES EL PRESUPUESTO MENOS PRECIO DE LA PRENDA ACTUAL
            // Y EL OTRO ESTADO ES LA SIGUIENTE PRENDA
        }
        return memo[money][g]=ans;// MEMOIZAR Y RETORNAR
    }

    static void init() {
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[i].length; j++) {
                memo[i][j] = -1;
            }
        }

    }
}
/*
3
100 4
3 8 6 4
2 5 10
4 1 3 3 7
4 50 14 23 8
20 3
3 4 6 8
2 5 10
4 1 3 5 5
5 3
3 6 4 8
2 10 6
4 7 3 1 7
*/