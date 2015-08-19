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
			String[] s_initial = line.split(":");
			s_initial[0] = s_initial[0].trim();
			//s_initial[1] = s_initial[1].trim();
			// Our array is ready to be swapped
			String[] s_array = s_initial[0].split(" ");

			String[] s_pos = s_initial[1].split(",");

			// Here our swapping logic will come
			for(int i=0; i<s_pos.length; i++)
			{
				s_pos[i] = s_pos[i].trim();
				String[] pos = s_pos[i].split("-");
				int first = Integer.parseInt(pos[0]);
				int second = Integer.parseInt(pos[1]);
				String temp = s_array[first];
				s_array[first] = s_array[second];
				s_array[second] = temp;
			}
			String result = "";
			for(int i=0; i<s_array.length; i++)
			{
				result += s_array[i] + " ";
			}
			System.out.println(result.trim());
		}
	}
}