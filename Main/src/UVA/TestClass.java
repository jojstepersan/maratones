/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Stiven
 */
public class TestClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger numero=new BigInteger(sc.next());
        int n[]=new int[10];
        while(!numero.equals(BigInteger.ZERO))
            {
            int m=Integer.valueOf(numero.mod(BigInteger.valueOf(10)).toString());
            switch (m) {
                case 0:
                    n[0]++;
                    break;
                case 1:
                    n[1]++;
                    break;
                case 2:
                    n[2]++;
                    break;
                case 3:
                    n[3]++;
                    break;
                case 4:
                    n[4]++;
                    break;
                case 5:
                    n[5]++;
                    break;
                case 6:
                    n[6]++;
                    break;
                case 7:
                    n[7]++;
                    break;
                case 8:
                    n[8]++;
                    break;
                case 9:
                    n[9]++;
                    break;
                default:
                    break;
            }
            numero=numero.divide(new BigInteger("10"));
            }
        for (int i = 0; i < 10; i++) {
            System.out.println(i+" "+n[i]);
        }
    }
}
