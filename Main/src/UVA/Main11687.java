/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UVA;

/**
 *
 * @author stiven
 * 11687 - Digits
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main11687 {

	public static void main(String[]args)throws IOException  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s=br.readLine())!=null && !s.equals("END")) {
			String x=s;
			String lastX=String.valueOf(s.length());
			
			if (x.equals(lastX)) {
				System.out.println(1);
			} else {
				int count=0;
				while (!x.equals(lastX)) {
					lastX=x;
					x=String.valueOf(x.length());
					count++;
				}
				System.out.println(count);
			}
		}
	}
}