import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)throws Exception
	{
		File file = new File(args[0]);
		BufferedReader in = new BufferedReader(new FileReader(file));
		String line;

		QueryBoard qb = new QueryBoard();
		qb.initialize();
		while((line=in.readLine()) != null)
		{
			line = line.trim();
			String[] s = line.split(" ");
			String command = s[0];
			if(command.compareTo("SetCol") == 0)
			{
				int col = Integer.parseInt(s[1]);
				int value = Integer.parseInt(s[2]);
				qb.setCol(col,value);
			}
			else if(command.compareTo("SetRow") == 0)
			{
				int row = Integer.parseInt(s[1]);
				int value = Integer.parseInt(s[2]);
				qb.setRow(row,value);
			}
			else if(command.compareTo("QueryCol") == 0)
			{
				int col = Integer.parseInt(s[1]);
				System.out.println(qb.queryCol(col));
			}
			else if(command.compareTo("QueryRow") == 0)
			{
				int row = Integer.parseInt(s[1]);
				System.out.println(qb.queryRow(row));
			}
		}
	}
}

class QueryBoard
{
	int[][] board;
	public QueryBoard()
	{
		board = new int[256][256];
	}

	public void initialize()
	{
		for(int i=0; i<256; i++)
		{
			for(int j=0; j<256; j++)
			{
				board[i][j] = 0;
			}
		}
	}

	public void setCol(int col, int value)
	{
		for(int i=0; i<256; i++)
		{
			board[i][col] = value;
		}
	}

	public void setRow(int row, int value)
	{
		for(int i=0; i<256; i++)
		{
			board[row][i] = value;
		}
	}

	public int queryCol(int col)
	{
		int sum = 0;
		for(int i=0; i<256; i++)
		{
			sum += board[i][col];
		}
		return sum;
	}

	public int queryRow(int row)
	{
		int sum = 0;
		for(int i=0; i<256; i++)
		{
			sum += board[row][i];
		}
		return sum;
	}
}