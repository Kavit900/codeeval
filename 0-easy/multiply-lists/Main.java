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
			String[] s = line.split("\\|");
			s[0] = s[0].trim();
			s[1] = s[1].trim();
			//System.out.print(s);
			int product = 0;
			String[] s0 = s[0].split(" ");
			String[] s1 = s[1].split(" ");
			//System.out.print(s0[0]);
			for(int i=0; i<s0.length; i++)
			{
				//System.out.println(s0[i]);
				product = Integer.parseInt(s0[i])*Integer.parseInt(s1[i]);				
				System.out.print(product);
				if(i != s0.length-1)
				{
					System.out.print(" ");
				}				
			}
			System.out.println();
		}
	}
}