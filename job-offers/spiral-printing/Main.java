import java.io.*;
import java.util.*;

public class Main
{
	static int[][] visited;
	public static void main(String[] args)throws Exception
	{
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;

		while((line=in.readLine()) != null)
		{
			line = line.trim();
			String[] s1 = line.split(";");
			int n = Integer.parseInt(s1[0]);
			int m = Integer.parseInt(s1[1]);
			String[] s2 = s1[2].split(" ");

			int[][] A = new int[n][m];
			visited = new int[n][m];
			int k = 0;
			for(int i=0; i<n; i++)
			{
				for(int j=0; j<m; j++)
				{
					A[i][j] = Integer.parseInt(s2[k]);
					visited[i][j] = 0;
					k++;
				}
			}
			int min = 0;
			if(n > m)
			{
				min = m;
			}
			else
			{
				min = n;
			}
			caclSpiralPrint(A,visited,min,n,m);
		}
	}

	public static void caclSpiralPrint(int[][] A, int min, int n, int m)throws Exception
	{
		int flag = 1;
		int row = 0;
		int col = 0;
		int row_rev = 0;
		int col_rev = 0;
		for(int i=0; i<2*min; i++)
		{
			if(flag)
			{
				col = moveRow(A,row,m,row_rev);
				row_rev = !row_rev;
				flag = 0;
			}
			else
			{
				row = moveCol(A,col,n,col_rev);
				col_rev = !col_rev;
				flag = 1;
			}
		}
	}

	public static int moveRow(int[][] A, int row, int m, int row_rev)throws Exception
	{
		if(row_rev == 0)
		{
			for(int i=0; i<m-1; i++)
			{
				System.out.println(A[row][i]);
			}
		}
		else
		{
			for(int i=m-1; i>=0; i--)
			{
				System.out.println(A[row][i]);
			}
		}
		col = m-1;
		return col;
	}

	public static int moveCol(int[][] A, int col, int n)throws Exception
	{
		for(int i=)
	}
}