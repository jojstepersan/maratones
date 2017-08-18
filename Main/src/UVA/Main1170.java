/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Stiven
 */
public class Main1170 {
   Scanner sc=new Scanner(System.in);
   ArrayList<Double> list=new ArrayList<>();
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Main1170 m=new Main1170();
    m.read();
    m.run();
    }
    
    public void read()
        {
        int casos=sc.nextInt();
        for(int i=0;i<casos;i++)
            {
            list.add(sc.nextDouble());
            }
        }
    public void run()
        {
            for (int i = 0; i < list.size(); i++) {
                solve(list.get(i));
            }
   
        }
    
    public static void solve(double suply)
        {
        double half=2.0;
        int days=0;
        while(suply>1)
            {
            suply/=half;
            days++;
            }
        System.out.println(days+" dias");
        }
}
