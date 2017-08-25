/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author stiven
 * 11956 - Brainfuck
 */
public class Main11956 {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int casos=Integer.valueOf(in.readLine());
        int x=1;
        for (int i = 0; i < casos; i++) 
            {
            int[] memory=new int[100];
            int pointer=0;
            String comands=in.readLine();
            for (int j = 0; j < comands.length(); j++)
                {
                char c=comands.charAt(j);
                
                switch(c)
                    {
                    case '+':memory[pointer]++;
                            break;
                    case '-':memory[pointer]--;
                            break;
                    case '<':if(pointer==0)
                                pointer=99;
                            else
                                pointer--;
                            break;
                    case '>':if (pointer==99) 
                                pointer=0;
                             else
                                pointer++;
                            break;
                    case '.':break;
                    default:break;
                    }
                }
            System.out.printf("Case %d:",x++);
            for (int j = 0; j < memory.length; j++)
                {
                String hex=Integer.toHexString(memory[j]).toUpperCase();    
                    
                if(hex.length()==1)
                    System.out.print(" 0"+hex);
                else
                    {
                    System.out.print(" "+hex.charAt(hex.length()-2)+hex.charAt(hex.length()-1));
                    }
                }
            System.out.println("");
    
            }
    }
    
}
/*
1
..++<><<+++>>++++++++++++++++++++++++++>>>+++<+...++<><<+++>>++++++++++++++++++++++++++>>>+++<+...++<><<+++>>++++++++++++++++++++++++++>>>+++<+.
*/