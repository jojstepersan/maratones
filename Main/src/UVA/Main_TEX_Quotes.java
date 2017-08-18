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
public class Main_TEX_Quotes {
Scanner sc=new Scanner(System.in);
boolean flag=true;
public void read()
    {
    while(sc.hasNext())
        {
        solve(sc.nextLine());
        }
    }
    public void solve(String str)
        {
        for(int i=0;i<str.length();i++)
            {
            char c=str.charAt(i);   
            if(c=='"'&&flag)
                {
                System.out.print("``");
                flag=false;
                }
            else
                {
                if(c=='"'&&!flag)
                    {
                    System.out.print("''");
                    flag=true;
                    }
                else
                    System.out.print(c);
                }
            
            }
        System.out.println("");
        }
    public static void main(String[] args) {
        Main_TEX_Quotes m=new Main_TEX_Quotes();
        m.read();
    }
}
