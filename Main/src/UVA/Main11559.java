/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.util.Scanner;

/**
 *
 * @author jojstepersan
 */
public class Main11559 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
            {
            long integrantes,presupuesto,hoteles,semanas,minimo=Long.MAX_VALUE,aux;
            boolean ir=false;
            integrantes=sc.nextLong();
            presupuesto=sc.nextLong();
            hoteles=sc.nextLong();
            semanas=sc.nextLong();
            for (int i = 0; i < hoteles; i++)
                { 
                long precio=sc.nextLong();
                boolean cupos=true;
                for (int j = 0; j < semanas; j++)
                    {
                    if(integrantes>sc.nextLong())
                        cupos=false;
                    }
                if(cupos)
                    {
                    aux=precio*integrantes;
                    if(aux<=presupuesto)
                        { 
                        ir=true;
                        if(aux<=minimo)
                            minimo=aux;
                        }
                    }
                }
            if(ir)
                System.out.println(minimo);
            else
                System.out.println("stay home");
 
            }
    }
}
/*
3 1000 2 3
200
3 3 3
300
27 3 20
5 2000 2 4
300
4 3 0 4
50
7 8 6 13

*/