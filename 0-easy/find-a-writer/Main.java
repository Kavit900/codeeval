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
			//System.out.println(line);
			if (line.length() == 0) {
                continue;
            }
			
			String[] s = line.split("\\|");
			
			String encode = s[0];
			String key = s[1].trim();

			StringBuilder result = new StringBuilder();

			for(String w : key.split(" "))
			{
				int i = Integer.parseInt(w);
				result.append(encode.charAt(i-1));
			}
			System.out.println(result.toString());
		}
	}
}