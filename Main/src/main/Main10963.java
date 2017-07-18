/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *10963 - The Swallowing Ground
 * @author jojstepersan
 */
public class Main10963 {
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
            Long cases=sc.nextLong();
            for (int i = 0; i < cases; i++)
                {
                Long rows=sc.nextLong();
                boolean flag=true;
                long dif = Math.abs(sc.nextLong()-sc.nextLong());
                long difAux=dif;
                for (int j = 1; j < rows; j++) 
                    {
                    dif=Math.abs(sc.nextLong()-sc.nextLong());
                    if(dif!=difAux)
                        {
                        flag=false;
                        }
                    }
                if(flag)
                    System.out.println("yes");
                else
                    System.out.println("no");
                if(i!=cases-1)
                    System.out.println("");
            }
    }
}
/*

3

5
2 1
0 -1
1 0
1 0
2 1

5
2 1
0 -1
1 -1
1 0
2 1

5
3 1
0 -1
1 0
1 0
1 0
*/