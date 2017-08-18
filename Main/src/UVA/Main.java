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
 * @author jojstepersan
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=in.readLine())!=null)
            {
            int casos=Integer.valueOf(s);
            String[] friends=new String[casos];
            int money[]=new int[casos];
            friends=in.readLine().split(" ");
            for (int i = 0; i < casos; i++)
                {
                StringTokenizer st=new StringTokenizer(in.readLine());
                st.nextToken();
                int moneyTG=Integer.valueOf(st.nextToken());
                int hm=Integer.valueOf(st.nextToken());
                System.out.println(moneyTG+" "+hm);
                if(hm!=0||moneyTG!=0)
                    {
                    money[i]-=(moneyTG/hm)*hm;    
                    for (int j = 0; j < hm; j++)
                        {
                        String friend=st.nextToken();
                        for (int k = 0; k < friends.length; k++)
                            {
                            if(friends[k].equals(friend))
                                {
                                money[k]+=moneyTG/hm;
                                System.out.println(friend+" "+moneyTG/hm);
                                }
                            }
    
                        }
                    }
                else
                {money[i]+=moneyTG;
                    System.out.println("else "+money[i]);
                }
                }
            for (int j = 0; j < friends.length; j++)
                System.out.println(friends[j]+" "+money[j]);      
            System.out.println("");
                
            }
    }
}
