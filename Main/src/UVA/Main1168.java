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
public class Main1168 {
    Scanner sc=new Scanner(System.in);
    ArrayList<String> list=new ArrayList<>();
    
    public static void main(String[] args) {
        Main1168 m=new Main1168();
        m.read();
        m.run();
    }
    public void read()
        {
        int casos=sc.nextInt();
        for (int i = 0; i < casos; i++)
            {
            String str=sc.next();
            list.add(str);
            }
        }
    
    public void run()
        {
        for (int i = 0; i < list.size(); i++)
            {
            solve(list.get(i));    
            }
        }
    public static void solve(String str)
        {
        int cont=0;    
        for (int i = 0; i < str.length(); i++) 
            {
            char c=str.charAt(i);
            if(c=='1')
                cont+=2;
            else 
                {
                if(c=='7')
                    cont+=3;
                else
                    {
                    if(c=='4')
                        cont+=4;
                    else
                        {
                        if(c=='2'||c=='3'||c=='5')
                            cont+=5;
                        else
                            {
                            if(c=='9'||c=='6'||c=='0')
                                cont+=6;
                            else
                                if(c=='8')
                                    cont+=7;
                            }
                        }
                    }
                        
                }
            }
            System.out.println(cont+" leds");
        }
}
