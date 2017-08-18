/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.util.Scanner;


public class Main2218 {

    public static void main(String[] args) {
        Main2218 m=new Main2218();
        m.read();
    }
    Scanner sc=new Scanner(System.in);
    
    public  void read()
        {
        int casos=sc.nextInt();
        for (int i = 0; i < casos; i++) {
            solve(sc.nextInt());
            }
        }
    
    public static void solve(int x)
        {
        int c=2;
        long sol=c;
        for(int i=1;i<x;i++)
            {
            sol+=c++;
            }
        System.out.println(sol);
        }
}
