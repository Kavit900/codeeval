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
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			int q = a/b;
			int r = a - (b*q);
			System.out.println(r);
		}
	}
}