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
			int n = Integer.parseInt(line);
			int sum = 0;
			int count = 0;
			while(true)
			{
				sum = n + reverseDigits(n);
				if(checkPalindrome(sum))
				{
					count++;
					System.out.print(count);
					System.out.print(" ");
					System.out.print(sum);
					System.out.println();
					break;
				}
				else
				{
					count++;
					n = sum;
				}
			}
		}
	}
	 public static int reverseDigits(int n)
    {
        char[] array = Integer.toString(n).toCharArray();

        for (int i = 0; i < array.length/2; i++) {
            char tmp = array[i];
            array[i] = array[array.length -1 -i];
            array[array.length -1 - i] = tmp;
        }

        return Integer.parseInt(new String(array));
    }

	public static int reverseNum(int n)throws Exception
	{
		String initial = Integer.toString(n);
		StringBuilder result = new StringBuilder(initial.length());

		for(int i=initial.length()-1; i>=0; i--)
		{
			result.append(initial.charAt(i));
		}
		return Integer.parseInt(result.toString());
	}

	public static boolean checkPalindrome(int n)throws Exception
	{
		String initial = Integer.toString(n);
		StringBuilder result = new StringBuilder(initial.length());

		for(int i=initial.length()-1; i>=0; i--)
		{
			result.append(initial.charAt(i));
		}
		String new_str = result.toString();
		if(initial.compareTo(new_str) == 0)
		{
			return true;
		}
		return false;
	}
}