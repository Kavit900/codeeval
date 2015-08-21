import java.io.*;
import java.util.*;

public class Main
{
	static float[] A;
	static float[] helper;
	public static void main(String[] args)throws Exception
	{
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;

		while((line=in.readLine()) != null)
		{
			line = line.trim();
			String[] s = line.split(" ");
			A = new float[s.length];
			helper = new float[s.length];
			for(int i=0; i<s.length; i++)
			{
				A[i] = Float.parseFloat(s[i]);
			}
			mergesort(0, s.length-1, A);
			for(int i=0; i<s.length; i++)
			{
				System.out.format("%.3f", A[i]);
				if(i != s.length-1)
				{
				System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void mergesort(int low, int high, float[] A)
	{
		if(low < high)
		{
			int mid = low + (high-low)/2;
			mergesort(low, mid, A);
			mergesort(mid+1, high, A);
			merge(low, mid, high, A);
		}
	}

	public static void merge(int low, int mid, int high, float[] A)
	{
		for(int i=low; i<=high; i++)
		{
			helper[i] = A[i];
		}
		int i = low;
		int j = mid+1;
		int k = low;
		while(i<=mid && j<=high)
		{
			if(helper[i] <= helper[j])
			{
				A[k] = helper[i];
				i++;
			}
			else
			{
				A[k] = helper[j];
				j++;
			}
			k++;
		}
		while(i <= mid)
		{
			A[k] = helper[i];
			k++;
			i++;
		}
	}
}