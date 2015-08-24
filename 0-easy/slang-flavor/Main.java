import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)throws Exception
	{
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;
		int index = 0;
		int count = 1;
		while((line=in.readLine()) != null)
		{
			line = line.trim();
			String[] slang_words = {", yeah!",", this is crazy, I tell ya.",", can U believe this?",", eh?",", aw yea.",", yo.","? No way!",". Awesome!"};
			//System.out.println(slang_words[0]);
			String[] s = line.split("");
			
			
			String result = "";
			for(int i=0; i<s.length; i++)
			{
				if(s[i].compareTo(".")==0)
					{
						if(count%2 == 0)
						{
							result += slang_words[index];
							index = (index + 1)%8;
							count++;
						}
						else
						{
							result += s[i];
							count++;
						}
					}
				else if(s[i].compareTo("!")==0)
					{
						if(count%2 == 0)
						{
							result += slang_words[index];
							index = (index + 1)%8;
							count++;
						}
						else
						{
							result += s[i];
							count++;
						}
					}
				else if(s[i].compareTo("?")==0)
					{
						if(count%2 == 0)
						{
							result += slang_words[index];
							index = (index + 1)%8;
							count++;
						}
						else
						{
							result += s[i];
							count++;
						}
					}
				else
					{
						result += s[i];
					}
				/*if(count%2 == 0)
				{
					if(s[i].compareTo(".")==0)
					{
						result += slang_words[index];
						index = (index + 1)%8;
					}
					if(s[i].compareTo("!")==0)
					{
						result += slang_words[index];
						index = (index + 1)%8;
					}
					if(s[i].compareTo("?")==0)
					{
						result += slang_words[index];
						index = (index + 1)%8;
					}
					else
					{
						result += s[i];
					}
					count++;
				}
				else
				{
					result += s[i];
					count++;
				}*/
			}
			System.out.println(result);
		}
	}
}