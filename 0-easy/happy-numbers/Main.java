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
			System.out.println(checkHappyNumber(n));
		}
	}

	public static int caclSquare(int n)throws Exception
	{
		return n*n;
	}

	public static int caclLength(int n)throws Exception
	{
		int x = n;
		int len = 0;
		while(x > 0)
		{
			len++;
			x = x/10;
		}
		return len;
	}

	public static int[] caclArrayOfNum(int n, int len)throws Exception
	{
		int[] a = new int[len];
		int x = n;
		int j = 0;
		while(x > 0)
		{
			int r = x%10;
			a[j] = r;
			x = x/10;
			j++;
			//System.out.println(sum);
		}
		return a;
	}

	public static int checkHappyNumber(int n)throws Exception
	{
		HashSet<Integer> uset = new HashSet<Integer>();
		while(true)
		{
			if(n == 1)
			{
				return 1;
			}
			else
			{
				int len = caclLength(n);
				int[] a = new int[len];
				a = caclArrayOfNum(n,len);
				int sum = 0;
				for(int i=0; i<len; i++)
				{
					sum += caclSquare(a[i]);
				}
				if(uset.contains(sum))
				{
					return 0;
				}
				else
				{
					uset.add(sum);
				}
				//System.out.println(sum);
				n = sum;
			}
		}
	}
}