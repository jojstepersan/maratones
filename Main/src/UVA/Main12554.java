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
 * @author jojstepersan
 */
public class Main12554 {
    public static void main(String[] args) throws IOException {
        String[] happy={"Happy","birthday","to","you","Happy","birthday","to","you","Happy","birthday","to","Rujia","Happy","birthday","to","you"};
        String[] people;
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int cases=Integer.valueOf(in.readLine());
        people=new String[cases];
        for (int i = 0; i < cases; i++)
            people[i]=in.readLine();
        int max;
        if(happy.length>people.length)
            max=happy.length;
        else
            {
            int c=1,auxp=people.length;
            while(auxp>happy.length)
                {
                auxp-=happy.length;
                c++;
                }
            max=happy.length*c;
            }
        for(int i=0;i<max;i++)
            System.out.println(people[i%people.length]+": "+happy[i%happy.length]);
            
        
    }
}
