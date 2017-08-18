/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Stiven
 */
public class Main1234 {
    ArrayList<String> list=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        Main1234 m=new Main1234();
        m.read();
        m.run();
    }
    public void read()
        {
        while(sc.hasNext())
            {
            list.add(sc.nextLine());
            }
        }
    public void run()
        {
            for (int i = 0; i < list.size(); i++) {
                solve(list.get(i));
            }
        }
    
    public  static void solve(String str)
        {
        String solve="";
        boolean flag=true;
        for(int i=0;i<str.length();i++)
            {
            if(str.charAt(i)!=' ')
                {
                String c=str.charAt(i)+"";    
                if(flag)
                    {
                    solve+=c.toUpperCase();
                    flag=false;
                    }
                else
                    {
                    solve+=c.toLowerCase();
                    flag=true;
                    }
                }
            else
                solve+=" ";
            }
        System.out.println(solve);
        }
}
