/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

/**
 *
 * @author stiven
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Main1110 {

    
    public static void main(String[] args) {
        Queue cola=new LinkedList<Object>();
        ArrayList des=new ArrayList();
        Scanner sc=new Scanner(System.in);
        int caso,c=1;
        while((caso=sc.nextInt())!=0)
            {
            while(c<=caso)
                cola.add(c++);
            while(cola.size()>1){
                des.add(cola.remove());
                cola.add(cola.remove());
                }
            System.out.print("Discarded cards:");
            for (int i = 0; i < des.size(); i++)
                {
                if(i!=des.size()-1) 
                    System.out.print(" "+des.get(i)+",");
                else
                    System.out.print(" "+des.get(i));
                }
            System.out.println("");
            System.out.println("Remaining card: "+cola.peek());
            c=1;
            cola=new LinkedList();
            des=new ArrayList();
            }
        
    }
    
}