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
			int num = Integer.parseInt(line);
			System.out.println(sumOfDigits(num));
		}
	}

	public static int sumOfDigits(int N)throws Exception
	{
		int sum = 0;
		while(N > 0)
		{
			int r = N%10;
			sum += r;
			N = N/10;
		}
		return sum;
	}
}