/*
Fizz Buzz

Challenge Description:

 Players generally sit in a circle. 
 The first player says the number 1, and each player says next number in turn. 
 However, any number divisible by X (for example, three) is replaced by the word fizz, and any divisible by Y (for example, five) by the word buzz. 
 Numbers divisible by both become fizz buzz
 A player who hesitates, or makes a mistake is eliminated from the game.

Write a program that prints out the final series of numbers where those divisible by X, Y and both are replaced by F for fizz, B for buzz and FB for fizz buzz. 
*/

import java.io.*;
import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main{

	public static void main(String[] args)throws IOException
	{
		File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;

		int X=0,Y=0,N=0;
		
        while ((line = in.readLine()) != null) {
            String[] lineArray = line.split(" ");
            if (lineArray.length > 0) {
                X = Integer.parseInt(lineArray[0]);
                Y = Integer.parseInt(lineArray[1]);
                N = Integer.parseInt(lineArray[2]);
			}
			//int X = Integer.parseInt(text);
			//X = input.nextInt();//0;//Integer.parseInt(text1[0]);
			//int Y = input.nextInt();//0;//Integer.parseInt(text1[1]);
			//int N = input.nextInt();//0;//Integer.parseInt(text1[2]);
			//String extra = text1[3];
			String result = "";
			for(int i=1;i<=N;i++)
			{
				if(i%X == 0 && i%Y != 0)
				{
					result = result + "F" + " ";
				}
				else if(i%X != 0 && i%Y == 0)
				{
					result = result + "B" + " ";
				}
				else if(i%X == 0 && i%Y == 0)
				{
					result = result + "FB" + " ";
				}
				else
				{
					result = result + Integer.toString(i) + " ";
				}
			}
			System.out.println(result);
		}
	}
}