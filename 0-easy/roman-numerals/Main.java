import java.io.*;

/**
 * Convert integers to roman numerals.
 *
 * Mapping:
 *  I 1
 *  V 5
 *  X 10
 *  L 50
 *  C 100
 *  D 500
 *  M 1000
 *
 * Remember to deal with the corner cases of 4 and 9.
 */
public class Main
{
    public static void main (String[] args)throws Exception
    {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;

        while ((line = in.readLine()) != null) {
            System.out.println(integerToRomanNumeral(Integer.parseInt(line.trim())));
        }

        in.close();
    }

    public static String integerToRomanNumeral(int n)throws Exception
    {
        int thousands = n/1000;
        n %= 1000;
        int hundreds = n/100;
        n %= 100;
        int tens = n/10;
        n %= 10;
        int ones = n;

        StringBuilder sb = new StringBuilder();

        sb.append(thousandsToRomanNumeral(thousands));
        sb.append(hundredsToRomanNumeral(hundreds));
        sb.append(tensToRomanNumeral(tens));
        sb.append(onesToRomanNumeral(ones));

        return sb.toString();
    }

    /**
     * Convert thousand digit to roman numeral.
     * @param thousands integer on range [0, 3].
     */
    private static String thousandsToRomanNumeral(int thousands)throws Exception
    {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < thousands; i++) {
            sb.append("M");
        }

        return sb.toString();
    }
    private static String hundredsToRomanNumeral(int hundreds)throws Exception
    {
        switch (hundreds) {
            case 0:
                return "";
            case 1:
                return "C";
            case 2:
                return "CC";
            case 3:
                return "CCC";
            case 4:
                return "CD";
            case 5:
                return "D";
            case 6:
                return "DC";
            case 7:
                return "DCC";
            case 8:
                return "DCCC";
            case 9:
                return "CM";
        }
        return "";
    }
    private static String tensToRomanNumeral(int tens)throws Exception
    {
        switch (tens) {
            case 0:
                return "";
            case 1:
                return "X";
            case 2:
                return "XX";
            case 3:
                return "XXX";
            case 4:
                return "XL";
            case 5:
                return "L";
            case 6:
                return "LX";
            case 7:
                return "LXX";
            case 8:
                return "LXXX";
            case 9:
                return "XC";
        }
        return "";
    }

    private static String onesToRomanNumeral(int ones)throws Exception
    {
        switch (ones) {
            case 0:
                return "";
            case 1:
                return "I";
            case 2:
                return "II";
            case 3:
                return "III";
            case 4:
                return "IV";
            case 5:
                return "V";
            case 6:
                return "VI";
            case 7:
                return "VII";
            case 8:
                return "VIII";
            case 9:
                return "IX";
        }
        return "";
    }
}