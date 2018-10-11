package maraton.argentina;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class MainG {

    static final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static List<Point> points = new ArrayList<>();
    static List<String> pointsAns = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        StringTokenizer st;
     //   System.out.println(esRectangulo(new Point(0, 0), new Point(0, 2), new Point(2, 1)));
        int n = Integer.valueOf(in.readLine().trim());
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(in.readLine().trim());
            points.add(new Point(Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken())));
        }
        int triangulos = 0;
        for (int i = 0; i < points.size() - 2; i++) {
            for (int j = i + 1; j < points.size() - 1; j++) {
                for (int k = j + 1; k < points.size(); k++) {
                    if (esRectangulo(points.get(i), points.get(j), points.get(k))) {
                        triangulos++;
       //                 pointsAns.add(points.get(i) + " " + points.get(j) + " " + points.get(k));
                    }
                }
            }
        }
        //  Collections.sort(pointsAns);
      //  pointsAns.forEach(p -> System.out.println(p));
      
        System.out.println(triangulos);
    }

    public static boolean esRectangulo(Point p1, Point p2, Point p3) {
        long h = -1, c1 = -1, c2 = -1;
        if (!p1.equals(p2) && !p1.equals(p3) && !p2.equals(p3)) {
            if (p1.distance(p3) > p2.distance(p3) && p1.distance(p3) > p1.distance(p2)) {
                h = p1.distance(p3);
                c1 = p2.distance(p3);
                c2 = p1.distance(p2);
            } else if (p2.distance(p3) > p1.distance(p3) && p2.distance(p3) > p1.distance(p2)) {
                h = p2.distance(p3);
                c1 = p1.distance(p3);
                c2 = p1.distance(p2);
            } else if (p1.distance(p2) > p2.distance(p3) && p1.distance(p2) > p1.distance(p3)) {
                h = p1.distance(p2);
                c1 = p1.distance(p3);
                c2 = p2.distance(p3);
            }
            return h == (c1 + c2);
        }
        return false;
    }

}

class Point {

    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public long distance(Point p) {
        return (long) (Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point p = (Point) obj;
            return p.x == x && p.y == y;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.x;
        hash = 97 * hash + this.y;
        return hash;
    }

    @Override
    public String toString() {
        return "{" + "x=" + x + ", y=" + y + '}';
    }

}

/*
3
1 0
7 2
0 3

9
0 0
0 1
0 2
1 0
1 1
1 2
2 0
2 1
2 2
 */
