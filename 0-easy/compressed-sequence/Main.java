import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)throws Exception
	{
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;

		while((line=in.readLine()) != null)
		{
			line = line.trim();
			String[] s = line.split(" ");
			int[] A = new int[s.length];
			for(int i=0; i<s.length; i++)
			{
				A[i] = Integer.parseInt(s[i]);
			}
			int count = 1;
			int start = A[0];
			int j = 1;
			
			for(int i=1; i<s.length; i++)
			{
				if(A[i] == start)
				{
					count++;
				}
				else
				{
					System.out.print(count);
					System.out.print(" ");
					System.out.print(start);
					System.out.print(" ");
					count = 1;
					start = A[i];
				}	
			}
			System.out.print(count);
			System.out.print(" ");
			System.out.print(start);
			System.out.println();
		}
	}
}