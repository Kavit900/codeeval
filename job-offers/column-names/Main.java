import java.io.*;
import java.util.*;

public class Main
{
	static String[] alpha = {"Z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y"};

	public static void main(String[] args)throws Exception
	{
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;

		while((line=in.readLine()) != null)
		{
			line = line.trim();
			int N = Integer.parseInt(line);
			String ans = "";
			/*if(N%26 == 0)
			{
				ans = perfectDiv(N);
			}
			else
			{
				ans = calcNot(N);
			}*/
			ans = caclAlpha(N);
			System.out.println(ans);
		}
	}

	public static String perfectDiv(int N)throws Exception
	{
		String ans = "";
		while(N > 1)
		{
			int r = N%26;
			if(r == 0)
			{
				ans = alpha[r] + ans;
			}
			else
			{
				//System.out.println(r-1);
				ans = alpha[r-1] + ans;
			}
			N = N/26;
		}
		return ans;
	}

	public static String calcNot(int N)throws Exception
	{
		String ans = "";
		while(N > 0)
		{
			int r = N%26;
			ans = alpha[r] + ans;
			N = N/26;
		}
		return ans;
	}

	public static String caclAlpha(int N)throws Exception
	{
		String ans = "";
		while(N > 0)
		{
			int r = N%26;
			ans = alpha[r] + ans;
			if(r == 0)
			{
				N = N/26 - 1;
			}
			else
			{
				N = N/26;
			}
		}
		return ans;
	}
}