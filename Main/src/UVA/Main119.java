/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 *
 * @author jojstepersan
 */
public class Main119 {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=in.readLine())!=null)
            {
            int casos=Integer.valueOf(s);
            friend[] amigos=new friend[casos];
            StringTokenizer names=new StringTokenizer(in.readLine());
            for (int i = 0; i <casos; i++) 
                {
                friend f=new friend();
                f.name=names.nextToken();
                amigos[i]=f;
               // System.out.println(f);
                }
            for (int i = 0; i < casos; i++)
                {
                StringTokenizer st=new StringTokenizer(in.readLine());
                String amiDonador=st.nextToken();
                friend f=new friend();
                int x=0;
                do{
                    f=amigos[x];
                    } while(!amiDonador.equals(amigos[x++].name));
                f.dineroDar=Integer.valueOf(st.nextToken());
                f.friends=Integer.valueOf(st.nextToken());
                for (int j = 0; j < f.friends; j++) 
                    {   
                    int k=0;
                    String name=st.nextToken();
                    friend f2=new friend();
                    do{
                        f2=amigos[k];
                        }while(!name.equals(amigos[k++].name));
                    f2.recivirDinero(f.darDinero());
                    }
                }
            for (int i = 0; i < amigos.length; i++) {
                    System.out.println(amigos[i]);
                }
                System.out.println("");
            }
    }
}
class friend{
    
int dineroDar;
String name;
int dineroRecivido;
int dineroDado;
int friends;
boolean flag=true;
public void recivirDinero(int dinero)
    {
    dineroRecivido+=dinero;
    }

public int darDinero()
    {
    if(flag)
        {
        dineroDado=(dineroDar/friends)*friends;
        flag=false;
        }
    return dineroDar/friends;
    }

public int total()
    {
     if(friends==0)
         return dineroRecivido+dineroDar;
    return dineroRecivido-dineroDado;
    }
@Override
public String toString()
    {
    return name+" "+total();
    }
}
/*
import java.io.*;  
 import java.util.*;  
 public class GreedyGift {  
      public static void main(String[] args) throws Exception {  
           try {  
                Reader.init(System.in);  
                // Reader.init(new FileInputStream(new File("input.in")));  
                boolean isRunning = true;  
                boolean isFirst = true;  
                while (isRunning) {  
                     int noOfPeoples = Reader.nextInt();  
                     PeopleContainer cont = new PeopleContainer();  
                     for (int i = 0; i < noOfPeoples; i++)  
                          cont.addPeople(Reader.next());  
                     for (int i = 0; i < noOfPeoples; i++) {  
                          String gaverName = Reader.next();  
                          int giftValues = Reader.nextInt();  
                          int noOfGiven = Reader.nextInt();  
                          if (noOfGiven == 0)  
                               continue;  
                          while (giftValues % noOfGiven != 0) {  
                               giftValues--;  
                          }  
                          cont.addValue(gaverName, -giftValues);  
                          if (noOfGiven != 0) {  
                               int tempVal = giftValues / noOfGiven;  
                               for (int j = 0; j < noOfGiven; j++) {  
                                    String getterName = Reader.next();  
                                    cont.addValue(getterName, tempVal);  
                               }  
                          }  
                     }  
                     if (!isFirst)  
                          System.out.println("");  
                     cont.printAll();  
                     isFirst = false;  
                }  
           } catch (Exception ex) {  
                // ex.printStackTrace();  
           }  
      }  
 }  
 class People {  
      String name;  
      int val;  
 }  
 class PeopleContainer {  
      ArrayList<People> list;  
      PeopleContainer() {  
           list = new ArrayList<People>();  
      }  
      public void addPeople(String name) {  
           People pep = new People();  
           pep.name = name;  
           pep.val = 0;  
           list.add(pep);  
      }  
      public void addValue(String name, int value) {  
           Iterator it = list.iterator();  
           while (it.hasNext()) {  
                People tmp = (People) it.next();  
                if (tmp.name.equals(name)) {  
                     tmp.val += value;  
                     return;  
                }  
           }  
      }  
      public void printAll() {  
           Iterator it = list.iterator();  
           while (it.hasNext()) {  
                People tmp = (People) it.next();  
                System.out.println(tmp.name + " " + tmp.val);  
           }  
      }  
 }  
 /** Class for buffered reading int and double values */  
 /** http://www.cpe.ku.ac.th/~jim/java-io.html   
 class Reader {  
      static BufferedReader reader;  
      static StringTokenizer tokenizer;  
      /** call this method to initialize reader for InputStream   
      static void init(InputStream input) {  
           reader = new BufferedReader(new InputStreamReader(input));  
           tokenizer = new StringTokenizer("");  
      }  
      /** get next word 
      static String next() throws IOException {  
           while (!tokenizer.hasMoreTokens()) {  
                tokenizer = new StringTokenizer(reader.readLine());  
           }  
           return tokenizer.nextToken();  
      }  
      static int nextInt() throws IOException {  
           return Integer.parseInt(next());  
      }  
      static double nextDouble() throws IOException {  
           return Double.parseDouble(next());  
      }  
 }  
*/