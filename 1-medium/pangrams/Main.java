import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)throws Exception
	{
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;

		while((line = in.readLine()) != null)
		{
			line = line.trim();
			line = line.replaceAll("\\s+","");
			String[] s = line.split("");

			HashSet<String> hashalpha = new HashSet<String>();
			hashalpha.add("a");
			hashalpha.add("b");
			hashalpha.add("c");
			hashalpha.add("d");
			hashalpha.add("e");
			hashalpha.add("f");
			hashalpha.add("g");
			hashalpha.add("h");
			hashalpha.add("i");
			hashalpha.add("j");
			hashalpha.add("k");
			hashalpha.add("l");
			hashalpha.add("m");
			hashalpha.add("n");
			hashalpha.add("o");
			hashalpha.add("p");
			hashalpha.add("q");
			hashalpha.add("r");
			hashalpha.add("s");
			hashalpha.add("t");
			hashalpha.add("u");
			hashalpha.add("v");
			hashalpha.add("w");
			hashalpha.add("x");
			hashalpha.add("y");
			hashalpha.add("z");

			HashSet<String> hashmap = new HashSet<String>();
			TreeSet<String> newhashmap = new TreeSet<String>();
			//HashSet<String> newhashmap = new HashSet<String>();
			for(int i=0; i<s.length; i++)
			{
				String x = s[i].toLowerCase();
				if(!hashmap.contains(x))
				{
					hashmap.add(x);
				}
			}
			//List sortedList = new ArrayList(hashmap);
			//Collections.sort(sortedList);
			for(String temp : hashalpha)
			{
				//System.out.print(temp);
				if(!hashmap.contains(temp))
				{
					newhashmap.add(temp);
				}
			}
			if(newhashmap.isEmpty())
			{
				System.out.print("NULL");
			}
			else
			{
				for(String temp : newhashmap)
				{
					System.out.print(temp);
				}
			}
			System.out.println();
		}
	}
}