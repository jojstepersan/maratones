/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package URI;

//import java.io.BufferedReader;
import java.io.IOException;
//import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Cops and Robbers
 * @author jojstepersan
 */

public class Main {
    
    final int N=5;
    
     boolean isSafe(int maze[][],int x,int y)
        {
        return (x>=0 && x<N && y>=0 &&  y<N && maze[x][y]==0);
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
        if(!solveMazeUtil(Maze,0,0,sol))
            {
            System.out.println("ROBBERS");
            return false;
            }
        System.out.println("COPS");
        return true;    
        }

    boolean solveMazeUtil(int[][] Maze, int x, int y, int[][] sol) {
        if(x==N-1 && y==N-1)
            {
            sol[x][y]=0;
            return true;
            }
        if (isSafe(Maze, x, y))
            {
            sol[x][y]=0;
            if(solveMazeUtil(Maze, x+1, y, sol))
                return true;
            if(solveMazeUtil(Maze, x-1, y, sol))
                return true;
            if (solveMazeUtil(Maze, x, y+1, sol))
                return true;
            if(y>0)
                if(solveMazeUtil(Maze, x, y-1, sol))
                    return true;
            sol[x][y]=1;
            return false;
            }
        return false;
    }
    public static void main(String[] args) throws IOException {
        Main rat=new Main();
        //BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        int casos=sc.nextInt();//Integer.parseInt(in.readLine());
        for (int i = 0; i < casos; i++)
            {
            int maze[][]=new int[5][5];
            for (int j = 0; j < 5; j++)
                {
                for (int k = 0; k < 5; k++)
                    {
                    maze[j][k]=sc.nextInt();//Integer.valueOf(st.nextToken());
                    }
                }
            rat.solveMaze(maze);
            }
    }
    
}
