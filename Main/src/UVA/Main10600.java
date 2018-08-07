/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * 10600 - ACM Contest and Blackout
 *
 * @author jojstepersan
 */
public class Main10600 {

    static int v, e;
    static int MAX = 100005;
    static ArrayList<Node> ady[] = new ArrayList[MAX];
    static boolean marked[] = new boolean[MAX];
    static int rta;
    static PriorityQueue<Node> pq;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int cases = Integer.valueOf(in.readLine().trim());
        for (int i = 0; i < cases; i++) {
            StringTokenizer st = new StringTokenizer(in.readLine());
            v = Integer.valueOf(st.nextToken());
            e = Integer.valueOf(st.nextToken());
            ady = new ArrayList[v];
            marked = new boolean[v];
            init();
            for (int j = 0; j < e; j++) {
                int a, b, c;
                st = new StringTokenizer(in.readLine().trim());
                a = Integer.valueOf(st.nextToken());
                b = Integer.valueOf(st.nextToken());
                c = Integer.valueOf(st.nextToken());
                ady[a - 1].add(new Node(b - 1, c));
                ady[b - 1].add(new Node(a - 1, c));
            }
            prim(0);
            System.out.println("rta1: " + rta);
            init();
            prim(1);
            System.out.println("rta2: " + rta);

        }
    }

    private static void init() {
        int i;
        for (i = 0; i < v; i++) {
            ady[i] = new ArrayList<>();
            marked[i] = false;
        }
        rta = 0;
        pq = new PriorityQueue<>();
    }

    static void prim(int n) {
        process(n);
        int u, w;
        while (pq.size() > 0) {
            u = pq.peek().adjacent;
            w = pq.peek().cost;
            pq.poll();
            if (!marked[u]) {
                rta += w;
                process(u);
            }
        }
    }

    static void process(int u) {
        marked[u] = true;
        int i, v;
        for (i = 0; i < ady[u].size(); i++) {
            v = ady[u].get(i).adjacent;
            if (!marked[v]) {
                pq.add(new Node(v, ady[u].get(i).cost));
            }
        }
    }

    private static class Node implements Comparable<Node> {

        public Integer adjacent, cost;

        public Node(int adj, int c) {
            adjacent = adj;
            cost = c;
        }

        @Override
        public int compareTo(Node t) {
            return this.cost.compareTo(t.cost);
        }

    }
}
