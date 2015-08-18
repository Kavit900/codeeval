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
			System.out.println(swapCase(line));
		}
	}

	public static String swapCase(String line)throws Exception
	{
		String result = "";
		char[] letters = line.toCharArray();
		for(int i=0; i<letters.length; i++)
		{
			int value = (int)letters[i];
			if(value >= 97 && value <= 122)
			{
				result += Character.toString(letters[i]).toUpperCase();
			}
			else if(value >= 65 && value <= 90)
			{
				result += Character.toString(letters[i]).toLowerCase();
			}
			else
			{
				result += Character.toString(letters[i]);
			}
		}
		return result;
	}
}