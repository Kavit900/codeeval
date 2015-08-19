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
			int max_len = 0;
			String result = "";
			for(int i=0; i<s.length; i++)
			{
				int x = s[i].length();
				if(max_len < x)
				{
					max_len = x;
					result = s[i];
				}
			}
			System.out.println(result);
		}
	}
}