import java.io.*;
import java.util.*;

public class Main
{
	static String[] pos1;
	public static void main(String[] args)throws Exception
	{
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;

		while((line=in.readLine()) != null)
		{
			line = line.trim();
			String[] s = line.split(";");
			String[] words = s[0].split(" ");
			String[] pos = s[1].split(" ");
			String[] word_res = new String[words.length];
			//Arrays.sort(pos);
			//System.out.print(pos[0]);
			String result = "";
			int missing = 1;
			if(pos.length != words.length)
			{
				pos1 = new String[pos.length+1];
				for(int i=0; i<pos.length; i++)
				{
					pos1[i] = pos[i];
				}
				int flag = 0;
				while(true)
				{
					flag = 0;
					for(int i=0; i<pos.length; i++)
					{
						if(missing == Integer.parseInt(pos[i]))
						{
							flag = 1;
							missing++;
							break;
						}
					}
					if(flag==0)
					{
						break;
					}
				}
				pos1[pos.length] = Integer.toString(missing);
				for(int i=0; i<pos1.length; i++)
				{
					int j = Integer.parseInt(pos1[i]);
					word_res[j-1] = words[i];
					//System.out.print(i);
					//System.out.print(" ");
					//System.out.println(j-1 + " "+word_res[j-1]);
				}
				//System.out.println();
				//System.out.println("****************");
				//System.out.println();
				//for(int i=0; i<word_res.length; i++)
				//{
					//System.out.println(word_res[i]);
				//}
				//System.out.println();
				//System.out.println("****************");
				//System.out.println();
			}
			/*for(int i=0; i<pos1.length; i++)
			{
				pos1[i] = "";
			}*/
			
			for(int i=0; i<word_res.length; i++)
			{
				result += word_res[i]+" ";
			}
			result = result.trim();
			System.out.println(result);
		}
	}
}