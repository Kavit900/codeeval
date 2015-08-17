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
			String[] s1 = line.split(",");

			String word = s1[0];
            char c = s1[1].toCharArray()[0];

            System.out.println(word.lastIndexOf(c));

			/*String c = "";
			if(s1[1] != null)
			{
			 c = s1[1];
			}
			String[] word = s1[0].split("");
			int pos = -1;
			for(int i=word.length-1; i>=0; i--)
			{
				if(word[i].compareTo(c) == 0)
				{
					pos = i;
					break;
				}
			}
			
			System.out.println(pos);*/
		}
	}
}