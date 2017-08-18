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
import java.util.Scanner;
import java.util.Stack;

public class Main1069 
    {
    Scanner sc=new Scanner(System.in);
    
    ArrayList<String>lista=new ArrayList<>();
    
    public static void main(String[] args)
        {
        Main1069 m=new Main1069();
        m.read();
        m.run();
        }

    public void read()
        {
        int casos=sc.nextInt();
        for(int i=0;i<casos;i++)
            {
            String str=sc.next();
            lista.add(str);
            }
        }
    
  public void run()
    {
    for(int i=0;i<lista.size();i++)
        {
        //System.out.println(lista.get(i));    
        solve(lista.get(i));
        }
    }
  
    public void solve(String str)
        {
        int cnt=0;  
        Stack s=new Stack();
        for(int i=0;i<str.length();i++)
            {
            char c=str.charAt(i);    
            if(c=='<')
                s.push(i);
            if(c=='>'&&!s.empty())
                {
                s.pop();
                cnt++;
                }
            }
        System.out.println(cnt);
        }
    }
