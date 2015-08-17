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
			String[] array1 = s1[0].split(",");
			String[] array2 = s1[1].split(",");
			//System.out.println(array1[3]);
			int i=0;
			int j=0;
			String set = "";
			//System.out.println(array2[2]);
			while((i != array1.length) && (j != array2.length))
			{
				int x = Integer.parseInt(array1[i]);
				int y = Integer.parseInt(array2[j]);
				//System.out.println(i);
				if(x == y)
				{
					set = set + Integer.toString(x) + ",";
					i++;
					j++;
				}
				else if(x > y)
				{
					j++;
				}
				else
				{
					i++;
				}	
			}
			if(set != "")
			{
			System.out.println(set.substring(0,set.length()-1));
			}
			else
			{
				System.out.println();
			}
		}
	}
}