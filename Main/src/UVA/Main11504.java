package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author jojstepersan
 * 11504 - Dominos
 */
public class Main11504 {

    static int v, e; //vertices, arcos
    static int MAX = 100005; //Cantidad m´axima de nodos del grafo
    static ArrayList<Integer> ady[] = new ArrayList[MAX]; //Lista de adyacencia
    static boolean marked[] = new boolean[MAX]; //Estructura auxiliar para marcar los grafos visitados //Recibe el nodo inicial s

    static void dfs(int s) {
        marked[s] = true;
      //  System.out.println(s + ":" + ady[s]);
        int i, next;
        for (i = 0; i < ady[s].size(); i++) {
            next = ady[s].get(i);
            if (!marked[next]) {
                dfs(next);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int origen, destino;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //lectura de los casos de prueba
        StringTokenizer st;
        int cases = Integer.valueOf(in.readLine().trim());
        while (cases-- > 0) {
            st = new StringTokenizer(in.readLine().trim());
            v = Integer.valueOf(st.nextToken());
            e = Integer.valueOf(st.nextToken());
            init();
            for (int i = 0; i < e; i++) {
                st = new StringTokenizer(in.readLine().trim());
                origen = Integer.valueOf(st.nextToken());
                destino = Integer.valueOf(st.nextToken());
                origen--;
                destino--;
                ady[origen].add(destino);//lectura para grafos dirijidos
                //ady[destino].add(origen);
            }

            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < v; i++) {
                if (!marked[i]) {
                    dfs(i);
                    a.add(i);
                }
            }
          //  System.out.println(a.size());
            //dfs para los nodos que no quedaron guardados
            init2();
            int part = 0;
            for (int i = a.size() - 1; i >= 0; i--) {
                if (!marked[a.get(i)]) {
                    part++;
                    dfs(a.get(i));
                }
            }
            System.out.println(part);
        }
    }

    static void init() {
        int i;
        for (i = 0; i < v; i++) {
            ady[i] = new ArrayList<>();
            //System.out.println(ady[i]);
            marked[i] = false;
        }
    }

    static void init2() {
        int i;
        for (i = 0; i < v; i++) {
            marked[i] = false;
        }
    }
}
/*
1
5 2
1 4
2 4

*/