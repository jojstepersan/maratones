/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liveArchives;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 7786 - A Rational Sequence (Take 3)
 * @author jojstepersan
 */
public class Main7786 {

    static  int steps[]=new int[33];

    public static void runTree( int N,int index){
        if(N==1)
            {
            return ;
            }
        else if(N%2==0)
            {
            steps[index]=0;
            runTree(N/2,index-1);
            }
        else
            {
            steps[index]=1;
            runTree((N-1)/2,index-1);
            }
        }

    public static void solver(int p,int q, int i)
        {
        if(steps[i]!=-1){
            if(steps[i]==0){
                solver(p,p+q,i+1);
            }else{
                solver(p+q,q,i+1);
            }
        }
        else
            System.out.println(p+"/"+q);
        }
    
    public static void main(String[] args) throws IOException {
        int P;
        int K;
        int N;
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        P=Integer.parseInt(in.readLine());
        for (int i = 1; i <= P; i++) {
            StringTokenizer st=new StringTokenizer(in.readLine());
            K=Integer.valueOf(st.nextToken());
            N=Integer.valueOf(st.nextToken());
            int level=(int) (Math.log(N)/Math.log(2.0));
            for (int j = 0; j < 32; j++) {
                steps[j]=-1;
            }
            runTree(N,level-1);
            System.out.print(K+" ");
            solver(1,1,0);
        }
        in.close();
    }
}
