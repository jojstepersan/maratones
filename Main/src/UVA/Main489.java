/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * uva 489	Hangman Judge
 * @author jojstepersan
 */
public class Main489 {
    
    public static void main(String[] args) throws Exception{
        
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
       String k;
        while(!(k=in.readLine()).equals("-1"))
            {
            boolean abc[]=new boolean[26];
            int intentos=0,aux=0;   
            char hangman[]=in.readLine().toLowerCase().toCharArray();
            char hang[]=new char[hangman.length];
            for (int i = 0; i < hang.length; i++) 
                hang[i]='-';
            char solves[]=in.readLine().toCharArray();
            int sol=0;
            for (int i = 0; i < solves.length; i++) {
                for (int j = 0; j < hangman.length; j++) {
                    if(solves[i]!=hangman[j] && !abc[solves[i]-'a'])
                        {
                        aux++;
                        }
                    else if(solves[i]==hangman[j])
                        {
                        hang[j]=solves[i];
                        }
                    }
                sol=0;
                for (int j = 0; j < hang.length; j++) {
                    if(hang[j]==hangman[j])
                        sol++;
                }
               // System.out.println("sol:"+sol);
                if(sol==hangman.length)
                    break;
                if(aux==hangman.length)
                    intentos++;
                abc[solves[i]-'a']=true;
                aux=0;
                }
//            for (int i = 0; i < abc.length; i++) {
//                    System.out.println(abc[i]);
//                }           
//                System.out.println("");
            //    System.out.println("inten: "+intentos);
            System.out.println("Round "+k);
            if(intentos>=7)System.out.println("You lose.");   
            else if(sol==hangman.length ) System.out.println("You win.");
            else System.out.println("You chickened out.");
                
            }
        
    }
}
