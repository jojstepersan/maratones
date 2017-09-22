package URI;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

/**
 * Cops and Robbers
 *
 * @author jojstepersan
 */
public class Main1905 {

    final int N = 5;

    boolean isSafe(int maze[][], int x, int y) {
        /*
            if (x >= 0 && y >= 0 && x < N  && y < N && maze[x][y] != 0) {
			return true;
		}
		return false;
         */
        return (x >= 0 && y >= 0 && x < N && y < N && maze[x][y] != 1);
    }

    boolean solveMaze(int Maze[][]) {
        int sol[][] = {
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1}
        };
        if (!solveMazeUtil(Maze, 0, 0, sol, "down", 0)) {
            System.out.println("ROBBERS");
            return false;
        }
        System.out.println("COPS");
        return true;
    }

    public static void show(int mat[][])
        {  
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) 
                System.out.print(mat[i][j]+" ");            
            System.out.println("");
            }
        }
    
    boolean solveMazeUtil(int[][] Maze, int x, int y, int[][] sol, String direccion, int maxMove) {
        if (x == N - 1 && y == N - 1) {
            sol[x][y] = 0;
            return true;
        }

        if (maxMove < 25 && isSafe(Maze, x, y)) {
            sol[x][y] = 0;
            if (!direccion.equals("down") && solveMazeUtil(Maze, x - 1, y, sol, "up", maxMove + 1)) {
                return true;
            }
            if (!direccion.equals("right") && solveMazeUtil(Maze, x, y - 1, sol, "left", maxMove + 1)) {
                return true;
            }
            if (!direccion.equals("up") && solveMazeUtil(Maze, x + 1, y, sol, "down", maxMove + 1)) {
                return true;
            }
            if (!direccion.equals("left") && solveMazeUtil(Maze, x, y + 1, sol, "right", maxMove + 1)) {
                return true;
            }

            sol[x][y] = 1;
            return false;
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        Main1905 rat = new Main1905();
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        //Scanner sc = new Scanner(System.in);
        int casos = Integer.parseInt(in.readLine());
        for (int i = 0; i < casos; i++) {
            int maze[][] = new int[5][5];
            in.readLine();
            for (int j = 0; j < 5; j++) {
            StringTokenizer st=new StringTokenizer(in.readLine());
                for (int k = 0; k < 5; k++) {
                    maze[j][k] = Integer.valueOf(st.nextToken());
                }
            }
            rat.solveMaze(maze);
            ///show(maze);
        }
    }

}
/*



public class Main {
    
    final int N=5;
    
     boolean isSafe(int maze[][],int x,int y)
        {
            /*
            if (x >= 0 && y >= 0 && x < N  && y < N && maze[x][y] != 0) {
			return true;
		}
		return false;
            */
        /*return (x>=0  && y>=0 &&  x<N && y<N && maze[x][y]!=1);
        }
    
    boolean solveMaze(int Maze[][])
        {
        int sol[][]={
            {1,1,1,1,1},
            {1,1,1,1,1},
            {1,1,1,1,1},
            {1,1,1,1,1},
            {1,1,1,1,1}
        };
        if(!solveMazeUtil(Maze,0,0,sol,"down",0))
            {
            System.out.println("ROBBERS");
            return false;
            }
        System.out.println("COPS");
        return true;    
        }

    boolean solveMazeUtil(int[][] Maze, int x, int y, int[][] sol, String direccion, int maxMove) {
        if(x==N-1 && y==N-1)
            {
            sol[x][y]=0;
            return true;
            }
        if (maxMove<25&&isSafe(Maze, x, y))
            {
            sol[x][y]=0;
            if(!direccion.equals("up") && solveMazeUtil(Maze, x+1, y, sol,"down",maxMove+1))
                return true;
            if(!direccion.equals("left") && solveMazeUtil(Maze,x, y+1, sol,"right",maxMove+1))
                return true;
            if(!direccion.equals("down") && solveMazeUtil(Maze, x-1, y, sol,"up",maxMove+1))
                return true;
            if(!direccion.equals("right") && solveMazeUtil(Maze, x, y-1, sol,"left",maxMove+1))
                return true;
            sol[x][y]=1;
            return false;
            }
        return false;
    }
    public static void main(String[] args) throws IOException {
        Main rat=new Main();
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        //Scanner sc=new Scanner(System.in);
        int casos=Integer.parseInt(in.readLine());
        for (int i = 0; i < casos; i++)
            {
            int maze[][]=new int[5][5];
            in.readLine();
            for (int j = 0; j < 5; j++)
                {
                StringTokenizer st=new StringTokenizer(in.readLine());
                for (int k = 0; k < 5; k++)
                    {
                    maze[j][k]=Integer.parseInt(st.nextToken());//Integer.valueOf(st.nextToken());
                    }
                }
                rat.solveMaze(maze);
            
            }
    }
    
}
/*
3

0 0 0 0 1
1 1 0 0 1
0 0 0 1 0
0 0 1 1 1
1 0 0 0 0

0 1 0 0 0
0 0 0 1 0
0 1 1 0 0
0 1 1 0 1
0 1 1 0 0

0 1 0 0 0
0 0 0 1 0
0 1 1 0 0
0 1 1 0 1
0 1 1 0 1
*/