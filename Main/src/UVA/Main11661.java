/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

/**
 *
 * @author stiven
 * 11661 - Burger Time?
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11661 {

    public static void main(String[] args) throws IOException {
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        String caso;
        while(!(caso=in.readLine()).equals("0"))
            {
            String s=in.readLine();
            if(s.contains("Z"))
                System.out.println("0");
            else
                {
                int min=Integer.MAX_VALUE;
                int cnt=1;
                boolean flag=false;
                char c=' ';
                for (int i = 0; i < s.length(); i++) 
                    {
                    char caux=s.charAt(i);
                    if(!flag&&(caux=='R'||caux=='D'))
                        {
                        c=caux;
                        flag=true;
                        cnt=1;
                        }
                    else if(caux=='R') 
                        {
                        if(c=='R')
                            cnt=1;
                        else
                            {
                            min=Math.min(min, cnt);
                            c=caux;
                            cnt=1;
                            }
                        }
                    else if(caux=='D')
                        {
                        if(c=='D')
                            cnt=1;
                        else
                            {
                            min=Math.min(min, cnt);
                            c=caux;
                            cnt=1;
                            }
                        }
                    else if(caux=='.')
                        cnt++;
                    }
                System.out.println(min);
                }
            }
    }
    
}