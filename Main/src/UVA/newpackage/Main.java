/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA.newpackage;

import UVA.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 *
 * @author jojstepersan
 */
public class Main {
    
    static  int v,e;
    static ArrayList<Node> ady[];
    static boolean marked[];
    static int rta;
    static PriorityQueue<Node> pq;
    
    public static void main(String[] args)throws Exception {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while(!(s=in.readLine()).equals("0 0")){
            StringTokenizer st=new StringTokenizer(s.trim());
            v=Integer.valueOf(st.nextToken());
            e=Integer.valueOf(st.nextToken());
            init();
            for (int i = 0; i < e; i++) {
                st=new StringTokenizer(in.readLine().trim());
                int ori,des,cost;
                ori=Integer.valueOf(st.nextToken());
                des=Integer.valueOf(st.nextToken());
                cost=Integer.valueOf(st.nextToken());
                ady[ori].add(new Node(des, cost));
                ady[des].add(new Node(ori, cost));
                
            }
            if(e==0)System.out.println("IMPOSSIBLE");
            else{
                prim();
                System.out.println(rta);
            }
            
        }
    }
    
    static  void init(){
        ady=new ArrayList[v];
        marked=new boolean[v];
        for (int i = 0; i < v; i++) {
            ady[i]=new ArrayList<>();
            marked[i]=false;
        }
        pq=new PriorityQueue<>();
        rta=0;
    }
    
    
    static void process(int u){
        marked[u]=true;
        for (int i = 0; i < ady[u].size(); i++) {
            Node n=ady[u].get(i);
            if(!marked[n.adjacent]){
                pq.add(n);
            }
        }
    
    }
    
    static void prim(){
        process(0);
        while(!pq.isEmpty()){
            Node n=pq.poll();
            if(!marked[n.adjacent]){
                rta+=n.cost;
                process(n.adjacent);
            }
        }
    }
}
class Node implements Comparable<Node>{
    Integer cost,adjacent;

    public Node( Integer adjacent,Integer cost) {
        this.cost = cost;
        this.adjacent = adjacent;
    }

    @Override
    public int compareTo(Node t) {
        return this.cost.compareTo(t.cost);
    }
}
