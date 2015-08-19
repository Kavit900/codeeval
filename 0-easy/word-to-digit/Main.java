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
			String[] s = line.split(";");
			HashMap<String, String> num_map = new HashMap<String, String>();
			num_map.put("zero","0");
			num_map.put("one","1");
			num_map.put("two","2");
			num_map.put("three","3");
			num_map.put("four","4");
			num_map.put("five","5");
			num_map.put("six","6");
			num_map.put("seven","7");
			num_map.put("eight","8");
			num_map.put("nine","9");
			String result = "";
			for(int i=0; i<s.length; i++)
			{
				result += num_map.get(s[i]);
			}
			System.out.println(result.trim());
		}
	}
}