/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.DataInputStream;

/**
 *
 * @author Usuario
 * uva 458
 */
public class Main458 {

    //static  BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
    static DataInputStream in=new DataInputStream(System.in);
    public static void main(String[] args)throws Exception {
        int s;
        
        while((s=in.read())!=-1){
          
                if(s!=10)
                    System.out.print((char)(s-7));
                else
                    System.out.print((char)10);
          
        }
    }
    
}
