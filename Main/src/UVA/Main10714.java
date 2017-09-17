/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *10714 - Ants
 * @author jojstepersan
 */
public class Main10714 {
    public static void main(String[] args) throws IOException {
        //BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new  Scanner(System.in);
        int casos=sc.nextInt();//Integer.valueOf(in.readLine());
        for (int i = 0; i < casos; i++)
            {
            //StringTokenizer st=new  StringTokenizer(in.readLine());
            int l=sc.nextInt();//Integer.valueOf(st.nextToken());
            int ants=sc.nextInt();//Integer.valueOf(st.nextToken());
            //StringTokenizer stAnts=new StringTokenizer(in.readLine());
            int[] ant=new int[ants];
            for (int j = 0; j < ant.length; j++) 
                ant[j]=sc.nextInt();//Integer.valueOf(stAnts.nextToken());
            Arrays.sort(ant);
            int m=l/2,mitad;
            mitad=ant[0];
            for (int j = 1; j < ant.length; j++)
                {
                if(Math.abs(ant[j]-m)<Math.abs(ant[j-1]-m))
                    mitad=ant[j];
                }
            System.out.printf("%d %d\n",Math.min(mitad,l-mitad),Math.max(ant[ant.length-1],l-ant[0]));
            }
    }
}
