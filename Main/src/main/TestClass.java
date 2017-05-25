/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author Stiven
 */
public class TestClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int colums=sc.nextInt();
        int mat[][]=new int[row][colums];
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < colums; j++) {
                mat[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < colums; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(mat[j][i]+" ");
            }
            System.out.println("");
        }
        
    }
}
