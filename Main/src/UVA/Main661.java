/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

/**
 *
 * @author stiven
 * 661 - Blowing Fuses
 */
import java.io.IOException;
import java.util.Scanner;


public class Main661 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int x=1;
        int devices=sc.nextInt(),secuence=sc.nextInt(),fuse=sc.nextInt();
        while(devices!=0&&secuence!=0&&fuse!=0)
            {
            boolean on[]=new boolean[devices];
            int[] dAm=new  int[devices];
            boolean paila=true;
            //System.out.printf("%d %d %d\n",devices,secuence,fuse);
            for (int i = 0; i < devices; i++)
                {
                dAm[i]=sc.nextInt();
                on[i]=false;
              //  System.out.printf("%d %d\n",i,dAm[i]);
                }
            //System.out.println("leydo 1");
            int consumption=0;
            int max=0;
            for (int i = 0; i < secuence; i++)
                {
                int div=sc.nextInt();
                //System.out.println(div);
                if(on[div-1])
                    {
                    on[div-1]=false;
                    consumption-=dAm[div-1];
                    }
                else
                    {
                    on[div-1]=true;
                    max=Math.max(max, consumption+dAm[div-1]);
                    if(max>fuse)
                        {
                        paila=false;
                        }
                    consumption+=dAm[div-1];
                    }
                }
              //  System.out.println("leido 2 "+paila);
            if(max<=fuse)
                System.out.printf("Sequence %d\nFuse was not blown.\nMaximal power consumption was %d amperes.\n\n",x,max);
            if (!paila) {
                System.out.printf("Sequence %d\nFuse was blown.\n\n",x);
                }
            x++;
            devices=sc.nextInt();
            secuence=sc.nextInt();
            fuse=sc.nextInt();
            }
    }
    
}
