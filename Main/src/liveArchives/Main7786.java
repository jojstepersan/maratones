/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liveArchives;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 7786 - A Rational Sequence (Take 3)
 * @author jojstepersan
 */
public class Main7786 {
    static ArrayList<Tree> arr=new ArrayList<>();
    static int[][] mat;
    public static void main(String[] args) {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
       // System.out.println(Long.MAX_VALUE+": max value");
       //calculateTree();
        
       calculateTree();
        System.out.println("fin");
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat[i].length; j++) {
//                System.out.print(mat[i][j]+" ");
//            }
//            System.out.println("");
//        }
        int k=0;
        //System.out.println(arr.get(0));
        for (int i = 0; i <arr.size(); i++) {
            if(i==Math.pow(2, k)-1)
                {
                k++;
                System.out.println("");
                }
            System.out.print(arr.get(i)+ "\t");
            
            
        }
        
        System.out.println("\nfin");
        //System.out.println("P: "+BigInteger.valueOf((long) (Math.pow(2, 27)-1)));
    }
    
    public static void calculateTree2()
        {
        Queue<Integer> qq=new LinkedList<>();
        mat=new int[5][];
        mat[0]=new int[1];
        mat[0][0]=1;
        mat[1]=new int[2];
        mat[1][0]=1;
        mat[1][1]=2;
        for (int i = 2; i < mat.length; i++) {
            mat[i]=new int[(int)Math.pow(2,i-1)+1];
            qq.add(1);
            System.out.println("lenght: "+mat[i-1].length);
            for (int j = 1; j <mat[i-1].length; j++) {
                int a,b;
                a=mat[i-1][j];
                b=mat[i-1][j-1];
                qq.add(a+b);
                qq.add(a);
                }
            System.out.println(qq);
            for (int j = 0; j < qq.size(); j++) {
                mat[i][j]=qq.remove();
            }
            
    
            }
        }
    public static void calculateTree()
        {
        Queue<Tree> cola=new LinkedList<>();
        long p=1,q=2;    
        arr.add(new Tree(p,q));
        cola.add(arr.get(0));
        boolean flag=true;//si true entonces left else right
        Tree aux=cola.remove();
        for (int i = 1; i <Math.pow(2, 12)-1; i++) {
            if(flag)
                {
                arr.add(i,new Tree(aux.p, aux.p+aux.q));
                cola.add(arr.get(i));
                flag=false;
                }
            else
                {
                arr.add(i,new Tree(aux.p+aux.q, aux.q));
                cola.add(arr.get(i));
                aux=cola.remove();
                flag=true;
                }
           // System.out.println(arr.get(i));
            }
        }
}
class Tree
    {
    public long p,q;
    
    public Tree(long p,long q)
        {
        this.p=p;
        this.q=q;
        }
    
    @Override
    public String toString()
        {
        return p+"/"+q;
        }
    }
