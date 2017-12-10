/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 *1082	Connected Components
 * @author jojstepersan
 */
public class Main1082 {
    static int v,e;
    static int MAX=1000;
    static ArrayList<Integer> ady[]=new ArrayList[MAX];
    static boolean marked[]=new boolean[MAX];
    //static long distance[]=new long[MAX];
    static  int cnt=0;
    static ArrayList<Character> ans=new ArrayList<>();
    
    public static void main(String[] args) throws IOException {
        int origen,destino, casos;
        
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        casos=Integer.valueOf(in.readLine());
        for (int i = 0; i < casos; i++) {
            StringTokenizer st=new StringTokenizer(in.readLine());
            v=Integer.parseInt(st.nextToken());
            e=Integer.parseInt(st.nextToken());
            init();
            while(e>0)
                {
                st=new StringTokenizer(in.readLine());
                origen=cast(st.nextToken());
                destino=cast(st.nextToken());
                ady[origen].add(destino);
                ady[destino].add(origen);
                e--;
                }
            System.out.printf("Case #%d:\n",i+1); 
            for (int j = 0; j < v; j++) {
                if(!marked[j])
                    {
                    dfs(j);
                    cnt++;
                    Collections.sort(ans);
                    for (int k = 0; k < ans.size(); k++) {
                        System.out.print(ans.get(k)+",");
                        }
                    ans=new ArrayList<>();
                    System.out.println("");
                    }
                }
            System.out.println(cnt+" connected components");
            System.out.println("");
            }
    }
    
    public static void dfs(int s)
        {
        marked[s]=true;
        int i,next;
        ans.add((char)(s+'a'));
        //System.out.print((char)(s+'a')+",");
        for ( i = 0; i < ady[s].size(); i++) {
            next=ady[s].get(i);
            if(!marked[next])
                {
                dfs(next);
                }
            }
        }
    
    
    public static int cast(String s)
        {
        switch(s) {
            case "a":return 0;
            case "b":return 1;
            case "c":return 2;
            case "d":return 3;
            case "e":return 4;
            case "f":return 5;
            case "g":return 6;
            case "h":return 7;
            case "i":return 8;
            case "j":return 9;
            case "k":return 10;
            case "l":return 11;
            case "m":return 12;
            case "n":return 13;
            case "o":return 14;
            case "p":return 15;
            case "q":return 16;
            case "r":return 17;
            case "s":return 18;
            case "t":return 19;
            case "u":return 20;
            case "v":return 21;
            case "w":return 22;
            case "x":return 23;
            case "y":return 24;
            case "z":return 25;
         
                default:
                    return -1;
            }
        }

    private static void init() {
        int i;
        for ( i = 0; i < v; i++) {
            ady[i]=new ArrayList<>();
            marked[i]=false;
     //       distance[i]=-1;
        }
        cnt=0;
        
    }
}