import java.io.*;
import java.util.*;
import java.lang.*;

public class Main
{
	static int count = 0;
	public static void main(String[] args)throws Exception
	{
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;

		int n = Integer.parseInt(line = in.readLine());
		while((line = in.readLine()) != null)
		{
			line = line.trim();
			int num = Integer.parseInt(line);
			int x = (int)Math.sqrt(num);
			int[] A = new int[x+1];
			int count = 0;
			for(int i=x; i>=0; i--)
			{
				A[i] = 0;
			}
			for(int i=x; i>=0; i--)
			{
				int left = num - (i*i);
				int square_left = (int)Math.sqrt(left);
				if((i*i) + (square_left*square_left) == num)
				{
					if(A[i] != 1)
					{
						count++;
						A[i] = 1;
						A[square_left] = 1;
					}
				}
				A[i] = 1;
			}
			System.out.println(count);
		}
	}
}