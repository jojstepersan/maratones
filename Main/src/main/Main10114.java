/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author jojstepersan
 */
public class Main10114 {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=in.readLine())!=null) 
            {            
            StringTokenizer st=new StringTokenizer(s);
            int duration=Integer.valueOf(st.nextToken());
            if(duration<0)
                break;
            double downPayment=Double.parseDouble(st.nextToken());
            double loanAmount=Double.parseDouble(st.nextToken());
            int dpmn=Integer.parseInt(st.nextToken());
            double[] values=new double[duration+1];
            for (int i = 0; i <dpmn; i++)
                {
                st=new StringTokenizer(in.readLine());
                int month=Integer.parseInt(st.nextToken());
                double rate=1-Double.parseDouble(st.nextToken());
                for (int j = month; j < values.length; j++) 
                    values[j]=rate;   
                }
            double monthlyPayment=loanAmount/duration;
            double owe=loanAmount;
            double carValue=(loanAmount+downPayment)*values[0];
            int month=1;
            while(owe>carValue && month<values.length)
                {
                owe-=monthlyPayment;
                carValue*=values[month];
                month++;
                }
            month--;
            if(month==1)
                System.out.println("1 month");
            else
                System.out.println(month+" months");
            }
    }
}
