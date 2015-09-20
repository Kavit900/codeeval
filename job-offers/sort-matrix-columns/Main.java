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
			String[] s = line.split("\\|");
			int N = s.length;
			int[][] matrix = new int[N][N];
			for(int i=0; i<s.length; i++)
			{
				s[i] = s[i].trim();
				String[] s1 = s[i].split(" ");
				for(int j=0; j<s1.length; j++)
				{
					matrix[i][j] = Integer.parseInt(s1[j]);
				}
			}
			int row_flag = 0;
			for(int i=0; i<N; i++)
			{
				if(rowValue(matrix,i,N))
				{
					row_flag = i;
					break;
				}
				else
				{
					continue;
				}
			}
			/*for(int i=0; i<N; i++)
			{
				System.out.print(matrix[row_flag][i]);
				System.out.print(" ");
			}
			System.out.println();
			*/

			// Now we will sort the row according to values
			HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
			for(int i=0; i<N; i++)
			{
				hashmap.put(i,matrix[row_flag][i]);
				//row_array[i] = matrix[row_flag][i];
				//System.out.print(matrix[row_flag][i]);
				//System.out.print(" ");
			}
			//LinkedHashMap<Integer,Integer> sortedMap = new LinkedHashMap<Integer,Integer>();

			LinkedHashMap<Integer, Integer> linkmap = new LinkedHashMap<Integer, Integer>();
			linkmap = sortHashMapByValuesD(hashmap);
    		/*Iterator it = linkmap.entrySet().iterator();
    		while (it.hasNext()) 
    		{
        		Map.Entry pair = (Map.Entry)it.next();
        		System.out.println(pair.getKey() + " = " + pair.getValue());
        		//it.remove(); // avoids a ConcurrentModificationException
    		}
    		*/
    		//System.out.println("1");
    		int[] row_value = new int[N];
    		int k=0;
    		Iterator it = linkmap.entrySet().iterator();
    		while (it.hasNext()) 
    		{
    			Map.Entry pair = (Map.Entry)it.next();
    			row_value[k] = (Integer)pair.getKey();
    			k++;
    		}

    		/*for(int j=0; j<N; j++)
    		{
    			System.out.print(row_value[j]);
    			System.out.print(" ");
    		}
    		System.out.println();
    		*/
    		String result = "";
    		for(int i=0; i<N; i++)
    		{
    			for(int j=0; j<N; j++)
    			{
    				result += Integer.toString(matrix[i][row_value[j]]);
    				result += " ";
    			}
    			if(i != N-1)
    			{
    				result += "|";
    			}
    			result += " ";
    		}
    		System.out.println(result.trim());
		}
	}



	public static boolean rowValue(int[][] matrix,int row,int N)throws Exception
	{
		HashSet<Integer> map = new HashSet<Integer>();
		for(int i=0; i<N; i++)
		{
			if(!map.contains(matrix[row][i]))
			{
				map.add(matrix[row][i]);
			}
		}
		if(map.size() > 1)
		{
			return true;
		}
		return false;
	}

	public static LinkedHashMap sortHashMapByValuesD(HashMap passedMap) {
   List mapKeys = new ArrayList(passedMap.keySet());
   List mapValues = new ArrayList(passedMap.values());
   Collections.sort(mapValues);
   Collections.sort(mapKeys);

   LinkedHashMap sortedMap = new LinkedHashMap();

   Iterator valueIt = mapValues.iterator();
   while (valueIt.hasNext()) {
       Object val = valueIt.next();
       Iterator keyIt = mapKeys.iterator();

       while (keyIt.hasNext()) {
           Object key = keyIt.next();
           String comp1 = passedMap.get(key).toString();
           String comp2 = val.toString();

           if (comp1.equals(comp2)){
               passedMap.remove(key);
               mapKeys.remove(key);
               sortedMap.put((Integer)key, (Integer)val);
               break;
           }

       }

   }
   return sortedMap;
}
}