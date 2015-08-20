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
			String[] s = line.split(" ");
			for(int i=0; i<s.length; i++)
			{
				s[i] = s[i].substring(s[i].length()-1)+s[i].substring(1,s[i].length()-1)+s[i].substring(0,1);
				System.out.print(s[i]+" ");
			}
			System.out.println();
		}
	}
}