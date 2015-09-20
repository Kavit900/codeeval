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
			HashSet<String> hashmap = new HashSet<String>();
			ArrayList<String> list = new ArrayList<String>();
			int index = 0;
			String value = "";
			for(int i=0; i<s.length; i++)
			{
				if(!hashmap.contains(s[i]))
				{
					hashmap.add(s[i]);
					list.add(s[i]);
				}	
				else
				{
					index = i;
					value = s[i];
					break;
				}
			}

			// find the index of the value in list 
			int index_list = 0;
			for(int i=0; i<list.size(); i++)
			{
				if(list.get(i).equals(value))
				{
					index_list = i;
				}
			}

			String result = "";
			int k = index;
			for(int i=index_list; i<list.size(); i++)
			{
				if(list.get(i).equals(s[k]))
				{
					result += list.get(i);
					result += " ";
				}
				else
				{
					break;
				}
				k++;
			}
			System.out.println(result.trim());
		}
	}
}