/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.util.ArrayList;
import java.util.Scanner;


public class Main1240 {
Scanner sc=new Scanner(System.in);
ArrayList<String[]> list=new ArrayList<>();
    public static void main(String[] args) {
        Main1240 m=new Main1240();
        m.read();
        m.run();
    }
public void read()
    {
    int casos=sc.nextInt();
        for (int i = 0; i <casos; i++) {
            String[] aux=new String[2];
            aux[0]=sc.next();
            aux[1]=sc.next();
            list.add(aux);
        }
    }
public void run()
    {
        for (int i = 0; i < list.size(); i++) {
            solve(list.get(i));
        }
    }
public static void solve(String[] str)
    {
    String aux;
    int dif=str[0].length()-str[1].length();
    if(dif>=0)
        {
        aux=str[0].substring(dif); 
         if(aux.equals(str[1]))
            System.out.println("encaixa");
        else
            System.out.println("nao encaixa");
        }
    else
        System.out.println("nao encaixa");
    }
        
}
