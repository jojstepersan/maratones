/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;


public class Main {
Scanner sc=new Scanner(System.in);

public void read()
    {
    int c=-1;
    while(c!=0)
        {
        c=sc.nextInt();
        if(c==0)
            break;
        int[] arr=new int[c];
        for (int i = 0; i < c; i++) 
           arr[i]=(sc.nextInt());
        solve(arr);
        }
    }
    public static void main(String[] args) {
        Main m=new Main();
        m.read();
    }
    public static void solve(int[] arr)
        {
        int c=0,p=0;
        if(arr[0]==0&&arr[0]==arr[arr.length-1])
            {    
            p++;    
            for(int i=1;i<arr.length-1;i++)
                {
                if(arr[i]==0)
                    c++;
                else
                    c=0;
                if(c==2)
                    {
                    p++;
                    c=0;
                    }
                }
            }
        else
            {    
            for(int i=0;i<arr.length;i++)
                {
                if(arr[i]==0)
                    c++;
                else
                    c=0;
                if(c==2)
                    {
                    p++;
                    c=0;
                    }
                }
            }
        System.out.println(p);
        }
}
