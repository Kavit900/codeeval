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
			int n = Integer.parseInt(line);
			System.out.println(fibonacci(n));
		}
	}

	public static int fibonacci(int N)throws Exception
	{
		if(N == 0)
		{
			return 0;
		}
		if(N == 1)
		{
			return 1;
		}
		else
		{
			return fibonacci(N-1) + fibonacci(N-2);
		}
	}
}