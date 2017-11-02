
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jojstepersan
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s=in.readLine();
        StringTokenizer st=new StringTokenizer(s);
        long n,m,a;
        n=Long.parseLong(st.nextToken());
        m=Long.parseLong(st.nextToken());
        a=Long.parseLong(st.nextToken());
        System.out.println(n/a+m/a);
    }
    
}
