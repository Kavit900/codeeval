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
			String s = line;
			String result = "";
			for(int i=0; i<s.length(); i++)
			{
				int x = (int)s.charAt(i);
				if((x >= 65 && x<= 90) || (x >= 97 && x<= 122))
				{
					result += Character.toString(s.charAt(i)).toLowerCase();
				}
				else
				{
					result += " ";
				}
			}
			result = result.replaceAll("( )+", " ");
			System.out.println(result.trim());
		}
	}
}