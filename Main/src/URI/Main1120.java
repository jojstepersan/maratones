/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 *
 * @author stiven
 */
public class Main1120 {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while(!(s=in.readLine()).equals("0 0"))
            {
            StringTokenizer st=new StringTokenizer(s);
            String st1=st.nextToken();
            String st2=st.nextToken();
            String aux="";
            for (int i = 0; i < st2.length(); i++) {
                if(st1.charAt(0)!=st2.charAt(i))
                    aux+=st2.charAt(i);
                }
            if(aux.equals(""))
                    System.out.println("0");
            else
            System.out.println(new BigInteger(aux));
            }
    }
   
}
