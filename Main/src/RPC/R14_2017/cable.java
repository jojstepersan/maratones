
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package RPC.R14_2017;

/**
 *
 * @author jojstepersan
 */
public class cable {
    public static void main(String[] args) throws  Exception{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=in.readLine())!=null)
            {
            long casos=Long.valueOf(s);
            long max=0;
            int x=-1,y=-1;
            for (long i = 0; i < casos; i++) 
                {
                String p[]=in.readLine().split(" ");
                long aux=Long.valueOf(p[0])+Long.valueOf(p[1]);
              //  System.out.println(max+" "+aux);
                if(max<aux)
                    {
                    max=aux;
                    x=Integer.valueOf(p[0]);
                    y=Integer.valueOf(p[1]);
                    }
                }
            
            System.out.println((x+y)*Math.sqrt(2));
            }
    }
  
}
