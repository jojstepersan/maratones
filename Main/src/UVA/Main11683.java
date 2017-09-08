/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author stiven
 * 11683 - Laser Sculpture
 */
public class Main11683 {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while(!(s=in.readLine()).equals("0 0"))
            {
            StringTokenizer st=new StringTokenizer(s);
            int x=0,a=Integer.valueOf(st.nextToken()),c=Integer.valueOf(st.nextToken());
            StringTokenizer st2=new StringTokenizer(in.readLine());
            int alturas[]=new int[c];
            while(st2.hasMoreTokens())
                alturas[x++]=Integer.valueOf(st2.nextToken());
            int cnt=a-alturas[0];
            for (int i = 1; i < c; i++)
                {
                if(alturas[i]<alturas[i-1])
                    {
                    cnt+=alturas[i-1]-alturas[i];
                    }
                }
            System.out.println(cnt);
            }
    }
}
