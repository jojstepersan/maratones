/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UVA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


/**
 *
 * @author Stiven
 */

public class Main1030 {
    Scanner sc=new Scanner(System.in);
    ArrayList<Integer[]> list=new ArrayList<>();
    public static void main(String[] args) {
        Main1030 m=new Main1030();
        m.read();
        m.run();
                
    }
    public void read()
        {
        int casos=sc.nextInt();
        for (int i = 0; i < casos; i++)
            {
            Integer[] aux=new Integer[2];
            aux[0]=sc.nextInt();
            aux[1]=sc.nextInt();
            list.add(aux);
            }
        }
    
    public void run()
        {
            for (int i = 0; i < list.size(); i++) {
                System.out.println("Case "+(i+1)+": "+solve(list.get(i)));
            }
    
        }
    
    public static int solve(Integer[] arr)
        {    
        Queue<Integer> cola=new LinkedList<>();
        for(int i=0;i<arr[0];i++)
            cola.add(i+1);
        while(cola.size()>1)
            {
            for(int i=0;i<arr[1]-1;i++)
                {
                cola.add(cola.poll());
                }
            cola.poll();
            }
            return cola.peek();
        }
}
