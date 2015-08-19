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
			// flag will be 1 for + sign and 2 for - sign
			int flag = 0;
			int pos = 0;
			for(int i=0; i<s[1].length(); i++)
			{
				int x = (int)s[1].charAt(i);
				if(x == 43)
				{
					flag = 1;
					pos = i;
					break;
				}
				else if(x == 45)
				{
					flag = 2;
					pos = i;
					break;
				}
				else
				{
					continue;
				}
			}
			String num1 = s[0].substring(0,pos);
			String num2 = s[0].substring(pos);
			int number1 = Integer.parseInt(num1);
			int number2 = Integer.parseInt(num2);
			if(flag == 1)
			{
				System.out.println(number1+number2);
			}
			else
			{
				System.out.println(number1-number2);
			}
		}
	}
}