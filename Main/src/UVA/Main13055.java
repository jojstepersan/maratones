/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 *
 * @author Jojstepersan
 * 13055 - Inception
 */
public class Main13055 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static long y, x, d;

    public static void main(String[] args) throws Exception {

        int t = Integer.valueOf(in.readLine());
        Stack<String> dream=new Stack<>();
        for (int i = 0; i < t; i++) {
            String s = in.readLine();
            if(s.contains("Sleep")){
                st=new StringTokenizer(s);
                st.nextToken();
                dream.push(st.nextToken());
            }else if(s.equals("Test")){
                if(!dream.isEmpty())System.out.println(dream.peek());
                else System.out.println("Not in a dream");
            }else if(s.equals("Kick")){
                if(!dream.isEmpty())dream.pop();
            }
        }
    }
}
