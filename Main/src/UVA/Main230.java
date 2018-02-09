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
 * uva 230 borrowers
 *
 * @author jojstepersan
 */
public class Main230 {

    public static void main(String[] args) throws Exception{
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s;
        ArrayList<String> books=new ArrayList<>();
        while(!(s=in.readLine()).equals("END"))
            {                  
            String arr[]=s.split(" by ");
            books.add(arr[1]+"/"+arr[0]);
            }
        Collections.sort(books);
//        for (String book : books) {
//            System.out.println(book);
//        }
        boolean returned[]=new boolean[books.size()];
        boolean isBook[]=new boolean[books.size()];
        for (int i = 0; i < isBook.length; i++)
            {
            isBook[i]=true;
            }
        while(!(s=in.readLine()).equals("END"))
            {
            String arr[];//=s.split("\"");// aqui esta el error, puede que no contenga este caracter
            if(s.contains("BORROW"))
                {
                arr=s.split("BORROW");
                String book=arr[1].substring(1,arr[1].length());//"\""+arr[1]+"\"";
            //        System.out.println("borrow "+book);
                int i=0;
                String query[]=books.get(i).split("/");
                    
                while(!book.equals(query[1]))
                    {
                //    System.out.println("q "+query[1]);
                    i++;
                    query=books.get(i).split("/");
                    }
                isBook[i]=false;
                }
            else if(s.contains("RETURN"))
                {
                arr=s.split("RETURN");
                String book=arr[1].substring(1,arr[1].length());//"\""+arr[1]+"\"";
                 int i=0;
                String query[]=books.get(i).split("/");
                while(!book.equals(query[1]))
                    {
                    i++;
                    query=books.get(i).split("/");
                    }
                returned[i]=true;
                }
            else if(s.contains("SHELVE"))
                {
                 
                 for (int i = 0; i < returned.length; i++) {
                    String query[]=books.get(i).split("/");
                    if(returned[i])
                        {
                        int j=i-1;
                        try{
                        while(!isBook[j])
                            {
                            j--;
                            }
                        String query2[]=books.get(j).split("/");
                        System.out.println("Put "+query[1]+" after "+query2[1]);
                        }catch(Exception e)
                            {
                            System.out.println("Put "+query[1]+" first");
                            }
                        isBook[i]=true;
                        }
                    }
                returned=new boolean[books.size()];
                System.out.println("END");
                }
            }
        
    }
}
/*
"a" by b.
"b" by c.
END
BORROW "a"
BORROW "b"
RETURN "b"
RETURN "a"
SHELVE
END



Chaucer, B./"The Canterbury Taless"
Chaucer, G./"The Canterbury Tales"
Kernighan, B. and Ritchiee, D./"The C Programming Languag"
Kernighan, B. and Ritchiee, D./"The C Programming Language"
Kernighan, B. and Ritchiee, D./"The D Programming Language"
Naipaul, V.S./"A Congo Diary"
Naipaul, V.S./"A House for Mr. Biswas"
Sedgewick, R./"Algorithms"
END
BORROW "Algorithms"
BORROW "The C Programming Language"
BORROW "The C Programming Languag"
BORROW "The Canterbury Taless"
SHELVE
RETURN "Algorithms"
SHELVE
RETURN "The C Programming Languag"
SHELVE
BORROW "The C Programming Languag"
BORROW "The Canterbury Taless"
BORROW "A House for Mr. Biswas"
RETURN "The Canterbury Taless"
SHELVE
RETURN "The C Programming Language"
RETURN "A House for Mr. Biswas"
SHELVE
END

*/