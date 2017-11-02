/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liveArchives;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 7786 - A Rational Sequence (Take 3)
 * @author jojstepersan
 */
public class Main7786 {
    static ArrayList<Tree> arr=new ArrayList<>();
    public static void main(String[] args) {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println(Long.MAX_VALUE+": max value");
        calculateTree();
        int k=1;
        //System.out.println(arr.get(0));
        for (int i = 0; i <arr.size(); i++) {
            if(i==Math.pow(2, k)-1)
                {
                k++;
                System.out.println("");
                }
            System.out.print(arr.get(i)+ " ");
            
            
        }
        System.out.println("fin");
    }
    public static void calculateTree()
        {
        Queue<Tree> cola=new LinkedList<>();
        long p=1,q=1;    
        arr.add(new Tree(p,q));
        cola.add(arr.get(0));
        boolean flag=true;//si true entonces left else right
        Tree aux=cola.remove();
        for (int i = 1; i <Math.pow(2, 10)-1; i++) {
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
