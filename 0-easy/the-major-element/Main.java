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
			HashSet<Integer> uset = new HashSet<Integer>();
			for(int i=0; i<s.length; i++)
			{
				int x = Integer.parseInt(s[i]);
				if(!uset.contains(x))
				{
					uset.add(x);
				}
			}
			int len = s.length;
			int size = uset.size();
			HashMap<Integer, Integer> num_map = new HashMap<Integer,Integer>();
			/*for(int i=0; i<size; i++)
			{
				num_map.put(uset.get(i),0);
			}*/

			/*Iterator iterator = uset.iterator(); 

  			while (iterator.hasNext())
  			{
  				int x = Integer.parseInt(iterator.next());
   				num_map.put(x,0);
   			}*/

   			for(int t : uset)
   			{
   				//System.out.println(t);
   				num_map.put(t,0);
   			}

			for(int i=0; i<len; i++)
			{
				int x = Integer.parseInt(s[i]);
				num_map.put(x, num_map.get(x) + 1);
			}

			int flag = 0;
			int num = 0;
			Iterator<Integer> keySetIterator = num_map.keySet().iterator();

			while(keySetIterator.hasNext())
			{
  				Integer key = keySetIterator.next();
  				int x = num_map.get(key);
  				//System.out.println(x);
  				if(x > (len/2))
  				{
  					num = key;
  					flag = 1;
  					break;
  				}
			}
			if(flag == 1)
			{
				System.out.println(num);
			}
			else
			{
				System.out.println("None");
			}
			// Here we increment the value in HashMap according to the occurrence 

		}
	}
}