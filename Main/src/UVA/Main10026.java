/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 10026 - Shoemaker's Problem
 *
 * @author jojstepersan
 */
public class Main10026 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        boolean f=false;
        for (int i = 0; i < c; i++) {
            Task.c=1;
            int tasks = sc.nextInt();
            Task w[] = new Task[tasks];
            for (int j = 0; j < tasks; j++) {
                w[j] = new Task(sc.nextInt(), sc.nextInt());
            }
            Arrays.sort(w);
            if(f){
                System.out.println("");
            }
            for (int j = 0; j < w.length - 1; j++) {
                System.out.print(w[j].id + " ");
            }
            System.out.println(w[w.length - 1].id);
            f=true;
            
            
        }
    }
}

class Task implements Comparable<Task> {

    public static int c = 1;
    Integer time, penalty;
    Integer id;

    public Task(int t, int m) {
        this.time = t;
        this.penalty = m;
        id = c++;
    }

    @Override
    public int compareTo(Task t) {
        if (this.time * t.penalty != t.time * this.penalty) {
            Integer x = (this.time * t.penalty);
            Integer y = t.time * this.penalty;
            return x.compareTo(y);
        }
        return this.id.compareTo(t.id);
    }

}
/*
1

4
3 4
1 1000
2 2
5 5

*/
