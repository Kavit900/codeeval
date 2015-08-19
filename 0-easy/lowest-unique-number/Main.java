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
			HashMap<String, Integer> uset = new HashMap<String, Integer>();
			HashSet<String> hashset = new HashSet<String>();
			int min = Integer.MAX_VALUE;
			int index = 0;
			for(int i=0; i<s.length; i++)
			{
      			//String o = Character.toString(s[i]);
      			if(!hashset.contains(s[i]))
      			{
        			hashset.add(s[i]);
      			}			
			}
			for(String t : hashset)
			{
				uset.put(t,0);				
			}
			for(int i=0; i<s.length; i++)
			{
				uset.put(s[i],uset.get(s[i])+1);				
			}
			String value = "";
			int flag = 0;
			for(String key : uset.keySet())
			{
				if(uset.get(key) == 1)
				{
					if(min > Integer.parseInt(key))
					{
						flag = 1;
						//value = s[i];
						min = Integer.parseInt(key);
					}
				}				
			}
			if(flag == 1)
			{
				for(int i=0; i<s.length; i++)
				{
					if(min == Integer.parseInt(s[i]))
					{
						index = i+1;
					}
				}
			}
			else
			{
				index = 0;
			}
			System.out.println(index);
		}
	}
}