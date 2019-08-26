/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author jojstepersan
 */
public class Main1050 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {
        Map<Integer, String> query = new HashMap<>();
        query.put(61,"Brasilia");
        query.put(71,"Salvador");
        query.put(11,"Sao Paulo");
        query.put(21,"Rio de Janeiro");
        query.put(32,"Juiz de Fora");
        query.put(19,"Campinas");
        query.put(27,"Vitoria");
        query.put(31,"Belo Horizonte");
        int t=Integer.valueOf(in.readLine());
        if(query.containsKey(t)) 
            System.out.println(query.get(t));
        else System.out.println("DDD nao cadastrado");
    }

}
