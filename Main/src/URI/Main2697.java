/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 * regionals 	2697	Complete Naebbirac’s Sequ...
 * @author jojstepersan
 */
public class Main2697 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s[]=in.readLine().split(" ");
        int n;
        n=Integer.valueOf(s[0]);
        Node aux[]=new Node[n];
        StringTokenizer st=new StringTokenizer(in.readLine());
        for (int i = 0; i < aux.length; i++) {
            aux[i]=new Node();
            aux[i].num=i+1;
            }
        while(st.hasMoreTokens())
            {
            String str=st.nextToken();
            aux[Integer.valueOf(str)-1].cnt++;
            aux[Integer.valueOf(str)-1].num=Long.valueOf(str);//creo que este es el error
            }
        Arrays.sort(aux);
        double prom=0;
        for (int i = 0; i < aux.length; i++) {
            prom+=aux[i].cnt;
        }
        prom/=aux.length;
        boolean flag=false;
        for (int i = 0; i < aux.length; i++) {
            if(Math.abs(prom-aux[i].cnt)>1)
                flag=true;
        }
        int c=0;
        for (int i = 1; i < aux.length; i++) {
            if(aux[i-1].cnt!=aux[i].cnt)
                c++;
                
        }
        if(flag)
            {
            System.out.println("*");
            }
        else
            {
            if(c==1)
                {
                if(aux[0].cnt==aux[aux.length/2].cnt)
                    {
                    System.out.println("-"+aux[aux.length-1].num);
                    }
                else
                    {
                    System.out.println("+"+aux[0].num);
                    }
                }
            else if(c==2)
                {
                aux[0].cnt+=1;
                aux[aux.length-1].cnt-=1;
                double prom1=0;
                for (int i = 0; i < aux.length; i++) {
                        prom1+=aux[i].cnt;
                    }
                prom1/=aux.length;
                if(prom==(int)prom1)
                    {
                    System.out.println("-"+aux[aux.length-1].num+" +"+aux[0].num);
                    }
                }
            else
                System.out.println("*");    
            }
    }
}
class Node implements Comparable<Node>{
    public long cnt=0;
    public long num;
    public Node(){}
    @Override
    public int compareTo(Node n) {
    if(this.cnt>n.cnt)
        return 1;
    if(this.cnt==n.cnt)
        return 0;
    return -1;
    }

}