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
			int amount_left = Integer.parseInt(line);
			int five_coins = amount_left/5;

			amount_left = amount_left - five_coins*5;

			int three_coins = amount_left/3;

			amount_left = amount_left - three_coins*3;

			int one_coins = amount_left;

			System.out.println(five_coins+three_coins+one_coins);
		}
	}
}