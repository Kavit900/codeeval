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
			String[] s = line.split(";");
			int[] A = new int[s.length];
			for(int i=0; i<s.length; i++)
			{
				s[i] = s[i].trim();
				String[] s1 = s[i].split(",");
				int num = Integer.parseInt(s1[1]);
				A[i] = num;
				//System.out.println(A[i]);
			}
			Arrays.sort(A);
			int base = A[0];
			System.out.print(base);
			System.out.print(",");
			for(int i=1; i<A.length; i++)
			{
				System.out.print(A[i]-A[i-1]);
				if(i != A.length-1)
				{
					System.out.print(",");
				}
			}
			System.out.println();
		}
	}
}