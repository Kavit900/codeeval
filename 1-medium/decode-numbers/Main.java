import java.io.*;
import java.util.*;


public class Main
{
	static int count = 0;
	public static void main(String[] args)throws Exception
	{
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;

		while((line = in.readLine()) != null)
		{
			count = 0;
			line = line.trim();
			String[] s = line.split("");
			int[] A = new int[s.length];
			for(int i=0; i<s.length; i++)
			{
				A[i] = 0;
			}
			calcComb(A,s,0,s.length);
			System.out.println(count);
		}
	}

	public static void calcComb(int[] A, String[] s, int k, int N)throws Exception
	{
		if(k==N-1)
		{
			A[k] = 0;
			countNumber(A,s);
			A[k] = 1;
			countNumber(A,s);
			return;
		}
		A[k] = 0;
		calcComb(A,s,k+1,N);
		A[k] = 1;
		calcComb(A,s,k+1,N);
	}

	public static void countNumber(int[] A, String[] s)throws Exception
	{
		String res = "";
		int sum = 0;
		for(int i=0; i<s.length; i++)
		{
			if(A[i] == 1)
			{
				res += s[i];
				sum++;
			}
		}
		if(sum != 0)
		{
			if(Integer.parseInt(res) <= 26)
			{
				count++;
			}
		}
	}
}