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
 *10407 - Simple division
 * @author jojstepersan
 */
public class Main10407{
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while(!(s=in.readLine()).equals("0"))
            {
            StringTokenizer st=new StringTokenizer(s);
            int num[]=new int[st.countTokens()-1];
            for (int i = 0; i < num.length; i++)
                {
                num[i]=Integer.valueOf(st.nextToken());
                }
            quickSort(num, 0, num.length-1);
            int aux=num[0];
            for (int i = 0; i < num.length; i++)
                num[i]-=aux;
            System.out.println(gcd(Math.abs(num[1]), Math.abs(num[num.length-1])));
            }
    }
    public static long gcd(long a,long b){return b==0?a:gcd(b,a%b);}

    public static void quickSort(int[] vector,int izquierda,int derecha)
        {
        int pivote=vector[izquierda];    
        int i=izquierda;
        int j=derecha;
        int auxIntercambio;
        while(i<j)
            {
            while(Math.abs(vector[i])<=Math.abs(pivote)&&i<j)
                i++;
            while(Math.abs(vector[j])>Math.abs(pivote))
                j--;
            if(i<j)
                {
                auxIntercambio=vector[i];
                vector[i]=vector[j];
                vector[j]=auxIntercambio;
                }
            }
        vector[izquierda]=vector[j];
        vector[j]=pivote;
        if(izquierda<j-1)
            quickSort(vector, izquierda, j-1);
        if(j+1<derecha)
            quickSort(vector, j+1, derecha);
        }
}


    
    