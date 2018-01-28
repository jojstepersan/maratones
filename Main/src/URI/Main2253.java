/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 2253	Passwords Validator
 * @author jojstepersan
 */
public class Main2253 {
    public static void main(String[] args)throws Exception {
        String s;
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        while((s=in.readLine())!=null)
            {
            boolean mayus,minus,number,other,length;
            mayus=minus=number=other=false;
            length=s.length()>=6&&s.length()<=32;
            for (int i = 0; i < s.length(); i++) {
                char c=s.charAt(i);
                if(c<=90&&c>=65)
                    mayus=true;
                else if(c<=122&&c>=97)
                    minus=true;
                else if(c<=57 &&c>=48)
                    number=true;
                else other=true;
                if(other)
                    break;
                
                }
            if(mayus && minus && number && !other && length)
                System.out.println("Senha valida.");
            else
                System.out.println("Senha invalida.");
            }
    }
}
/*
97
122
65
90
48-57
*/