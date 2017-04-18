/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import java.util.Scanner;
import java.util.Stack;
public class Main1068 
    {
    InputStreamReader ir=new InputStreamReader(System.in);
    BufferedReader in=new BufferedReader(ir);
    Scanner sc=new Scanner(System.in);
    public void read() throws IOException
        {
        while(!in.ready())
            {
            System.out.println(solve(sc.next()));
            }
        
        }
    public static void main(String[] args) throws IOException {
        Main1068 m=new Main1068();
        m.read();
    }
    
    public static String solve(String str)
        {
        Stack stack=new Stack();
        for (int i = 0; i < str.length(); i++) 
            {
            if(str.charAt(i)=='(')
                stack.push(i);
            else if(str.charAt(i)==')'&&!stack.empty())
                stack.pop();
                else if(str.charAt(i)==')'&&stack.isEmpty())
                    {
                    return ("incorrect");    
                    }
            }
        if(stack.isEmpty())
            return ("correct");
        else
            return ("incorrect");
        }
    }
