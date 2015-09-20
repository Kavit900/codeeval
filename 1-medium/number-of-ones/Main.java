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
			int n = Integer.parseInt(line);
			String s = binaryString(n);
			int count = 0;
			for(int i=0; i<s.length(); i++)
			{
				if(s.charAt(i) == '1')
				{
					count++;
				}
			}
			System.out.println(count);
		}
	}

	public static String binaryString(int n)throws Exception
	{
		String result = "";
		while(n!=0 && n!=1)
		{
			int r = n%2;
			n = n/2;
			result += Integer.toString(r);
		}
		result += Integer.toString(n);
		return result;
	}
}
