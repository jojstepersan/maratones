package codeForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author jojstepersan
 * AGGRCOW - Aggressive cows
 */
public class MainAGGRCOW {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s=in.readLine();
        String str[]=s.split(" ");
        int n,m;
        n=Integer.valueOf(str[0]);
        m=Integer.valueOf(str[1]);
        char mat[][]=new char[n][m];
        for (int i = 0; i < n; i++)
            {
            mat[i]=in.readLine().toCharArray();
            }
        System.out.println(solve(mat));
    }
    
    public static String solve(char mat[][])
        {
        char pivote;
        String s="";
        boolean been[][]=new boolean[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++)
            {
            for (int j = 0; j < mat[i].length; j++) 
                {
                pivote=mat[i][j];
                boolean flag=false; 
//                 show(been);
//                System.out.println("");
                for (int k = j+1; k < mat[i].length; k++) {
                   // System.out.println("k:"+k);
                    if(pivote==mat[i][k])
                        {
                        flag=true;
                        been[i][k]=true;
                        }
                    }
                for (int k = i+1; k < mat.length; k++) {
                     if(pivote==mat[k][j])
                        {
                        flag=true; 
                        been[k][j]=true;
                        }
                    }
                 if(flag)
                   been[i][j]=true;
                }
            }
        for (int i = 0; i < been.length; i++) {
            for (int j = 0; j < been[i].length; j++) {
                if(!been[i][j])
                    s+=mat[i][j]+"";
                }
            }
        return s;
        }
    
    public static void show(boolean  mat[][])
        {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println("");
            }
        }
}
/*
3 3
cba
bcd
cbc

*/