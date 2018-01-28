/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmis;

/**
 *
 * @author jojstepersan
 */

public class InsertionSort {
    static int array[];//array de numero desordenados
    
    public static void main(String[] args) {
        //inicializar array
        array=new int[6];
        array[0]=5;
        array[1]=2;
        array[2]=4;
        array[3]=6;
        array[4]=1;
        array[5]=3;
        for (int i = 0; i <array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
        sort();// ordenar array
        //mostrar array ordenado
        for (int i = 0; i <array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    
    public static void sort()
        {
        int key;// auxiliar donde se guarada el elemento a cambiar
        int i;
        for (int j = 1; j < array.length; j++) {
            key=array[j];
            i=j-1;
            //corriemientos
            while(i>=0 && array[i]>key)
                {
                array[i+1]=array[i];
                i--;
                }
            array[i+1]=key;
            }
        }
}

/*
Input: A sequence of n numbers ha 1 ; a 2 ; : : : ; a n i.
Output: A permutation (reordering) ha 1 0 ; a 2 0 ; : : : ; a n 0 i of the input sequence such
that a 1 0  a 2 0      a n 0 .

Este algoritmo es eficiente para pequeñas cantidades de numeros o un conjunto de
numeros limitado

*/