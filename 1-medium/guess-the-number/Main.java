import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)throws Exception
	{
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;

		while((line = in.readLine()) != null)
		{
			line = line.trim();
			String[] s = line.split(" ");

			int n = Integer.parseInt(s[0]);
			String fin = s[s.length-1];

			int result = 0;
			int high = n;
			int low = 0;
			for(int i=1; i<s.length; i++)
			{
				
				if(s[i].compareTo("Lower") == 0)
				{
					double x = Math.ceil((high+low)/2);
				//System.out.println(x);
				//System.out.print("Lower:");
				//System.out.println(low);
					result = (int)x;
					high = result;
				}
				else if(s[i].compareTo("Higher") == 0)
				{
					double x = Math.ceil((high+low)/2);
				//System.out.println(x);
				//System.out.print("Lower:");
				//System.out.println(low);
					result = (int)x;
					low = result;
				}
				else
				{
					double x = Math.ceil((high+low)/2);
				//System.out.println(x);
					result = (int)x;
					break;
				}
			}
			System.out.println(result+1);	
		}

	}
}