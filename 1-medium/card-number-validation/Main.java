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
			line = line.replaceAll("\\s","");
			//System.out.println(line);
			int[] A = new int[line.length()];
			for(int i=0; i<line.length(); i++)
			{
				A[i] = Integer.parseInt(Character.toString(line.charAt(i)));
			}
			int[] result = new int[A.length];
			int count = 1;
			for(int j=A.length-1; j>=0 ; j--)
			{
				if(count%2 == 0)
				{
					int x = A[j]*2;
					if(x > 9)
					{
						int sum = 0;
						while(x>0)
						{
							int r = x%10;
							sum += r;
							x = x/10;
						}
						//System.out.println(sum);
						result[j] = sum;
					}
					else
					{
						result[j] = x;
					}
				}
				else
				{
					result[j] = A[j];
				}
				count++;
			}
			int sum1 = 0;
			for(int i=0; i<result.length; i++)
			{
				sum1 += result[i];
				//System.out.print(result[i]);
			}
			if(sum1%10 == 0)
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("0");
			}
		}
	}
}