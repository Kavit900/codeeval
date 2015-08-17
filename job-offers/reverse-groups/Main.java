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
			String[] s1 = line.split(";");
			int k = Integer.parseInt(s1[1]);
			String[] num_list = s1[0].split(",");
			String[] rev_list = new String[num_list.length];
			int div = num_list.length / k;
			int x = 0;
			int ref = 0;
			for(int i=0; i<div; i++)
			{
				ref = (i+1)*k;
				for(int j=(i+1)*k-1; j>=i*k; j--)
				{
					rev_list[x] = num_list[j];
					x++;
				}
			}
			if(num_list.length%k != 0)
			{
				for(int i=ref; i<num_list.length; i++)
				{
					rev_list[x] = num_list[i];
					x++;
					//System.out.print(rev_list[]);
				}
			}
			for(int i=0; i<rev_list.length; i++)
			{
				if(i != rev_list.length-1)
				{
				System.out.print(rev_list[i]+",");
				}else {
				System.out.print(rev_list[i]);
				}
			}
			System.out.println();
		}
	}
}