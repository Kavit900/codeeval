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
			int len = s.length;
			int mid = (int)Math.sqrt(len);
			String[][] matrix = new String[mid][mid];
			int k = 0;
			for(int i=0; i<mid; i++)
			{
				for(int j=0; j<mid; j++)
				{
					matrix[i][j] = s[k];
					k++;
				}
			}

			// Here we will print the rotated 90 degree matrix
			int n = mid;
			String result = "";
			for(int j=0; j<n; j++)
			{
				for(int i=n-1; i>=0; i--)
				{
					//System.out.print(matrix[i][j]+" ");
					result += matrix[i][j] + " ";
				}
			}
			System.out.println(result.trim());
		}
	}
}