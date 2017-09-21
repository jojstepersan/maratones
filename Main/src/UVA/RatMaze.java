/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

/*
 backtraking
caminos de la rata

*/
public class RatMaze {

    final int N=4;
    void prontSolution(int sol[][])
        {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j <sol[i].length; j++) {
                System.out.print(" "+sol[i][j]+" ");
            }
            System.out.println("");
            }
        }
    
    boolean isSafe(int maze[][],int x,int y)
        {
        return (x>=0 && x<N && y>=0 &&  y<N && maze[x][y]==1);
        }
    
    boolean solveMaze(int Maze[][])
        {
        int sol[][]={
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
        };
        if(solveMazeUtil(Maze,0,0,sol)==false)
            {
            System.out.println("Solution doesn't exist");
            return false;
            }
        prontSolution(sol);
        return true;    
        }

    boolean solveMazeUtil(int[][] Maze, int x, int y, int[][] sol) {
        if(x==N-1 && y==N-1)
            {
            sol[x][y]=1;
            return true;
            }
        if (isSafe(Maze, x, y))
            {
            sol[x][y]=1;
            if(solveMazeUtil(Maze, x+1, y, sol))
                return true;
            if (solveMazeUtil(Maze, x, y+1, sol))
                return true;
            sol[x][y]=0;
            return false;
            }
        return false;
    }
    
    public static void main(String[] args) {
        RatMaze rat=new RatMaze();
        int maze[][]={
            {1,0,0,0},
            {1,1,0,1},
            {0,1,0,0},
            {1,1,1,1},
        };
        rat.solveMaze(maze);
    }
    
}
