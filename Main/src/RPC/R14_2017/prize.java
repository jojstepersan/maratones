/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RPC.R14_2017;

/**
 *
 * @author jojstepersan
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package prize;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

/**
 *
 * @author Andres Martinez
 */
public class prize {

    static BufferedReader in = new BufferedReader(new BufferedReader(new InputStreamReader(System.in)));

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(in.readLine());
        int numPrices = Integer.valueOf(st.nextToken());
        int maxWeight = Integer.valueOf(st.nextToken());

        if (numPrices == 1) {
            System.out.println(1);
        } else {
            LinkedList<Integer> prices = new LinkedList<>();
            st = new StringTokenizer(in.readLine());
            for (int i = 0; i < numPrices; i++) {
                prices.add(Integer.valueOf(st.nextToken()));
            }
            Collections.sort(prices);
            for (int i = 0; i < prices.size(); i++) {
                if (!prices.isEmpty() && prices.get(prices.size() - 1) + prices.get(prices.size() - 2) > maxWeight) {
                    prices.remove(prices.size() - 1);
                } else {
                    break;
                }
            }
            System.out.println(prices.size());
        }
    }
}
