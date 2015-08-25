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
			String[] s = line.split("");
			int count_lower = 0;
			int count_upper = 0;
			for(int i=0; i<s.length; i++)
			{
				//char ch = s[i].charAt(0);
				char ch = s[i].toCharArray()[0];
				if(Character.isLowerCase(ch))
				{
					count_lower++;
				}
				else
				{
					count_upper++;
				}
			}
			float lowerper = 0;
			float upperper = 0;
			//System.out.print(s.length);
			//System.out.print(count_lower);
			if(count_lower != 0)
			{
				lowerper = ((float)count_lower/s.length)*100;
			}
			else
			{
				lowerper = 0;
			}
			if(count_upper != 0)
			{
				upperper = ((float)count_upper/s.length)*100;
			}
			else
			{
				upperper = 0;
			} 
			//String result = "lowercase: "+Integer.toString(count_lower)+" uppercase: "+Integer.toString(count_upper);
			System.out.print("lowercase: ");
			System.out.printf("%.2f", lowerper);
			System.out.print(" uppercase: ");
			System.out.printf("%.2f", upperper);
			System.out.println();
		}
	}
}