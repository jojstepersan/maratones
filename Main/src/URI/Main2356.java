/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.util.Scanner;

/**
 *
 * @author stiven
 */
public class Main2356 {
    public static void main(String[] args)
        {
        Scanner sc=new  Scanner(System.in);
        while(sc.hasNext())
            {
            String s=sc.next();
            String d=sc.next();
            if(s.contains(d))
                System.out.println("Resistente");
            else
                System.out.println("Nao resistente");
            }
        }
 
}
