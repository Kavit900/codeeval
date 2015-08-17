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
			if(line != null)
			{
			int[] num = new int[10];
			for(int i=0; i<10; i++)
			{
				num[i] = 0;
			}
			int n = Integer.parseInt(line);
			int len = 0;
			int x = n;

			while(x > 0)
			{
				len++;
				//System.out.println(x);
				x = x/10;
			}
			x = n;
			int[] s_int = new int[len];
			int j = len-1;
			//System.out.println(j);
			while(x > 0)
			{
				int r = x%10;
				s_int[j] = r;
				x = x/10;
				j--;
			}
			for(int i=0; i<len; i++)
			{
				num[s_int[i]]++;
			}
			int flag = 1;
			for(int i=0; i<len; i++)
			{
				//System.out.println(s_int[i]);
				if(s_int[i] != num[i])
				{
					flag = 0;
					break;
				}
			}
			System.out.println(flag);
			}
		}
	}
}