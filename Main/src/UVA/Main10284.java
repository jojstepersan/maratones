/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 10284	Chessboard in FEN
 * @author jojstepersan
 */
public class Main10284 {
    
    static char mat[][]=new char[8][8];
    
    public static void main(String[] args)throws Exception {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String  s;
        while((s=in.readLine())!=null)
            {
            mat=new char[8][8];
            String str[]=s.split("/");
            for (int i = 0; i < str.length; i++) {
                init(str[i], i);
                }
            solve();
           // show();
            System.out.println(count());
            }    
    }
    
    public static int  count()
        {
        int c=0;   
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if(mat[i][j]=='-')
                    c++;
                }
            }
        return c;
        }
    
    public static void show()
        {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(mat[i][j]);
                }
            System.out.println("");
            }
        }
    
    public static  void init(String s,int r)
        {
        String aux="";
        for (int i = 0; i < s.length(); i++) {
            char c=s.charAt(i);
            if(c>=49&&c<=56)
                {
                int x=Integer.valueOf(c+"");
                for (int j = 0; j < x; j++) {
                        aux+="-";
                    }
                }
            else
                aux+=c;
            }
        mat[r]=aux.toCharArray();
        }
    
    public static void solve()
        {
        for (int i = 0; i < 8; i++)
            {
            for (int j = 0; j <8; j++)
                {
                switch (mat[i][j]) {
                    case 'P':pBMove(i, j);break;                   
                    case 'p':pNMove(i, j);break;
                    case 'K':KMove(i,j);break;
                    case 'k':KMove(i,j);break;
                    case 'n':nMove(i, j);break;
                    case 'N':nMove(i, j);break;
                    case 'b':bMove(i, j);break;
                    case 'B':bMove(i, j);break;
                    case 'q':qMove(i, j);break;
                    case 'Q':qMove(i, j);break;
                    case 'r':rMove(i, j);break;
                    case 'R':rMove(i, j);break;
                    }
                }
            }
        }
    
    
    private static void qMove(int x,int y)
        {
        bMove(x, y);
        rMove(x, y);
        }
    
    
    private static void nMove(int x,int y)
        {
        try{if(mat[x-2][y-1]=='-')mat[x-2][y-1]='x';}catch(Exception e){}
        try{if(mat[x-1][y-2]=='-')mat[x-1][y-2]='x';}catch(Exception e){}
        try{if(mat[x+1][y-2]=='-')mat[x+1][y-2]='x';}catch(Exception e){}
        try{if(mat[x+2][y-1]=='-')mat[x+2][y-1]='x';}catch(Exception e){}
        try{if(mat[x+2][y+1]=='-')mat[x+2][y+1]='x';}catch(Exception e){}
        try{if(mat[x+1][y+2]=='-')mat[x+1][y+2]='x';}catch(Exception e){}
        try{if(mat[x-1][y+2]=='-')mat[x-1][y+2]='x';}catch(Exception e){}
        try{if(mat[x-2][y+1]=='-')mat[x-2][y+1]='x';}catch(Exception e){}
        
        }
    
    private static void bMove(int x,int y)
        {
        int i,j;
        i=x+1;
        j=y+1;
         try{    
        while(mat[i][j]=='-'||mat[i][j]=='x')
            {
            mat[i++][j++]='x';
            }
        }catch(Exception e){}
        i=x-1;
        j=y-1;
         try{    
        while(mat[i][j]=='-'||mat[i][j]=='x')
            {
            mat[i--][j--]='x';
            }
        }catch(Exception e){}
        i=x-1;
        j=y+1;
         try{    
        while(mat[i][j]=='-'||mat[i][j]=='x')
            {
            mat[i--][j++]='x';
            }
        }catch(Exception e){}
        i=x+1;
        j=y-1;
         try{    
        while(mat[i][j]=='-'||mat[i][j]=='x')
            {
            mat[i++][j--]='x';
            }
        }catch(Exception e){}
        }
    
    private static void rMove(int x,int y)
        {
        int i,j;
        i=x-1;
        j=y;
        try{
            while(mat[i][j]=='-'||mat[i][j]=='x')
                {
                mat[i--][j]='x';
                }
            }catch(Exception e){}
        i=x+1;
        j=y;
        try{
            while(mat[i][j]=='-'||mat[i][j]=='x')
                {
                mat[i++][j]='x';
                }
            }catch(Exception e){}
        i=x;
        j=y+1;
        try{
            while(mat[i][j]=='-'||mat[i][j]=='x')
                {
                mat[i][j++]='x';
                }
            }catch(Exception e){}
        i=x;
        j=y-1;
        try{
            while(mat[i][j]=='-'||mat[i][j]=='x')
                {
                mat[i][j--]='x';
                }
            }catch(Exception e){}
        }
    
    private static void KMove(int x,int y)
        {
        pBMove(x, y);
        pNMove(x, y);
        try{
            if(mat[x-1][y]=='-')
                mat[x-1][y]='x';
        }catch(Exception e){}
        try{
            if(mat[x+1][y]=='-')
                mat[x+1][y]='x';
        }catch(Exception e){}
        try{
            if(mat[x][y+1]=='-')
                mat[x][y+1]='x';
        }catch(Exception e){}
        try{
            if(mat[x][y-1]=='-')
                mat[x][y-1]='x';
        }catch(Exception e){}
        
        }
    
    private static void pNMove(int x,int y)
        {
         try{
            if(mat[x+1][y-1]=='-')
                mat[x+1][y-1]='x';
        }catch(Exception e)
        {}
        try{
            if(mat[x+1][y+1]=='-')
                mat[x+1][y+1]='x';
        }catch(Exception e)
        {}
        }
    
    private static void pBMove(int x,int y)
        {
        try{
            if(mat[x-1][y-1]=='-')
                mat[x-1][y-1]='x';
        }catch(Exception e)
        {}
        try{
            if(mat[x-1][y+1]=='-')
                mat[x-1][y+1]='x';
        }catch(Exception e)
        {}
        }
}
