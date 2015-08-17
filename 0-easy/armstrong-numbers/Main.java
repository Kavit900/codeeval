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
			boolean res = checkArmstrongNumber(digitsOfNumbers(n),n);
			String res1 = "";
			if(res)
			{
				res1 = "True";
			}
			else
			{
				res1 = "False";
			}
			System.out.println(res1);
		}
	}

	public static int calcExponent(int n, int len)throws Exception
	{
		int res = 1;
		for(int i=0; i<len; i++)
		{
			res = res * n;
		}
		return res;
	}

	public static boolean checkArmstrongNumber(int[] digits, int n)throws Exception
	{
		int sum = 0;
		for(int i=0; i<digits.length; i++)
		{
			sum += calcExponent(digits[i],digits.length);
		}
		//System.out.println(sum);
		if(sum == n)
		{
			return true;
		}
		return false;
	}

	public static int[] digitsOfNumbers(int n)throws Exception
	{
		int x = n;
		int len = 0;
		while(x > 0)
		{
			len++;
			x = x/10;
		}
		x = n;
		int[] digits = new int[len];
		int j = 0;
		while(x > 0)
		{
			int r = x%10;
			digits[j] = r;
			x = x/10;
			j++;
		}
		return digits;
	}
}