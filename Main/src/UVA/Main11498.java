/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.util.Arrays;
import java.util.Scanner;

public class Main11498 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int casos=sc.nextInt();
        for (int i = 0; i < casos; i++)
            {
            int[] lugares=new int[sc.nextInt()];
            for(int j=0;j<lugares.length;j++)
                lugares[j]=sc.nextInt();
            Arrays.sort(lugares);
            System.out.println(2*(lugares[lugares.length-1]-lugares[0]));
            }
    }
}
