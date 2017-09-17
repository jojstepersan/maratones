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
 *1237 - Expert Enough?
 * @author jojstepersan
 */
public class Main1237 {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int casos=Integer.valueOf(in.readLine());
        for (int i = 0; i < casos; i++)
            {
            long carrosT=Integer.valueOf(in.readLine());
            Carro cars[]=new Carro[(int)carrosT];
            for (int j = 0; j < carrosT; j++)
                {
                StringTokenizer st=new StringTokenizer(in.readLine());
                cars[j]=new Carro(st.nextToken(), Long.valueOf(st.nextToken()), Long.valueOf(st.nextToken()));
                }
            int precios=Integer.valueOf(in.readLine());
            for (int j = 0; j < precios; j++)
                {
                long precio=Long.valueOf(in.readLine());
                int cnt=0,index=0;
                for (int k = 0; k < cars.length; k++)
                    {
                    Carro car=cars[k];
                    if(car.less<=precio&&car.more>=precio)
                        {
                        cnt++;
                        index=k;
                        }
                    }
                if(cnt==1)
                        System.out.println(cars[index].name);
                else
                    System.out.println("UNDETERMINED");
                }
            if(i!=casos-1)
                System.out.println("");
            }
    }
    
}
class Carro
    {
    String name;
    long less;
    long more;

    public Carro(String name, long less, long more) {
        this.name = name;
        this.less = less;
        this.more = more;
    }
    
    }
