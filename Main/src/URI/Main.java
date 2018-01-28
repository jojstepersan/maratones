/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author jojstepersan
 */

public class Main {
    public static void main(String[] args)throws Exception {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int cases=Integer.valueOf(in.readLine());
        for (int i = 0; i < cases; i++) {
            String str1,str2;
            str1=in.readLine();
            str2=in.readLine();
            int min=Math.min(str2.length(), str1.length());
            String answer="";
            for (int j = 0; j < min; j+=2){
                try{
                answer+=str1.subSequence(j,j+2);
                }catch(Exception e)
                    {
                    answer+=str1.subSequence(j,j+1);
                    }
                 try{
                answer+=str2.subSequence(j,j+2);
                }catch(Exception e)
                    {
                    answer+=str2.subSequence(j,j+1);
                    }
            }
            try{
                answer+=str1.subSequence(min, str1.length());
                }catch(Exception e){}
            
            try{
                answer+=str2.subSequence(min, str2.length());
                }catch(Exception e){}
            System.out.println(answer);
        }
    }
}
