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
			int comma_first = line.indexOf(',');
			int comma_second = line.indexOf(',', comma_first+1);
			int brac_first = line.indexOf(')');
			int brac_second = line.indexOf(')',brac_first+1);
			int openbrac_first = line.indexOf('(');
			int openbrac_second = line.indexOf('(',1);
			String x_first = line.substring(1,comma_first);
			String y_first = line.substring(comma_first+2,brac_first);
			String x_second = line.substring(openbrac_second+1,comma_second);
			String y_second = line.substring(comma_second+2,brac_second);
			//System.out.println(x_second);
			//System.out.println(y_second);
			int x_diff = Integer.parseInt(x_first) - Integer.parseInt(x_second);
			x_diff = x_diff*x_diff;
			int y_diff = Integer.parseInt(y_first) - Integer.parseInt(y_second);
			y_diff = y_diff*y_diff;
			int distance = (int)Math.sqrt(x_diff+y_diff);
			System.out.println(distance);
		}
	}
}