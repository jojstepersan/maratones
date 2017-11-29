/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
/**
 * 255	Correct Move
 * @author jojstepersan
 */
public class Main255 {
    
    
    static ArrayList<Integer> moveKing;//=new ArrayList<>();
    static ArrayList<Integer> moveQueen;//=new ArrayList<>();
    static int posKing;
    static int posQueen;
    
    public static void main(String[] args)throws Exception {
        String s;
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        while((s=in.readLine())!=null)
            {  
            String moves[]=s.split(" ");
            posKing=Integer.valueOf(moves[0]);
            posQueen=Integer.valueOf(moves[1]);
            int move=Integer.valueOf(moves[2]);
            if(posKing==posQueen)
                System.out.println("Illegal state");
            else if(posKing==move || posQueen==move)
                System.out.println("Illegal move");
            else
                {
                calculatePosKing(posKing);
                calculatePosQueen(posQueen);
               
                if(!findPosQueen(move))
                    System.out.println("Illegal move");
                else
                    {
                    if(findPosking(move))
                        System.out.println("Move not allowed");
                    else
                        {
                        posQueen=move;
                        calculatePosQueen(posQueen);
                       
                        deleteRepite();
                        if(moveKing.isEmpty())
                            System.out.println("Stop");
                        else
                            System.out.println("Continue");
                       
                        }
                    }
                }
                
                
            }
    }
    public static void deleteRepite()
        {
        int i,j;
        i=0;
        Collections.sort(moveKing);
        Collections.sort(moveQueen);
        //System.out.println(moveKing+"\n"+moveQueen);
        boolean flag;
        while(i<moveKing.size())
            {
            j=0;
            flag=true;
            while(j<moveQueen.size())
                {
                if(moveKing.get(i).equals(moveQueen.get(j)))
                    {
                   // System.out.println("entre "+moveKing.get(i));
                    moveKing.remove(i);
                    moveQueen.remove(j);
                    flag=false;
                    break;
                    }
                else
                    j++;
                }
         //   System.out.println("f: "+flag);
            if(flag)
                i++;
            }
        
        }
    
    
    public static void calculatePosKing(int currentPos)
        {
        moveKing=new ArrayList<>();
        if(currentPos<8*(currentPos/8+1)-1)
            moveKing.add(currentPos+1);
        if(currentPos>(8*(currentPos/8)))
            moveKing.add(currentPos-1);
        if(currentPos+8<64)
            moveKing.add(currentPos+8);
        if(currentPos-8>=0)
            moveKing.add(currentPos-8);
        }
    
    public  static boolean findPosQueen(int pos)
        {
        for (int i = 0; i < moveQueen.size(); i++) {
                if(pos==moveQueen.get(i))
                    return true;
            }
        return false;
        }
    
    public  static boolean findPosking(int pos)
        {
        for (int i = 0; i < moveKing.size(); i++) {
                if(pos==moveKing.get(i))
                    return true;
            }
        return false;
        }
    public static void calculatePosQueen(int currentPos)
        {
        moveQueen=new ArrayList<>();
        int aux=currentPos/8;
        int Pos=currentPos;
        while(Pos!=posKing && Pos<(8*(aux+1))-1 ){
            moveQueen.add(++Pos);
            }
        Pos=currentPos;
        while(Pos!=posKing && Pos>(8*(aux)) ){
            moveQueen.add(--Pos);
            }
        Pos=currentPos+8;
        while(Pos!=posKing && Pos<64)
            {   
            moveQueen.add(Pos);
            Pos+=8;
            }
        
        Pos=currentPos-8;
        while(Pos!=posKing && Pos>=0)
            {
            moveQueen.add(Pos);
            Pos-=8;
            }
        }
    
}
