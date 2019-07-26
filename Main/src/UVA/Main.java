/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jojstepersan 
 */
public class Main {
    
    static BufferedReader in=new  BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args)throws Exception {
        String s;
        while((s=in.readLine())!=null){
            int t=Integer.valueOf(s);
            List<Player> players=new ArrayList<>();
            for (int i = 0; i < t; i++) {
            String arr[]=in.readLine().split(";");
            }
            
            
        }
    
    }
    
}
class Player implements Comparable<Player> {

    Integer score;
    String name;

    public Player(int score, String name) {
        this.score = score;
        this.name = name;
    }

    @Override
    public int compareTo(Player o) {
        int c=this.score.compareTo(o.score)*-1;
        if(c==0)
            c=this.name.compareTo(o.name);
        return  c;        
    }

    @Override
    public String toString() {
        return name+" "+score; //To change body of generated methods, choose Tools | Templates.
    }
    
}
