/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

public class MainCarry {

    Scanner sc=new Scanner(System.in);
    public void resd()
        {
        long x,y;
        do{
           x=sc.nextLong();
           y=sc.nextLong();
           if(x!=0||y!=0)
                solve(x,y);
            }while(x!=0||y!=0);
        }
    public static void main(String[] args) {
        MainCarry m=new MainCarry();
        m.resd();
    }
    
    public static void solve(long x,long y)
        {
        int c=0,i=0;
        boolean flag=false;
        while(x!=0&&y!=0)
            {
            if(flag)
                {
                if(x%10+y%10+1>9)
                    c++;
                flag=true;
                }
            else if(x%10+y%10>9)
                    {
                    c++;
                    flag=true;
                    }
                 else   
                    flag=false;
            x/=10;
            y/=10;
            }
            long aux=0;
            if(x>0)
               aux=x;
            else if(y>0)
                aux=y;
            while(flag)
                {                    
                if(aux%10+1>9)
                    c++;
                else
                    flag=false;
                aux/=10;
                }
            if(c>0)
                {
                if(c==1)
                     System.out.println(c+" carry operation.");
                else
                    System.out.println(c+" carry operations.");
                }
            else
                System.out.println("No carry operation.");
        }
}
