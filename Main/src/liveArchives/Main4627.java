package liveArchives;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 4627 - Islands
 * @author jojstepersan
 */
public class Main4627 {
    
    static int table[][];
    
    public static void main(String[] args) throws IOException {
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        int z=Integer.parseInt(in.readLine());
        for (int i = 0; i < z; i++) {
            StringTokenizer st=new StringTokenizer(in.readLine());
            int n,m;
            n=Integer.parseInt(st.nextToken());
            m=Integer.parseInt(st.nextToken());
            long mat[][]=new long[n+2][m+2];
            for (int j = 1; j <=n; j++) {
                st=new  StringTokenizer(in.readLine());
                for (int k = 1; k <= m; k++) {
                    mat[j][k]=Integer.parseInt(st.nextToken());
                    }
                }
            Integer.parseInt(in.readLine());
            st=new StringTokenizer(in.readLine());
            while(st.hasMoreTokens()) {
                solve(mat, Long.parseLong(st.nextToken()));
            }
            System.out.println("");
            
        }
    }
    
    public static void solve(long mat[][], long y)
        {
        Queue<Point> queue=new LinkedList<>();
        Point offset[]=new Point[4];
        offset[0]=new Point(0, 1);
        offset[1]=new Point(1, 0);
        offset[2]=new Point(0, -1);
        offset[3]=new Point(-1, 0);
        Point nbr=new Point(0, 0);
        int id=1;
        init(mat,y);
       // System.out.println("");
        //show(table);
        for (int r = 1; r <mat.length; r++) {
            for (int c = 1; c < mat[r].length; c++) {
                if(table[r][c]==1)
                    {
                    table[r][c]=++id;
                    Point here=new Point(r, c);
                    do{
                        for (int i=  0; i < 4; i++)
                            {
                            nbr.x=here.x+offset[i].x;
                            nbr.y=here.y+offset[i].y;
                            if(table[nbr.x][nbr.y]==1)
                                {
                                table[nbr.x][nbr.y]=id;
                                queue.add(new Point(nbr.x, nbr.y));
                                }
                            }
//                        System.out.println(queue);
//                        System.out.println("Edit");
//                        show(table);
                        try{
                            here=queue.remove();
                            }catch(Exception e)
                                {
                                here=null;
                                }
                        }while(here!=null);
                    }
                }
            }
            System.out.print((id-1)+" ");
        }
    
    public static void init(long mat[][], long y)
        {
        table=new int[mat.length][mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            table[i][0]=table[i][mat.length-1]=table[0][i]=table[mat.length-1][i]=0;
            }
        for (int r = 1; r <mat.length; r++) {
            for (int c = 1; c < mat[r].length; c++) {
                if(mat[r][c]>y)
                    table[r][c]=1;
                else
                    table[r][c]=0;
                }
            }
        }
    public static void show(int mat[][])
        {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println("");
            }
        }
}


class Point{

    public int x;
    public int y;
    
    public Point(int x,int y)
        {
        this.x=x;
        this.y=y;
        }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
} 

/*
2
4 5
1 2 3 3 1
1 3 200 2 1
200 1 3 4 3
1 200 200 200 200
5
1 2 3 4 109
4 5
1 2 3 3 1
1 3 2 2 1
2 1 3 4 3
1 2 2 2 2
1
1000

*/