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
            /*
            if (x >= 0 && y >= 0 && x < N  && y < N && maze[x][y] != 0) {
			return true;
		}
		return false;
            */
        return (x>=0  && y>=0 &&  x<N && y<N && maze[x][y]!=1);
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
        if(!solveMazeUtil(Maze,0,0,sol,"down"))
            {
            System.out.println("ROBBERS");
            return false;
            }
        System.out.println("COPS");
        return true;    
        }

    boolean solveMazeUtil(int[][] Maze, int x, int y, int[][] sol, String direccion) {
        if(x==N-1 && y==N-1)
            {
            sol[x][y]=0;
            return true;
            }
        if (isSafe(Maze, x, y))
            {
            sol[x][y]=0;
            if(!direccion.equals("up") && solveMazeUtil(Maze, x+1, y, sol,"down"))
                return true;
            if(!direccion.equals("left") && solveMazeUtil(Maze,x, y+1, sol,"right"))
                return true;
            if(!direccion.equals("down") && solveMazeUtil(Maze, x-1, y, sol,"up"))
                return true;
            if(!direccion.equals("right") && solveMazeUtil(Maze, x, y-1, sol,"left"))
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
