/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Scanner;


public class Main1221 {
    Scanner sc=new Scanner(System.in);
    ArrayList<Long> list=new ArrayList<>();
    public static void main(String[] args) {
        Main1221 m=new Main1221();
        m.read();
        m.run();
        
    }
    public void read()
        {
         int casos=sc.nextInt();
            for (int i = 0; i < casos; i++)
                {
                list.add(sc.nextLong());
                }
        }
    public void run()
        {
            for (int i = 0; i < list.size(); i++) {
                solve(list.get(i));
            }
        }
    
    public static void solve(long l)
        {
        int c=2;
        for (int i=2; i < l; i++) 
            {
            if(l%i==0)
                {
                c++;
                break;
                }
            }
        if(c==2)
                System.out.println("Prime");
        else
                System.out.println("Not Prime");
        }
}