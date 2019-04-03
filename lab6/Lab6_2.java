package lab6;

import java.io.BufferedReader;
import java.io.FileReader;
/**
 * 
 * @author Vishal Singh
 *
 */

public class Lab6_2{
	public static void main(String args[]) //throws FileNotFoundException 
	{
		String line = null;
		int count=0;

         try {
            FileReader fr=new FileReader("F:\\source.txt");
            BufferedReader br = new BufferedReader(fr);
          
            while ((line = br.readLine()) != null) {
            	count++;
            System.out.println("Line "+count+" : "+line);
     
             }       
            } catch(Exception e) {
                  e.printStackTrace();
                }
       }
}