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
			String[] row_s = line.split("\\|");
			String[] s1 = row_s[0].split(" ");
			int row_count = row_s.length;
			int col_count = s1.length;
			int[][] A = new int[row_count][col_count];
			//System.out.println(row_count);
			//System.out.println(col_count);
			for(int i=0; i<row_count; i++)
			{
				row_s[i] = row_s[i].trim();
				String[] s_temp = row_s[i].split(" ");
				for(int j=0; j<col_count; j++)
				{
					//s_temp[j] = s_temp[j].trim();
					A[i][j] = Integer.parseInt(s_temp[j]);
					//System.out.print(A[i][j]);
				}
				//System.out.println();
			}
			int max = 0;
			for(int j=0; j<col_count; j++)
			{
				for(int i=0; i<row_count; i++)
				{
					if(max < A[i][j])
					{
						max = A[i][j];
					}
				}
				System.out.print(max);
				if(j != col_count-1)
				{
					System.out.print(" ");
				}
				max = 0;
			}
			System.out.println();
		}
	}
}