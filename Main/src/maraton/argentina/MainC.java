package maraton.argentina;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jojstepersan – Complicando contraseñas
 */
public class MainC {

    static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static int arr[] = {2, 4, 8, 3, 2, 6, 1, 2};

    public static void main(String[] args) throws Exception {
        StringTokenizer st = new StringTokenizer(in.readLine());
        long x;
        for (int i = 0; i < 4; i++) {
            x = Long.valueOf(st.nextToken());
            if (x == 1) {
                System.out.print("4");
            } else if (x == 2) {
                System.out.print("6");
            } else {
                x = (x % 8) - 3;
                if (x < 0) {
                    x += 8;
                }
                System.out.print(arr[(int) x]);
            }
        }
        System.out.println("");
    }
}
