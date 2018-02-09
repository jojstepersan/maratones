/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithmis;

import java.util.BitSet;
import java.util.Collections;

/**
 *
 * @author jojstepersan
 */
public class BitWise {
    public static void main(String[] args) {
        int s=34;
        System.out.println("2:");
        s=s<<1;//s*2
        System.out.println(s);
        s=s>>2;//s/4
        System.out.println(s);
        s=s>>1;//s/2
        System.out.println(s);
        
        System.out.println("3:");
        s=34;
        int j=3;
        j=1<<j; 
        //OR operation s|=(1<<j)
        System.out.println(j);
        System.out.println(s|j);
        
        System.out.println("4:");
        //check if the j-th item of the set is on
        s=42;
        j=3;
        j=1<<j;
        int t;
        t=s&(j);
        System.out.println(t);
        s=42;
        j=2;
        t=s&(1<<j);
        System.out.println(t);
    
        System.out.println("5:");
        //clear or turn off the j-th item of the set
        //s&=~(1<<j)
        s=42;
        j=1;
        j=~(1<<j);
        s&=j;
        System.out.println("s:"+s);        
    }
}
