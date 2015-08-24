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
			String[] s = line.split(",");
			int count_min = Integer.MAX_VALUE;
			for(int i=0; i<s.length; i++)
			{
				String[] s1 = s[i].split("");
				int count = 0;
				for(int j=0; j<s1.length; j++)
				{
					if(s1[j].compareTo(".")==0)
					{
						count++;
					}
					else if(s1[j].compareTo("Y")==0)
					{
						if(count_min > count)
						{
							count_min = count;
						}
						break;
					}
				}
			}
			System.out.println(count_min);
		}
	}
}