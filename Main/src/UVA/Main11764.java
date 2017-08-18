/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.util.Scanner;

/**
 *
 * @author jojstepersan
 */
public class Main11764 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int casos=sc.nextInt();
        for (int i = 0; i < casos; i++)
            {
            int h=0,l=0;    
            int saltos=sc.nextInt();
            int aux=sc.nextInt();
            for (int j = 0; j < saltos-1; j++)
                {
                int x=sc.nextInt();
                if(x!=aux)
                    {
                    if(x<aux)
                        l++;
                    else
                        h++;
                    aux=x;
                    }  
                }    
            System.out.println("Case "+(i+1)+": "+h+" "+l);
            }
    
    }
}
