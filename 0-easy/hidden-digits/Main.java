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
			int flag = 0;
			for(int i=0; i<line.length(); i++)
			{
				int x = (int)line.charAt(i);
				if(x >= 48 && x <= 57)
				{
					flag = 1;
					System.out.print(line.charAt(i));
				}
				else if(x >= 97 && x <= 106)
				{
					flag = 1;
					System.out.print(x-97);
				}
				else
				{
					continue;
				}
			}
			if(flag == 0)
			{
				System.out.print("NONE");
			}
			System.out.println();
		}
	}
}