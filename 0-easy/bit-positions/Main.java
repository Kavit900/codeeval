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
			String[] s1 = line.split(",");
			int n = Integer.parseInt(s1[0]);
			int p1 = Integer.parseInt(s1[1]);
			int p2 = Integer.parseInt(s1[2]);
			System.out.println(checkBits(n,p1,p2));
			//System.out.println(binaryOfNumber(n));
		}
	}

	public static boolean checkBits(int n, int p1, int p2)throws Exception
	{
		boolean bit1 = (n & (0x1 << (p1-1))) == 0;
		boolean bit2 = (n & (0x1 << (p2-1))) == 0;

		return bit1 == bit2;
	}
}