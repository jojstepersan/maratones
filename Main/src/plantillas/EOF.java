/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plantillas;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author jojstepersan
 */
public class EOF {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        String s;
        while ((s = in.readLine()) != null) {
            //leer las lineas y asignarla al objeto st
            st = new StringTokenizer(s.trim());
            // st crea una especie de cola con el cual se puede hacer llamado
            // a los datos leidos con el metodo nextToken()
            int n, m;
            //esto datos vienen como cadena asi que es necesario convertirlos a 
            //entero o el tipo de dato necesario
            
            n = Integer.valueOf(st.nextToken());
            m = Integer.valueOf(st.nextToken());
            System.out.printf("%d %d\n",n,m);
        }
    }
}
