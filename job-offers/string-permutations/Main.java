import java.io.*;
import java.util.*;

public class Main
{
	static HashSet<String> uset = new HashSet<String>();
	public static void main(String[] args)throws Exception
	{
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;

		while((line=in.readLine()) != null)
		{
			line = line.trim();
			String[] s = line.split("");
			Arrays.sort(s);
			Perm(s,0,s.length-1);
			//String result = "";
			String[] result = new String[uset.size()];
			int k = 0;
			for(String s1 : uset)
			{
				result[k] = s1;
				k++;
				//result += s1;
				//result += " ";
			}
			Arrays.sort(result);
			for(int i=0; i<result.length; i++)
			{
				System.out.print(result[i]);
				if(i != result.length-1)
				{
					System.out.print(",");
				}
			}
			System.out.println();
			//System.out.println(result.trim());
			uset = new HashSet<String>();
		}
	}

	public static void Perm(String[] s, int k, int n)throws Exception
	{
		if(k==n)
		{
			Add(s);
		}
		else
		{
			for(int i=k; i<=n; i++)
			{
				String t = s[k];
				s[k] = s[i];
				s[i] = t;
				Perm(s, k+1, n);
				t = s[k];
				s[k] = s[i];
				s[i] = t;
			}
		}
	}

	public static void Add(String[] s)throws Exception
	{
		String res = "";
		for(int i=0; i<s.length; i++)
		{
			res += s[i];
		}
		if(!uset.contains(res))
		{
			uset.add(res);
		}
	}
}