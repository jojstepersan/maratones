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

public class MainCandleBox {
    
    
    Scanner sc=new Scanner(System.in);
    public void read()
        {
        while(sc.hasNext())
            {
            Integer[] aux=new  Integer[3];
            aux[0]=sc.nextInt();
            aux[1]=sc.nextInt();
            aux[2]=sc.nextInt();
            solve(aux);
            }
        }
    
    public static void solve(Integer[] arr)
        {
        int vr;
        int vt;
        int edadR=4;
        int edadt=edadR-arr[0];
        do{
            vr=velasR(edadR++);
            vt=velasT(edadt++);
            }while((vr+vt)!=(arr[1]+arr[2]));
        System.out.println(arr[1]-vr);
        }
    public static int velasR(int edad)
        {
        return edad*(edad+1)/2-6;        
        }
    
    public static int velasT(int edad)
        {
        return edad*(edad+1)/2-3;
        }
    public static void main(String[] args) {
        MainCandleBox c=new MainCandleBox();
        c.read();
        
    }
}
