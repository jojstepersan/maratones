/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 	1066	Even, Odd, Positive and N...
 * @author jojstepersan
 */
public class Main1066 {
    public static void main(String[] args) throws Exception{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        long arr[]=new long[5];
        for (int i = 0; i < 5; i++) {
            arr[i]=Long.valueOf(in.readLine());
        }
        int even,odd,positives,negatives;
        even=negatives=odd=positives=0;
        for (int i = 0; i < 5; i++) {
            if(arr[i]%2==0)
                even++;
            else odd++;
            if(arr[i]>0 && arr[i]!=0)
                positives++;
            else if(arr[i]!=0)
                negatives++;              
        }
        System.out.println(even+" valor(es) par(es)");
        System.out.println(odd+" valor(es) impar(es)");
        System.out.println(positives+" valor(es) positivo(s)");
        System.out.println(negatives+" valor(es) negativo(s)");
    }
}
