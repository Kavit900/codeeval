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
			String[] s = line.split(" ");
			int num_friends = Integer.parseInt(s[0]);
			int[] A = new int[s.length-1];
			int k = 0;
			for(int i=1; i<s.length; i++)
			{
				A[k] = Integer.parseInt(s[i]);
				k++;
			}
			int diff = Integer.MAX_VALUE;
			for(int i=0; i<A.length; i++)
			{
				diff = Math.min(diff,caclDifference(A[i],A));
			}
			System.out.println(diff);
		}
	}

	public static int caclDifference(int x, int[] A)throws Exception
	{
		int diff = 0;
		for(int i=0; i<A.length; i++)
		{
			diff += Math.abs(A[i]-x);
		}
		return diff;
	}
}