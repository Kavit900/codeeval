import java.io.*;
import java.util.*;


public class Main
{
	public static void main(String[] args)throws Exception
	{
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;

		List<Integer> num_list = new ArrayList<Integer>();

		while((line=in.readLine()) != null)
		{
			line = line.trim();
			num_list.add(Integer.parseInt(line));
		}
		int sum = 0;
		for(int i=0; i<num_list.size(); i++)
		{
			sum += num_list.get(i);
		}
		System.out.print(sum);
	}
}