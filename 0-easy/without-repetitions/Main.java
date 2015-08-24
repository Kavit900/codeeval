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
			String result = "";
			line = line.trim();
			if(line != null)
			{
				String[] s = line.split("");
				result += s[0];
				for(int i=1; i<s.length; i++)
				{
					if(s[i].charAt(0) != result.charAt(result.length()-1))
					{
						result += s[i];
					}
				}
			}
			System.out.println(result);
		}
	}
}