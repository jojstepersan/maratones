/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liveArchives;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *7783	Which Base is it Anyway?
 * @author jojstepersan
 */
public class Main7783 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader in=new BufferedReader(new  InputStreamReader(System.in));
        long t=Long.parseLong(in.readLine());
        
        for (int i = 0; i < t; i++)
            {
            StringTokenizer st=new StringTokenizer(in.readLine());
            st.nextToken();
            String k=(st.nextToken());
            // System.out.printf("%d %d %s %d\n",i+1,Integer.parseInt(k,8),k,Integer.parseInt(k,16));
            System.out.print(i+1+" ");
            try{
                System.out.print(Integer.parseInt(k,8)+" ");
            }
            catch(Exception e)
                {
                System.out.print(0+" ");
                }
             try{
                System.out.print(Integer.parseInt(k,10)+" ");
            }
            catch(Exception e)
                {
                System.out.print(0+" ");
                }
              try{
                System.out.print(Integer.parseInt(k,16));
            }
            catch(Exception e)
                {
                    System.out.print(0);
                }
                System.out.println("");
            }
    }
    
}
