import java.io.*;
import java.util.*;

public class Main
{
	static HashMap<String, Integer> hex_map = new HashMap<String, Integer>(); 


	public static void main(String[] args)throws Exception
	{
		hex_map.put("0",0);
		hex_map.put("1",1);
		hex_map.put("2",2);
		hex_map.put("3",3);
		hex_map.put("4",4);
		hex_map.put("5",5);
		hex_map.put("6",6);
		hex_map.put("7",7);
		hex_map.put("8",8);
		hex_map.put("9",9);
		hex_map.put("a",10);
		hex_map.put("b",11);
		hex_map.put("c",12);
		hex_map.put("d",13);
		hex_map.put("e",14);
		hex_map.put("f",15);
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;

		while((line=in.readLine()) != null)
		{
			line = line.trim();
			String[] s = line.split(" ");
			String hex = s[0];
			//String[] s = line.split("");
			//System.out.println(calcDecimalValue(s));
			System.out.println(hexToDecimal(hex));
		}
	}

	public static int hexToDecimal(String hex)throws Exception
	{
		return Integer.parseInt(hex, 16);
	}

	public static int calcExponent(int len)throws Exception
	{
		int res = 1;
		for(int i=0; i<len; i++)
		{
			res = res*16;
		}
		return res;
	}

	public static int calcDecimalValue(String[] s)throws Exception
	{
		int len = s.length;
		int res = 0;
		int j = len-1;
		for(int i=0; i<len; i++)
		{
			res += hex_map.get(s[i])*calcExponent(j);
			j--;
		}
		return res;
	}
}