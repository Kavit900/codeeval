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
			
			for(int i=1; i<=line.length(); i++)
			{
				String s = line.substring(0,i);

				String[] s1 = line.split(s);

				int flag = 1;
				for(String x : s1)
				{
					if(!x.isEmpty())
					{
						flag = 0;
						break;
					}
					//System.out.print(x);
				}
				if(flag == 1)
				{
					System.out.println(s.length());
					break;
				}
				//System.out.println();
			}
		}
	}
}