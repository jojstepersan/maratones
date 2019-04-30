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
 * @author Jojstepersan 514 - Rails
 */
public class Main {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static String result = "";

    public static void main(String[] args) throws Exception {

        String s;
        while (!(s = in.readLine()).equals("0")) {
            int n = Integer.valueOf(s);
            while (!(s = in.readLine()).equals("0")) {
                solve(s, n);
            }

            System.out.println("");
        }
    }

    public static void solve(String s, int n) {

        StringTokenizer st = new StringTokenizer(s);
        result = "";
        int x = Integer.valueOf(st.nextToken());
        Stack<Integer> stack = new Stack<>();
        for (int i = 1; i <= n; i++) {
            if (x == i) {
                result += i+" ";
                if (st.hasMoreTokens()) {
                    x = Integer.valueOf(st.nextToken());
                }
            } else if ( x > i) {
                stack.push(i);
            } else if (x < i) {
                if (!stack.isEmpty() && x == stack.peek()) {
                    result += stack.pop()+" ";
                    stack.push(i);
                } else {
                    break;
                }
            }
        }
        while(!stack.isEmpty())result+=stack.pop()+" ";
        
        result=result.trim();
       // System.out.println(result);
        System.out.println(result.equals(s) ? "Yes" : "No");
    }
}
