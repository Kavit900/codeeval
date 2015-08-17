import java.io.*;
import java.util.*;

public class Main
{
    public static void main (String[] args)throws Exception
    {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;


        while ((line = in.readLine()) != null) {
            LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();

            line = line.trim();
            String[] lineArray = line.split(",");


            for (String s : lineArray) {
                int n = Integer.parseInt(s);

                if (!lhs.contains(n)) {
                    lhs.add(n);
                }
            }

            Iterator<Integer> iterator = lhs.iterator();

            while (true) {
                System.out.print(iterator.next());

                if (iterator.hasNext()) {
                    System.out.print(",");
                } else {
                    System.out.println();
                    break;
                }
            }
        }
    }
}