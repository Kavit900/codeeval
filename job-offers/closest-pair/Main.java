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
			int n = 0;
			
				String[] s = line.split("");
				System.out.println(line);
				if(s.length == 1)
				{
					System.out.println(s[0]);
					n = Integer.parseInt(s[0]);
					if(n == 0)
					{
						break;
					}
				}
				else
				{
					//System.out.println(n);
					Point[] points = new Point[n];
					for(int i=0; i<n; i++)
					{
						//System.out.println(s[0]);
						points[i].x = Integer.parseInt(s[0]);
						points[i].y = Integer.parseInt(s[2]);

					}
					double min = 10000;
					for(int i=0; i<n ;i++)
					{
						for(int j=i+1; j<n; j++)
						{
							int x = points[i].x - points[j].x;
							int y = points[i].y - points[j].y;
							double dist = Math.sqrt(x*x+y*y);
							if(min > dist)
							{
								min = dist;
							}
						}
					}
					if(min == 10000)
					{
						System.out.println(min);
					}
					else
					{
						System.out.println("INFINITY");
					}
				}
			
		}
	}
}

class Point
{
	int x,y;

	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}