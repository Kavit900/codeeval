import java.io.*;

public class Main
{
	public static void main(String[] args)throws Exception
	{
		for(int i=1; i<=12; i++)
		{
			for(int j=1; j<=12; j++)
			{
				System.out.print(String.format("%4d",i*j));
			}
			System.out.println();
		}
	}
}