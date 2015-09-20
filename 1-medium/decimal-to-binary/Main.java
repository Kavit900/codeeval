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
			String result = "";
			int n = Integer.parseInt(line);
			while(n > 1)
			{
				int r = n%2;
				result = Integer.toString(r) + result;
				n = n/2;
			}
			result = Integer.toString(n%2) + result;
			System.out.println(result);
		}
	}
}