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
			int start = generateStartNumber(n);
			int end = generateEndNumber(n);
			//System.out.println(start);
			//System.out.println(end);
			int count = 0;
			for(int i=start; i<=end; i++)
			{
				if(luckyNumber(i))
				{
					count++;
				}
			}
			System.out.println(count);
		}	

	}

	public static boolean luckyNumber(int n)throws Exception
	{
		int sum_first = 0;
		int sum_second = 0;
		String s = Integer.toString(n);
		String[] s1 = s.split("");
		int mid = s1.length/2;
		//int j = mid;
		for(int i=0; i<mid; i++)
		{
			sum_first += Integer.parseInt(s1[i]);
			sum_second += Integer.parseInt(s1[mid+i]);
			//j++;
		}
		return sum_first == sum_second;
	}

	public static int generateStartNumber(int n)throws Exception
	{
		int start = 1;
		for(int i=0; i<n-1; i++)
		{
			start = start*10;
		}
		return start;
	}

	public static int generateEndNumber(int n)throws Exception
	{
		int end = 1;
		int x = 1;
		for(int i=0; i<n-1; i++)
		{
			end += x*10;
			x = x*10;
		}
		return end*9;
	}

}