import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws Exception
	{
		int count = 0;
		int i = 2;
		int sum = 0;
		while(count != 1000)
		{
			if(isPrime(i))
			{
				sum += i;
				count++;
			}
			i++;
		}
		System.out.print(sum);
	}

	public static boolean isPrime(int N) throws Exception
	{
		int root = (int)Math.sqrt(N);
		for(int i=2; i<=root; i++)
		{
			if(N%i == 0)
			{
				return false;
			}
		}
		return true;
	}
}