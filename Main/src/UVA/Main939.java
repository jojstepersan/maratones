/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Usuario
 * 939 - Genes
 */
public class Main939 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static Map<String, String> genes = new HashMap<>();
    static Map<String, List<String>> hijos = new HashMap<>();

    public static void main(String[] args) throws Exception {
        int t = Integer.valueOf(in.readLine().trim());
        Map<String, String> genes = new TreeMap<>();
        Map<String, List<String>> hijos = new HashMap<>();
        String s;
        String[] arr;
        for (int i = 0; i < t; i++) {
            arr = in.readLine().split(" ");
            if (arr[1].equals("non-existent") || arr[1].equals("recessive") || arr[1].equals("dominant")) {
                genes.put(arr[0], arr[1]);
            } else {
                if (hijos.containsKey(arr[1])) {
                    List<String> padres = hijos.get(arr[1]);
                    padres.add(arr[0]);
                    hijos.replace(arr[1], padres);
                } else {
                    List<String> padres = new ArrayList<>();
                    padres.add(arr[0]);
                    hijos.put(arr[1], padres);
                }
            }
        }
        Queue<String> q=new LinkedList<>();
        for (Object key : hijos.keySet().toArray()) {
            q.add((String)key);
        }
        
        while (q.size()>0) {
            String key = q.poll();
            List<String> value = hijos.get(key);
            String g1 = genes.get(value.get(0)), g2 = genes.get(value.get(1));
            if (g1!=null && g2!=null) {
                if (g1.equals(g2)) {
                    genes.put(key, g1);
                } else if ((g1.equals("dominant") && g2.equals("recessive")) || (g2.equals("dominant") && g1.equals("recessive"))) {
                    genes.put(key, "dominant");
                } else if ((g1.equals("dominant") && g2.equals("non-existent")) || (g2.equals("dominant") && g1.equals("non-existent"))) {
                    genes.put(key, "recessive");
                }else if ((g1.equals("recessive") && g2.equals("non-existent")) || (g2.equals("recessive") && g1.equals("non-existent"))) {
                    genes.put(key, "non-existent");
                }
                hijos.remove(key);
            }else{
                q.add(key);
            }

        }
        genes.forEach((k,v)->System.out.println(k+" "+v)); 
    }

}
/*
7
John dominant
Mary recessive
John Susan
Mary Susan
Peter non-existent
Susan Marta
Peter Marta
 */
