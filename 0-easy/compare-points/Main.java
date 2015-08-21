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
			int x1 = Integer.parseInt(s[0]);
			int y1 = Integer.parseInt(s[1]);
			int x2 = Integer.parseInt(s[2]);
			int y2 = Integer.parseInt(s[3]);
			if(x1 == x2 && y1 == y2)
			{
				System.out.println("here");
			}
			else if(x1 == x2 && y1 != y2)
			{
				if(y1 > y2)
				{
					System.out.println("S");
				}
				else
				{
					System.out.println("N");
				}
			}
			else if(x1 != x2 && y1 == y2)
			{
				if(x1 > x2)
				{
					System.out.println("W");
				}
				else
				{
					System.out.println("E");
				}
			}
			else
			{
				if(x1 < x2 && y1 < y2)
				{
					System.out.println("NE");
				}
				else if(x1 > x2 && y1 < y2)
				{
					System.out.println("NW");
				}
				else if(x1 > x2 && y1 > y2)
				{
					System.out.println("SW");
				}
				else
				{
					System.out.println("SE");
				}
			}
		}
	}
}