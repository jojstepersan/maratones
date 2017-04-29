/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Stiven
 */
public class Main1190 {
 
    double[][] mat=new double[12][12];
    Scanner sc=new  Scanner(System.in);
    String s;
    double answer=0;
    public void read()
        {
        s=sc.next();
        for (int i = 0; i < 12; i++) 
            {
            for (int j = 0; j < 12; j++) 
                {
                mat[i][j]=sc.nextDouble();
                }
            }
        }
    
    public void solve()
        {
//        for (int i = 0; i < 12; i++) {
//            for (int j = 0; j <12 ; j++) {
//                
//                System.out.print(mat[i][j]+"\t ");
//            }
//            System.out.println("");
//            }
        switch(s.charAt(0))
            {
            case 'S':suma();
                    break;
            case 'M':media();
                    break;
            }
        System.out.println(answer);
        }
    
    public void suma()
        {
        for (int i = 1; i <=5; i++) 
            {
            for (int j = 11; j > mat.length-i-1; j--) 
                {
                answer+=mat[i][j]+mat[mat.length-1-i][j];
                    //System.out.print(mat[i][j]+":"+mat[mat.length-1-i][j]+"\t");
                }
                //System.out.println("");
            }
        
        }
    
    public void media()
        {
        suma();
        answer/=30;
        }
    
    public static void main(String[] args) {
        Main1190 m=new Main1190();
        m.read();
        m.solve();
    }
    }
