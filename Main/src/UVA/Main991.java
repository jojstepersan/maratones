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
 * 991 - Safe Salutations
 */
public class Main991 {
    public static void main(String[] args)throws Exception {
        int n;
        int x[]={1,2,5,14,42,132,429,1430,4862,16796};
        //BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        while(sc.hasNext()){
            if(flag)
                {
                System.out.println("");
                }
            flag=true;
            System.out.println(x[sc.nextInt()-1]);
        }
    }
}
