
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package RPC.R14_2017;

/**
 *
 * @author jojstepersan
 */
public class tribune {
 static int[] cnt=new int[26];
    
    public static void main(String[] args)throws Exception {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=in.readLine())!=null)
            {
            cnt=new int[26];
            int casos=Integer.valueOf(s);
            char tribuna[][]=new char[casos][casos];
            for (int i = 0; i < casos; i++) {
                tribuna[i]=in.readLine().toCharArray();
                for (int j = 0; j < tribuna[i].length; j++) {
                    cnt[tribuna[i][j]-'A']++;
                    }
                }
            int x,y;
            x=y=-1;
            char c='.',a='.';
            for (int i = 0; i < cnt.length; i++) {
                if(cnt[i]!=0)
                    {
                    if(cnt[i]==casos-1)
                        {
                        c=(char)((char)i+'A'); 
                        }
                    else if(cnt[i]==1)
                        a=(char) ((char)i+'A');
                    }
                }
            for (int i = 0; i < tribuna.length; i++) {
                for (int j = 0; j < tribuna.length; j++) {
                    if(tribuna[i][j]==a)
                        {
                        x=i+1;
                        y=j+1;
                        break;
                        }
                    }
                }
                System.out.println(x+" "+y+" "+c);
            }
    }
}
/*
6
CKHOYE
OEYCDK
EYOKCD
KDCEOY
YOEDKC
DCKYEO
3
GIW
IWL
WLI
4
ABCD
CDAB
AEDC
BDAC

6
OEYCDK
EYOKCD
KDCEOY
CKHOYE
YOEDKC
DCKYEO
3
IWL
GIW
WLI
6
OEYCDK
EYOKCD
KDCEOY
CKKOYE
YOEDKC
DCKYEO
*/