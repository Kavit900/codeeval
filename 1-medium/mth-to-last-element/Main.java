import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)throws Exception
	{
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;

		while((line = in.readLine()) != null)
		{
			line = line.trim();
			String[] s = line.split(" ");
			int m = Integer.parseInt(s[s.length-1]);
			try
			{
				String[] s_rev = new String[s.length-1];
				int k = 0;
				for(int i=s.length-2; i>=0; i--)
				{
					s_rev[k] = s[i];
					k++;
				}

				System.out.println(s_rev[m-1]);
			}
			catch(Exception e)
			{
				continue;
			}	
		}
	}
}