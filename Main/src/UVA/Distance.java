/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javafx.scene.Node;

/*
algoritmo menor distancia
 */
public class Distance {

    Scanner sc = new Scanner(System.in);
    Point[] points ;
    double[][] mat;
    double distance = 0;

    public void read() {
        int puntos = sc.nextInt();
        mat = new double[puntos][puntos];
        points=new Point[puntos];
        for (int i = 0; i < puntos; i++) {
            points[i]=(new Point(sc.nextInt(), sc.nextInt()));
        }
    }

    public static void main(String[] args) {
        Distance d = new Distance();
        d.read();
        d.puntos();
        //d.mostrar();
        QuickSort q=new QuickSort(d.points);
        q.sort();
        d.points=q.getPoints();
        d.puntos();
        d.cargarMat();
        d.mostrar();
//        System.out.printf("%.3f",d.distance);
//        System.out.println("");
    }

    public void puntos()
        {System.out.print("[");
        for (int i = 0; i < points.length; i++) {
            System.out.print("("+points[i].x+","+points[i].y+") ");
            }
        System.out.println("]");
        }
    public void cargarMat() {
        for (int i = 0; i < points.length; i++) {
            Point p = points[(i)];
            for (int j = i; j < points.length; j++) {
                Point q = points[(j)];
                if (j != i) {
                    mat[i][j] = mat[j][i] = p.distance(q);
                }
            }
        }
    }

    public void solve() {
        double menor = 0;
        for (int i = 0; i < mat.length; i++) {

        }
    }

//    public void ordenarMat()
//        {
//        for (int i = 0; i < mat.length; i++)
//            {
//            Arrays.sort(mat[i]);
//            }
//        }
    public void mostrar() {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.printf("%.2f", mat[i][j]);
                System.out.print("\t");
            }
            System.out.println("");

        }
    }
}

class Point {

    long x;
    long y;

    public Point(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
/*
10
0 0
1 1
3 24
5 5
6 6
6 9
10 10
20 10
50 60
120 3

10
10 10
20 10
5 5
1 1
120 3
6 6
50 60
3 24
6 9
0 0
*/
