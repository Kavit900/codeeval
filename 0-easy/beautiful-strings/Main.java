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
			int i = caclBeautyString(line);
			System.out.println(i);
		}
	}

	public static int caclBeautyString(String line)throws Exception
	{
		// This bug to be fixed all special characters are not removed
		String result = line.replaceAll(" ","");
    result = result.toLowerCase();
    char[] result_char = result.toCharArray();
		//System.out.println(result);
		HashSet<String> uset = new HashSet<String>();

    String result1 = "";
    for(int i=0; i<result_char.length; i++)
    {
      if(!Character.isLetter(result_char[i]))
      {
        continue;
      }
      String o = Character.toString(result_char[i]);
      result1 = o + result1;
      if(!uset.contains(o))
      {
        uset.add(o);
      }
    }

		String[] res1 = result1.split("");
		/*for(int i=0; i<res1.length; i++)
		{
			if(!uset.contains(res1[i]))
			{
				uset.add(res1[i]);
			}
		}*/
		HashMap<String, Integer> b_map = new HashMap<String, Integer>();

		for(String t : uset)
   			{
   				//System.out.print(t);
   				b_map.put(t,0);
   			}
   		//System.out.println();

   		for(int i=0; i<res1.length; i++)
   		{
   			b_map.put(res1[i],b_map.get(res1[i])+1);
   		}
   		LinkedHashMap sortedMap = new LinkedHashMap();
   		sortedMap = sortHashMapByValuesD(b_map);
   		int sum = 0;
   		Iterator<String> keySetIterator = sortedMap.keySet().iterator();
   		int len = 0;
   		String num_string = "";
		while(keySetIterator.hasNext())
		{
  			String key = keySetIterator.next();	
  			int x = (int)sortedMap.get(key);
  			len++;
  			//System.out.print(x);
       		//Iterator keyIt = mapKeys.iterator();
       		//num_string = Integer.toString(x) + num_string;
   		}
   		int q = 26 - len + 1;
   		Iterator<String> keyIterator = sortedMap.keySet().iterator();
   		while(keyIterator.hasNext())
		{
  			String key = keyIterator.next();	
  			int x = (int)sortedMap.get(key);
  			sum += q*x;
  			//System.out.println(x);
  			q++;
  		}
   		//System.out.println();
   		//int num = Integer.parseInt(num_string);
   		//sum = num;

   		//String[] num_string1 = num_string.split("");
   		//for(int i=0; i<num_string1.length; i++)
   		//{
   		//	sum += q*Integer.parseInt(num_string1[i]);
   		//	q--;
   		//}
		return sum;
	}

	public static LinkedHashMap sortHashMapByValuesD(HashMap passedMap) 
	{
   		List mapKeys = new ArrayList(passedMap.keySet());
   		List mapValues = new ArrayList(passedMap.values());
   		Collections.sort(mapValues);
	    Collections.sort(mapKeys);

   		LinkedHashMap sortedMap = new LinkedHashMap();

   		Iterator valueIt = mapValues.iterator();	
   		while (valueIt.hasNext()) 
   		{
       		Object val = valueIt.next();
       		Iterator keyIt = mapKeys.iterator();

	        while (keyIt.hasNext()) 
	        {
           		Object key = keyIt.next();
           		String comp1 = passedMap.get(key).toString();
           		String comp2 = val.toString();

           		if (comp1.equals(comp2))
           		{
               		passedMap.remove(key);
               		mapKeys.remove(key);
               		sortedMap.put((String)key, (int)val);
               		break;
        	    }

       		}

   		}
   		return sortedMap;
	}
}