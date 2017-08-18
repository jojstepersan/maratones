/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

/**
 *
 * @author Stiven
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Mainfrecuencia {
    
    Scanner sc=new Scanner(System.in);

    public void read()
        {
        while(sc.hasNextLine())
            {
            solve(sc.next());   
            }
        }

    public static void main(String[] args) {
        Mainfrecuencia m=new Mainfrecuencia();
        m.read();
    }
    
    public static void  solve(String line)
        {
        char[] aux=line.toCharArray();
        Arrays.sort(aux);
        int c=1;
        ArrayList<String> list=new ArrayList<>();
        if(aux.length==1)
            {
            System.out.println((int)line.charAt(0)+" "+1);
            System.out.println("");
            }
        else
            {
            for(int i=1;i<aux.length;i++)
                {
                if(aux[i-1]==aux[i])
                    {
                    c++;
                    if(i==aux.length-1)
                        {
                        list.add(c+" "+(char)aux[i]);
                        }
                    }
                else
                    {
                    if(i==aux.length-1&&aux[aux.length-1]!=aux[aux.length-2])
                        list.add(1+" "+aux[aux.length-1]);
                    list.add(c+" "+aux[i-1]);
                    c=1;
                    }
                }
            System.out.println(list);
            String[] strAux=new String[list.size()];
                for (int i = 0; i < list.size(); i++) {
                    strAux[i]=list.get(i);
                    System.out.println(strAux[i]);
                }
            Arrays.sort(strAux);
            ordenar(strAux);
           }
        }
    
    public static void ordenar(String[] arr)
        {
        Stack<String[]> s=new Stack();
        s.push(arr[0].split(" "));
        for (int i = 1; i < arr.length; i++)
            {    
            String[] s1=arr[i-1].split(" ");
            String[] s2=arr[i].split(" ");
            //System.out.println(s1[1]+" "+s1[0]);
            //System.out.println(s2[1]+" "+s2[0]);
            if(s1[0].equals(s2[0]))
                {
                s.push(s2);
                if(i==arr.length-1){
                    System.out.println((int)s2[1].charAt(0)+" "+s2[0]);
                    System.out.println((int)s1[1].charAt(0)+" "+s1[0]);
                    }
                }
            else
                {
                do
                    {
                    String[] arrs=s.pop();   
                    System.out.println((int)arrs[1].charAt(0)+" "+arrs[0]);
                    }while(!s.isEmpty());
                if(i==arr.length-1)
                    System.out.println((int)s2[1].charAt(0)+" "+s2[0]);
                s.push(s2);
                }
            }
            System.out.println("");
        }
}
