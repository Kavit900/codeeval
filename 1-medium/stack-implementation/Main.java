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
			SimpleStack st = new SimpleStack();
			//System.out.println(s[s.length-1]);
			for(int i=0; i<s.length; i++)
			{
				st.push(s[i]);
				//System.out.println(st.peek());
			}
			int count = 0;
			String result = "";
			//System.out.println(st.peek());
			while(st.isEmpty() != true)
			{
				if(count%2 == 0)
				{	
					//System.out.println(st.pop());
					result += st.pop();
					result += " ";
					count++;
				}
				else
				{
					st.pop();
					count++;
				}
			}
			System.out.println(result.trim());
		}
	}

public interface Stack
{
	void push(Object item);

	Object pop();

	Object peek();

	int size();

	boolean isEmpty();
}

public static class SimpleStack implements Stack
{
	private LinkedList<Object> list = new LinkedList<Object>();

	public void push(Object item)
	{
		list.addFirst(item);
	}

	public Object pop()
	{
		return list.removeFirst();
	}

	public Object peek()
	{
		return list.getFirst();
	}

	public int size()
	{
		return list.size();
	}

	public boolean isEmpty()
	{
		return list.isEmpty();
	}
}

}