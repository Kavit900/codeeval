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

			String result = "";
			if(s.length <= 55)
			{
				result = line;
			}
			else
			{
				int index = 0;
				for(int i=0; i<40; i++)
				{
					result += s[i];
				}
				if(index != 0)
				{
					index = result.lastIndexOf(" ");
					if(index == result.length()-1)
					{
						result = result.trim();
					}
					else
					{
						result = result.substring(0,index);
					}
				}
				result += "... <Read More>";
			}
			System.out.println(result);
		}
	}
}