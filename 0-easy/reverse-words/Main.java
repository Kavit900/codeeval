/* 
Write a program which reverses the words in an input sentence. 
*/
import java.io.*;
import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main{

	public static void main(String[] args)throws IOException
	{
		File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;

        while ((line = in.readLine()) != null)
        {
            line = line.trim();

          
            String[] s1 = line.split(" ");
            
        	
            for(int i=s1.length-1; i>=0 ;i--)
            {
                System.out.print(s1[i]);

                if(i == 0)
                {
                    System.out.println();
                }
                else
                {
                    System.out.print(" ");
                }
            }       
        }
    }
}
