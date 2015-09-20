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
			String[] s = line.split(",");
			String check = s[1];
			String s1 = s[0];
			if(s1.endsWith(check))
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("0");
			}
		}
	}
}