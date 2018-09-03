
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 13258 - Romeo and Juliet Secrets
 */
public class Main13258 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.valueOf(in.readLine());
        for (int i = 0; i < t; i++) {
            String crypto, palabra;
            int k;
            crypto = in.readLine();
            palabra = in.readLine();
            k = Integer.valueOf(in.readLine().trim());
            int c = 0;
            for (int j = 0; j < crypto.length() - palabra.length() + 1; j++) {
                if (crypto(crypto, palabra, k,j,j + palabra.length())) {
                    c++;
               }
            }
            System.out.println(c);
        }
    }

    public static Boolean crypto(String crypto, String palabra, int k,int x,int y) {
        int c = 0, p = -1, l = -1;
        int j=0;
        for (int i = x; i < y; i++) {
            if (crypto.charAt(i) != palabra.charAt(j++)) {
                if (p < 0) {
                    p = i;
                }
                l = i;
                c++;
                if (c > k) {
                    return false;
                }
            }
        }
        if (crypto.equals(palabra)) {
            return true;
        } else {
            return l - p + 1 <= k;
        }
    }

}
/*
3
oxwmeorozkowhereforeartthouromeo
romeo
2
abcabcabcabcabc
aba
1
abcabcabcabcabc
acb
2
 */
